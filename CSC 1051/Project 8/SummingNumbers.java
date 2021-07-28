import java.io.*;
import java.util.Scanner;

public class SummingNumbers {
 public static void main (String [] args) throws IOException{
 
   Scanner scan = new Scanner(System.in);
   
   
   System.out.print("Enter number file: ");
   String x = scan.nextLine();
   
   FileReader input = new FileReader(x);
   BufferedReader inBuff = new BufferedReader(input);
   
   System.out.println("Reading numbers from " + x);
   
   String line = inBuff.readLine();
   
   String[] numbers = line.split(" ");
   
    for(String num : numbers){
      System.out.print(num + " ");
    
    
    
    }
    System.out.println();
   
   int size = numbers.length;
   
   int sum = 0;
   int value;
   
  
   
   for( int i = 0; i < size; i++){
     value = Integer.parseInt(numbers[i]);
     sum += value;
   }
     
   System.out.println("Total is " + sum);
   
   inBuff.close();
 }
}