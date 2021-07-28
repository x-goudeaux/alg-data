
import java.util.Scanner;

public class WhileTriangle {
   public static void main(String [] args){
      Scanner scan = new Scanner(System.in);
      
      System.out.println("Enter a value and draw a triangle!");
      int i = 1; //i represents the n routine and then...
      while (i <= 5){//the while loop will run its program as i is incremented and as long as it satisfies its condition
      
         System.out.println();
         //prompts for an integer less than 10 or 'n'
         System.out.print("Enter an integer (less than 10): ");
         int rows = scan.nextInt();
         
         if (rows > 10){
            System.out.println("Value must be less than 10.");
            i++;
         
            }
         else if (rows < 0){
            System.out.println("Value must be positive.");
            i++; 
         
            }
         else{
            int line = 1;
            while(line <= rows){
               int a = 1;
               while(a <= line){
                  System.out.print(line);
                  a++;
                                }
               
               System.out.println();
               line++;
            
            }
            i++;
          }
      }
      System.out.println();
      System.out.println("Thank you for drawing!");
   }
}
               
       
              
          
         
         
         
            
         
 