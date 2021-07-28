import java.util.ArrayList;


public class WordChanger{
    public static void main (String[] args){
        // Step 1:
        // Create an empty Arraylist object called words, and copy the
        // strings from the command line args to the Arraylist object
        ArrayList<String> words = new ArrayList<String>();
        
        for( String arg : args){
            words.add(arg);
        
        }
        
        // Step 2:
        // Print the values in the ArrayList object.
        System.out.print("Original list: ");
        for (String element : words){
         System.out.print(element + " ");
            
        }
        System.out.println();
        
        
        // Step 3:
        // For every element in ArrayList object words: 
        
        // Reverse the singular words and capitalize the plural words.
        
         int size = words.size();
         for (int j = 0 ; j < size; j++){
            String element = words.get(j);
             
            if (element.endsWith("s")){
               words.set(j,capitalize(element)); 
               
            }
            else {
               words.set(j,reverse(element));
            
         
            }
         
         }
        
        
        // Step 4:
        // Print the modified values in the ArrayList object.
         System.out.print("Modified list: ");
         for (String element : words){
         System.out.print(element + " ");
            
        }

    }
    
    
    // Finish implementing the capitalize method
    public static String capitalize(String s){
      return s.toUpperCase();
      
        
    }
    
    // Finish implementing the reverse method
    public static String reverse(String s){
      int length = s.length();
      String rev = "";
      for (int i = length - 1 ; i >= 0 ; i--){ 
         rev += s.substring(i , i + 1);       

    
      }
      return rev; 


    }
}