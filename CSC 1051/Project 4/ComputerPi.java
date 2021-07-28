import java.util.Scanner;
import static java.lang.Math.*;

public class ComputerPi {
   public static void main (String [] args) {
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter the tolerance value: ");
      double tolerance = scan.nextDouble(); //tolerance input
      double estimatePI = 0.0; //estimated PI with tolerance input level
      
      
      
      if(tolerance > 0){
      
         int n = 0;
         while (abs(4.0 * estimatePI - PI) >= tolerance){
         
         
         
            estimatePI += pow(-1,n) / (2 * n + 1); // the leibniz formula for PI
            n++;
            
            
             
        }
             System.out.println("The number of terms is " + n);
             System.out.println("The estimate PI is " + 4.0 *estimatePI);
                
         } 
        
       else{
         System.out.println("Tolerance must be positive!");
       }
    }
}

            
         
      
      
      
      
      
      
      
      
      
      
      
      
       
      
      
      
      


      
      
      