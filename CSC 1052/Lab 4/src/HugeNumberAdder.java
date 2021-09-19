/**
 * HugeNumberAdder that adds two unlimited-length integers,
 * represented as strings. 
 * @author Xavier Goudeaux
 *
 */
public class HugeNumberAdder
{
	/**
	 * Adds together two unlimited-length integers, represented as
	 * strings, returning the sum of the two. The values might be
	 * of different lengths, but should be assumed to always have
	 * a non-negative value.
	 * @param number1 first number (string) to add
	 * @param number2 second number (string) to add
	 * @return string representing the sum of the two numbers
	 */
	public static String add(String number1, String number2)
	{	
		int charNum1;
		int charNum2;
		int carry = 0;
		int sum;
		String newNum = null;
		String added = "";
		
		if(number1.length() > number2.length()) {
			for(int i = number1.length() - 1; i >= 0 ; i--) {
				for(int j = number2.length() - 1; j >= 0; j--) {
					charNum1 = number1.charAt(i) - '0' + carry;
					charNum2 = number2.charAt(j) - '0';
					
					if(charNum1 + charNum2 > 9) {
						carry++;
						sum = (charNum1 + charNum2) - 10;//turn to string
					}
					else {
						carry = 0;
						sum = (charNum1 + charNum2);
					}
					newNum = "" + sum;
					added += newNum;
					
				}
			}
		}
		
		return added;
	
		
	}
	
	/**
	 * Main method to test the add method above. No changes should
	 * be made to this method other than adding additional tests.
	 */
	public static void main(String[] args)
	{
		String n1 = "9746354637282847561872929184362084759202";
		String n2 = "74521000284565";
		String total = add(n1, n2);

		System.out.print(n1 + " + " + n2 + " = ");
		System.out.println(total);
		System.out.println();
		
		String n3 = "99999999999999999999999999999999999999999965";
		String n4 = "35";
		total = add(n3, n4);
		
		System.out.print(n3 + " + " + n4 + " = ");
		System.out.println(total);
		System.out.println();
		
		String n5 = "2";
		String n6 = "2";
		total = add(n5, n6);
		
		System.out.print(n5 + " + " + n6 + " = ");
		System.out.println(total);
		System.out.println();
		
		String n7 = "9223372036854775807";
		String n8 = "10000000000000000000000000000000000000000000";
		total = add(n7, n8);

		System.out.print(n7 + " + " + n8 + " = ");
		System.out.println(total);
		System.out.println();
	}

}
