import java.util.Scanner;

public class ReverseString{
   public static void main(String [] args){
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter a string: ");
      String string = scan.nextLine();
      
      int length = string.length();
      
      if (length >= 2){
          System.out.println();
          System.out.print("Length: " + length);
      
          System.out.println();
          System.out.print("First character: " + string.charAt(0));
      
          System.out.println();
          System.out.print("Last character: " + string.charAt(length-1));
          
         
         System.out.println();
         System.out.print("Reversed string: ");
          
          for(int i = length-1; i >= 0; i--){
         
          System.out.print(string.charAt(length-1));
          length--;
         
          
          
          
          }
          
          
      
      }
      
   }
}
     
      
      
      