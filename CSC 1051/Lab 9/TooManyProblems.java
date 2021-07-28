//////////////////////////////////////////////////////////////////
// Lab 9
// Programmer: Xavier Goudeaux
// Date: 7/27/21
// Description: Demonstrates exception handling
//////////////////////////////////////////////////////////////////
import java.io.FileReader;
import java.io.FileNotFoundException;

public class TooManyProblems
{
    public static void main(String[] args)
    {
        // ArrayIndexOutOfBoundsException
        String whatever = null;
        String[] testArray = {"Mario" , "Sonic" , "Link", "Kirby"};
        
        FileReader input = new FileReader("nothing.txt");
        BufferedReader reader = new BufferedReader(input);
        
        int result;
        int num = 0;
        
        String string = "one"; 
        
        
        try
        {       
         String gamer = testArray[5];
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
         System.out.println("Array index is out of bounds!");
        }
        
        // NullPointerException
        try
        {
         System.out.println("I opened the box and I found " + whatever);
        }
        catch (NullPointerException e)
        {
         System.out.println("There's nothing there!");
        }
        
        // ArithmeticException
        try
        {
         result = -1000/num;
        }
        catch (ArithmeticException e)
        {
            System.out.println("Can't divide a number by 0!");
        }
        
        // FileNotFoundException
        try
        {
         while (reader.hasNextInt())
            int number = reader.nextInt();
        
        }
        catch (FileNotFoundException e)
        {
            System.out.println("There's no file by that name!");
        }
        
        // NumberFormatException
        try
        {
         int n = Integer.parseInt(string)
        }
        catch (NumberFormatException e)
        {
            System.out.println("That's not a number!");
        }
        
        // Programmer's Choice
        try
        {
        
        }
        catch (Exception e)
        {
            System.out.println("Something bad happened: " + e);
            
            // "rethrow" the exception here (use the throw statement)
            // to demonstrate exception propagation
        }
    }
}