// Be sure to put your header comment here: Xavier Goudeaux
import java.lang.Math;

public class ArrayWords {
    // Create other methods here if needed
    
    public static void main (String[] args) {
        String sentence = "Java is a class-based, object-oriented programming language " +
            "that is designed to have as few implementation dependencies as possible. It " +
            "is a general purpose programming language intended to let application " +
            "developers write once, run anywhere (WORA), meaning that compiled Java " +
            "code can run on all platforms that support Java without the need for recompilation.";
        
        // Your code goes here.
        
        String[] words = sentence.split(" ");
        
        int total = words.length;
        
        System.out.println("Total words: " + total);
        
        String longest = " ";
        String shortest = " ";
        
        for( int i = 0; i < total -1 ; i++){
        
         if(words[i].length() >= longest.length())
            longest = words[i];
         if(words[i].length() <= shortest.length())
            shortest = words[i];
        }
         
        System.out.println("Longest word: " + longest);
        System.out.println("Shortest word: " + shortest);
        
        
    }
}
        
            
         
            
            
         
            
         
            
        
            
        
        
        
        
       
        
     

