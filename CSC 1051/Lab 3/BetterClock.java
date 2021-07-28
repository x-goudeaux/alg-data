import java.util.Scanner; //Scanner object used to read input

public class BetterClock { 
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in); //Operator used to create scanner 
      
      System.out.print("Please enter Hours: "); //Section for hours prompt and input     
      int hours = scan.nextInt();
      
      if (hours > 23){ // if the number of hours exceeds 23, then this string is printed 
         System.out.print("Error: hours can be no greater than 23");
         return;
      }
      
      if (hours < 0){  //if hours are less than 0 i.e. a negative number, then this string is printed
         System.out.print("Error: hours cannot be negative");
         return;  // return exits the program
      }
         
      System.out.print("Please enter Minutes: ");
      int minutes = scan.nextInt();
      
      if (minutes > 59){ // if minutes are greater than 59, then this string is printed
         System.out.print("Error: minutes can be no greater than 59");
         return;
      }
      
      if (minutes < 0){
         System.out.print("Error: minutes cannot be negative");
         return;
      }
      
      System.out.print("Please enter Seconds: ");     
      int seconds = scan.nextInt();
      
      if (seconds > 59){
        System.out.print("Error: seconds can be no greater than 59");
        return;
      }
      
      if (seconds < 0){
         System.out.print("Error: seconds cannot be negative");
         return;
      }
      
      //Creates a clock based on user input for individual time variables
      System.out.println("The time you entered is " + hours + ":" + minutes + ":" + seconds);
      
      //total seconds since midnight
      int total = ((hours * 3600) + (minutes *60) + seconds);
      System.out.println("Seconds since midnight: " + total);
   }
}   
