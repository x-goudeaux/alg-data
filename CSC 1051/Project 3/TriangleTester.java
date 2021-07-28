/*
   Name: Xavier J. Goudeaux 
   
   Date: 6/22/2021
   
   Purpose: Program tests input integers and determines
   if they form a triangle, and if so, thw type of triangle 
   that is formed with those inputs based on different
   conditions.
 :
*/


import java.util.Scanner;

public class TriangleTester{
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter side one: ");          
      
      int a = scan.nextInt();
      
      System.out.print("Enter side two: ");
      int b = scan.nextInt();                        
      
      System.out.print("Enter side three: ");
      int c = scan.nextInt();
                                                      
      //condition for a Triangle
      if ( a + b > c && a + c > b && b + c > a){ 
         
         if ( a == b && a == c && b == c) { // condition for equilateral triangles
            System.out.print("That's an Equilateral Triangle!");
            return;
         }
         
         if ( a == b ^ b == c ^ a == c){ // condition for isosceles triangles
            System.out.print("That's an Isosceles Triangle!");
            return;
         }
         
         if ( Math.pow(a,2) + Math.pow(b,2) == Math.pow(c,2)){// condition for right triangles
            System.out.print("That's a Right Triangle!");
            return;
         }
         
         if ( a != b && b != c && a != c){ // conditon for scalene triangles
            System.out.print("That's a Scalene Triangle!");
            return;
         }
      }
      
      else { //if the condtion above isn't met, then the inputs do NOT create a triangle
      System.out.print("That's NOT a triangle!");
         return; 
      
   
      }
   }
}
