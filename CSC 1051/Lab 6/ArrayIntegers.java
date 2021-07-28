import java.util.Scanner;

public class ArrayIntegers{
   public static void main (String[]args){
      Scanner scan = new Scanner(System.in);
      
      System.out.print("How many numbers do you want to enter? ");
      int num = scan.nextInt();
      
      int[] numbers = new int[num];
      
      for (int i = 0 ; i < num ; i++){
         System.out.print("Enter number > ");
         numbers[i] = scan.nextInt();
      
      
      
      }
      
      int sum = 0;
      
      for (int n : numbers){
         sum += n;
      
      }
      
      int average = sum / num;
      
      System.out.println("The average is " + average + ".");
      
      int greatCount = 0;
      
      for (int j : numbers){
         if ( j > average)
            greatCount++;
      }
      
      int lessCount = 0;
      
      for (int j : numbers){
         if ( j < average)
            lessCount++;
      }
      
      int equalCount = 0;
      
      for (int j : numbers){
         if ( j == average)
            equalCount++;
      }
      
      System.out.println("Count less than average: " + lessCount);  
      System.out.println("Count equal to average: " + equalCount); 
      System.out.println("Count greater than average: " + greatCount); 
   }
}    