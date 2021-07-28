import java.util.Scanner; //Scanner object used to read input

public class Clock { 
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in); //Operator used to create scanner 
      
      System.out.print("Please enter Hours: ");       
      int hours = scan.nextInt();
      
      System.out.print("Please enter Minutes: ");
      int minutes = scan.nextInt();
      
      System.out.print("Please enter Seconds: ");     
      int seconds = scan.nextInt();
      
      //Creates a clock based on user input for individual time variables
      System.out.println("The time you entered is " + hours + ":" + minutes + ":" + seconds);
      
      //total seconds since midnight
      int total = ((hours * 3600) + (minutes *60) + seconds);
      System.out.println("Seconds since midnight: " + total);
   }
}   
