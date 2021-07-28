import java.util.Scanner; 

public class Divider{
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter the dividend: ");
      double dEnd = scan.nextDouble();
           
      System.out.print("Enter the divisor: ");
      double dSor = scan.nextDouble();
      
      double result = dEnd / dSor;
      
      if (dSor == 0){
         System.out.print("Error: you cannot divide by zero");
      }
      
      else{
          System.out.print("Result is: " + result);
      }
   }
}     
         
         
      