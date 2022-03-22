



import java.util.Scanner;
import package.GuessMyNumber;


public class GameRoom{
   public static void main(String [] args){
      Scanner scan = new Scanner(System.in);
   
   
      System.out.println("Let's play Guess My Number!");
      GuessMyNumber x = new GuessMyNumber();
      
      System.out.println();
      System.out.println("I've chosen a number between 1 and 100.");
      
      int guessCount = 0;
      int n; 
      boolean m;
      
      
      do
      {
         System.out.print("Guess what it is: ");
         n = scan.nextInt();
      
         m = x.Guess(n);
         guessCount++;
         
   
   
   
      }
      while(m != true);
      System.out.println("You got it in " + guessCount + " guesses.");
  }
}
  
   
      
