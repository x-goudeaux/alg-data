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
		String large;
		String small;
		int charNum1;
		int charNum2;
		int carry = 0;
		int sum;
		String newNum = "";
		
		if(number1.length() >= number2.length()) {
			large = number1;
			small = number2;
		}
		else {
			large = number2;
			small = number1;
		}
	
	    for(int i = large.length()-1, j = small.length()-1; i >= 0; i--){
		      	
			  if(j >= 0) {
				  charNum1 = large.charAt(i) - '0' + carry;
		         
				  charNum2 = small.charAt(j) - '0';
							
				  sum = charNum1 + charNum2;
							
				  if(sum > 9) {
					  sum -= 10;
					  carry = 1; 
				  }
				  else {
					  carry = 0;
				  }
				  newNum = sum + newNum;
				  j--;
			   }
			   else{
				  charNum1 = large.charAt(i) - '0' + carry;
				  sum = charNum1 + 0;
				  
				  if(sum > 9) {
					  sum -= 10;
					  carry = 1; 
				  }
				  else {
					  carry = 0;
				  }
				  newNum = sum + newNum;
			  }
		 }
	    newNum = (carry == 1) ? carry + newNum : newNum;
		return newNum;
	}
	
	/**
	 * Main method to test the add method above. No changes should
	 * be made to this method other than adding additional tests.
	 */
	public static void main(String[] args)
	{
		String n1 = "9746354637282847561872929184362084759202";
		String n2 =                           "74521000284565";
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
		
		String n7 = "112600";
		String n8 = "122663";
		total = add(n7, n8);

		System.out.print(n7 + " + " + n8 + " = ");
		System.out.println(total);
		System.out.println();
		
		String n9 = "9";
		String n10 = "991";
		total = add(n9, n10);

		System.out.print(n9 + " + " + n10 + " = ");
		System.out.println(total);
		System.out.println();
		
		String n11 = "609";
		String n12 = "2021";
		total = add(n11, n12);

		System.out.print(n11 + " + " + n12 + " = ");
		System.out.println(total);
		System.out.println();
	}

}
