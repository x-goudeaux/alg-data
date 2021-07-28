import java.util.Scanner; 

public class InsideOut{
   public static void main (String [] args){
      Scanner scan = new Scanner(System.in);
      int lines;
       
      
      do
      {
       System.out.print("Enter the number of lines: ");
       lines = scan.nextInt();
       
       if (lines > 0){
            
        
        int space = lines - 1;
        
        for (int j = 1; j <= lines; j++){
            for (int i = 1; i <= space; i++){
                System.out.print(" ");
            }
            space--;
            
            for (int i = 1; i <= 2 * j - 1; i++){
                System.out.print("#");                
            }
            System.out.println("");
        }
        space = 1;
        for (int j = 1; j <= lines - 1; j++) {
            for (int i = 1; i <= space; i++){
                System.out.print(" ");
            }
            space++;
            
            for (int i = 1; i <= 2 * (lines - j) - 1; i++)  {
                System.out.print("#");
            }
            System.out.println("");
        }            
         
           }
         
         else{
            System.out.println("Input number should be positive.");
            
         }
      }
      while(lines <= 0);
    }
}