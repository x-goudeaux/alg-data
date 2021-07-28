import java.util.Random;
import java.util.Scanner;

public class LetterFlip{
   public static void main(String [] args){
      Scanner scan = new Scanner(System.in);
      Random generator = new Random();
      
      int n = generator.nextInt(19)+1; // random string length generator
      int num;
      String alph;
      
      String userString; // user input variable 
     
      do
      {
         System.out.print("Enter string of length " + n + ": ");
         userString = scan.nextLine();
         
         if(userString.length() == n){ //condition for when the input length = required length
            System.out.print("String after case flip: ");
            
            for (int i = 0 ; i <= n - 1; i++){ // loop that starts at index 0 and cycles until it reaches the end of string (str.length -1)
            
               num = userString.charAt(i); //type casting provides a value for every Unicode character. identifies specific character @ index i
               
               alph = userString.substring(i,i+1);//char cannot be dereferenced".(?) utilized substrings to grab characters and not the actual index
              
               if( num >= 65 && num <= 90){//range of value for uppercase letters
                  System.out.print(alph.toLowerCase());
               
               }
               else if( num >= 97 && num <= 122){//range of value for lowercase letters
                  System.out.print(alph.toUpperCase());
               }
               else{//other symbols
                  System.out.print(userString.charAt(i));
               }
               
            
            }
      
         }
         else{//error statement if user inputs string with wrong length
            System.out.println("That string is the wrong length!");
            System.out.println();
            
         }
      }
      while ( userString.length() != n); //does the above body of statements while condtion is true.
   }
}
      