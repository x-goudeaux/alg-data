

public class GuessMyNumber{
   
   
   
   private int targetNumber;
   private int guessNumber; 
   
   public GuessMyNumber() {
   
      targetNumber = (int) (Math.random()*100)+1; 
      
   
   }
      
   private boolean isCorrect(){
      return (guessNumber == targetNumber);
       
  
   
   }
   
   private void showHint(){
   
      if(guessNumber < targetNumber){
        System.out.println("Too low!");
      } 
      if(guessNumber > targetNumber){
        System.out.println("Too high!");
      }
   
   }
   
   public boolean Guess(int guess){ //intakes int parameter and returns a boolean value
   
      guessNumber = guess;
      
      
      if( isCorrect())
          System.out.println("That's it!");
      else 
         showHint();
      
      return (isCorrect());
      
   }
   
}
   