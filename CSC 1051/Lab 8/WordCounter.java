import java.io.*;
import java.util.Scanner;

public class WordCounter {
   public static void main (String [] args) throws FileNotFoundException {
      File file = new File("goodwriting.txt");
      Scanner in = new Scanner(file);
      
      int wordCount = 0;
      int tCount = 0;
      String string;
      
      while(in.hasNext()){
      
         wordCount++;
         
         string = in.next();
         String x = string.substring(0 , 1);
         
         if(x.equalsIgnoreCase("t")){
         
         tCount++;
         
         
         }
      }
      System.out.println("Filename: " + file); 
      System.out.println("Count of words: " + wordCount);
      System.out.println("Count of T words: " + tCount);
    }
}
      
      
      
      
      
      
      
      
      
      