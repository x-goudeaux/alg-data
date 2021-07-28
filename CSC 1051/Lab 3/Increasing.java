import java.util.Scanner;

public class Increasing {
   public static void main (String[] args){
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter an integer: ");
      int num1 = scan.nextInt();
      
      System.out.print("Enter an integer: ");
      int num2 = scan.nextInt();
      
      System.out.print("Enter an integer: ");
      int num3 = scan.nextInt();
      
      if (num1 < num2 && num2 < num3){
         System.out.println("The numbers " + num1 + ", " + num2 + ", and " + num3 + " are strictly increasing.");
      }
      
      else{
         System.out.println("The numbers " + num1 + ", " + num2 + ", and " + num3 + " are not strictly increasing.");
      }
   }
}



