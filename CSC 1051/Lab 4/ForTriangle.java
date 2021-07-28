import java.util.Scanner;

public class ForTriangle {
   public static void main(String [] args){
      Scanner scan = new Scanner(System.in);
      
      System.out.println("Enter a value and draw a triangle!");
      
      for (int i =1; i <= 5; i++){//the for loop will run its program as i is incremented and as long as it satisfies its condition
      
         System.out.println();
        
         System.out.print("Enter an integer (less than 10): ");
         int rows = scan.nextInt();
         
         if (rows >= 10){
            System.out.println("Value must be less than 10.");
            
         
            }
         else if (rows < 0){
            System.out.println("Value must be positive.");
             
         
            }
         else{
            
            for (int line = 1 ; line <= rows; line++){
            
               for (int a = 1 ; a <= line ; a++){
                  System.out.print(line);
               }
               System.out.println();
               
            }
           
         }
       }
       System.out.println();
       System.out.println("Thank you for drawing!");
    }
}