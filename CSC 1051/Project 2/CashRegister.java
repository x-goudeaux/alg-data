/* Name: Xavier Goudeaux   Purpose: Program that implements
 * Date: 6/15/21           a proposed algorithm for outputting the number 
 *                         and types of coins needed for a specific input amount
 *                         (in cents).
 *                         
 *
 ***************************************************************
 */
 
 import java.util.Scanner;
 
 public class CashRegister
 { 
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      
      //user inputs amount cash (in cents) into algorithm
      System.out.print("Enter an amount (in cents): ");
      int amount = scan.nextInt();
      
      System.out.println("Coins needed for " + amount + " cents:");
      
      //quarters output
      int q = amount / 25;
      int amount1 = amount % 25;
      
      if (q == 1){
      System.out.println(q + " quarter");     
      }
      else{
      System.out.println(q + " quarters");    
      }                                       
      
      //dimes output
      int d = amount1 / 10;
      int amount2 = amount1 % 10;
      
      if (d == 1){
      System.out.println(d + " dime");
      }
      else{
      System.out.println(d + " dimes");
      }
      
      //nickels output
      int n = amount2 / 5;
      int amount3 = amount2 % 5;
      
      if (n == 1){
         System.out.println(n + " nickel");
      }
      else{
         System.out.println(n + " nickels");
      }
     
      //pennies output
      int p = amount3 / 1;
      
      if (p == 1){
         System.out.println(p + " penny");
      }
      else{
         System.out.println(p + " pennies");
      }
      
   }  
   
 }
      

     
   


      