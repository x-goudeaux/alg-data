import java.util.Stack;

/**
 * MatchingPairs program that checks for matching pairs of four types
 * of brackets, and reports whether all brackets matches or identifies
 * the first missing or mismatched bracket it finds.
 * 
 * @author Xavier Goudeaux
 *
 */
public class MatchingPairs
{
	/**
	 * Checks the input string for matching left and right brackets.
	 * The four types of brackets are parentheses (), square brackets [],
	 * curly braces {} and angle brackets <>. Left and right brackets
	 * must match either at corresponding levels of nesting to count as
	 * matching. For example, "([])" all matches while "([)]" does not.
	 * Possible return values are:
	 *   "Everything matched!" or 
	 *   "Mismatch! Unmatched B" (where B is one of (, ), [, ], {, }, <, >).
	 * All other characters other than the four types of left and right
	 * brackets should be ignored.
	 * @param str the expression to check for matching brackets.
	 * @return returns the result of checking
	 */
	
	
	public static String checkMatches(String str)
	{	
		Stack<Character> match = new Stack<Character>();
	    char symbol;
	    String message = "Everything matched!";
	    char check;
	    
		
		loop: for(int i = 0; i < str.length(); i++) {
			symbol = str.charAt(i);
			
			if(symbol == '(' || symbol == '{' || symbol == '[' || symbol == '<') {
				match.push(symbol);
				continue;
			}
			if(match.isEmpty()) {
				return "Mismatch! Unmatched " + symbol;
			}
			
			
			switch(symbol) {
				case ')':
					check = match.pop();
					if(check == '{' || check == '[' || check == '<') {
						message = "Mismatch! Unmatched " + symbol;
						break loop;
					}
					break;
				case '}':
					check = match.pop();
					if(check == '(' || check == '[' || check == '<') {
						message = "Mismatch! Unmatched " + symbol;
						break loop;
					}
					break;
				case ']':
					check = match.pop();
					if(check == '(' || check == '{' || check == '<') {
						message = "Mismatch! Unmatched " + symbol;
						break loop;
					}
					break;
				case '>':
					check = match.pop();
					if(check == '{' || check == '[' || check == '(') {
						message = "Mismatch! Unmatched " + symbol;
						break loop;
					}
					break;
			}
		}
		if(!match.isEmpty() && str.length() == 1) {
			return "Mismatch! Unmatched " + str.charAt(0);
		}
	
	    return message;
		
		
	}
	
	public static void main(String[] args)
	{
		// 10 test expressions
		String[] expressions =
			{ 
				"(((hello)))",
				"{a[b(c<d>e)f]g}",
				"(",
				"}",
				"(]",
				"}{",
				"{[(>}",
				"([)]",
				"<title></title>",
				"<(({[]})({<>})>"
			};
		// 10 expected output for above 10 test expressions
		String[] expected =
			{
				"Everything matched!", 
				"Everything matched!",
				"Mismatch! Unmatched (",
				"Mismatch! Unmatched }",
				"Mismatch! Unmatched ]",
				"Mismatch! Unmatched }",
				"Mismatch! Unmatched >",
				"Mismatch! Unmatched )",
				"Everything matched!",
				"Mismatch! Unmatched >"
			};
		
		for (int i = 0; i < expressions.length; i++)
		{
			System.out.println("\nChecking: " + expressions[i]);
			System.out.println("Expect: " + expected[i]);
			System.out.println("Actual: " + checkMatches(expressions[i]));
		}
	}

}
