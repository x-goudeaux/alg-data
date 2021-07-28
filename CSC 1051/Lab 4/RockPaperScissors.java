import java.util.Scanner; 
import java.util.Random;

public class RockPaperScissors{
   public static void main(String [] args){
      Scanner scan = new Scanner(System.in);
      Random generator = new Random();
      
      System.out.println("Let's play Rock, Paper, Scissors!");
      String again;
      
      
      
      do
      {
         
    
        
         int num = generator.nextInt(3) + 1; //random n from 1 to 3
         
         String computer; 
         if (num == 1)
             computer = "rock";
             
         else if (num == 2)
             computer = "paper";
         
         else 
             computer = "scissors";
         
         String choice;
         System.out.print("What do you have? ");
         choice = scan.next();
         
        
         if(choice.equalsIgnoreCase("rock") ^ choice.equalsIgnoreCase("paper") ^ choice.equalsIgnoreCase("scissors")){

         
            System.out.println("Computer has " + computer);
         
            if(computer.equalsIgnoreCase(choice))
               System.out.println("It's a draw!");
            
            
            if (choice.equalsIgnoreCase("rock"))
               if (computer == "paper")
                  System.out.println("You lose!");
            
            if (choice.equalsIgnoreCase("rock"))
               if (computer == "scissors")
                  System.out.println("You win!");
               
            if (choice.equalsIgnoreCase("paper"))
               if (computer == "scissors")
                  System.out.println("You lose!");
            
            if (choice.equalsIgnoreCase("paper"))
               if (computer == "rock")
                  System.out.println("You win!");
               
            if (choice.equalsIgnoreCase("scissors"))
               if (computer == "rock")
                  System.out.println("You lose!");
            
            if (choice.equalsIgnoreCase("scissors"))
               if (computer == "paper")
                  System.out.println("You win!");
         }                
         else{
            System.out.println("That's not a valid choice!");
         }
         
                 
         
         
         System.out.println();
         System.out.print("Play again (y/n)? ");
         again = scan.next();
         System.out.println();
         
         
          
      }
      while (again.equalsIgnoreCase("y"));
      
      System.out.println("Nice playing with you!");
      
      
      
    }
 }
