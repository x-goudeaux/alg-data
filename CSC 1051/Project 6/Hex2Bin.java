import java.util.Scanner;

public class Hex2Bin {
   public static void main(String [] args){
      Scanner scan = new Scanner(System.in);
   
      
      String[] hexBits = { "0000", "0001", "0010", "0011",
                        "0100", "0101", "0110", "0111",
                        "1000", "1001", "1010", "1011",
                        "1100", "1101", "1110", "1111" };
                     
      System.out.print("Enter a hexadecimal value: ");
      String hex = scan.nextLine();
      
     
      System.out.print("The equivalent binary list is:");
      
      char x;   
      int dec; 
      
      for (int i = 0; i < hex.length(); i++){
           x = hex.charAt(i);
           dec = hex2Dec(x);
           System.out.print(" " + hexBits[dec]);
         
      }   
         
         
      
      
   }
      
         
         
   
   static public int hex2Dec(char hexDigit){
         
         int hexDec = 0;
         switch(hexDigit){
            case '0':
               hexDec = 0 ;
               break;
            case '1':
               hexDec = 1 ;
               break;
            case '2':
               hexDec =  2;
               break;
            case '3':
               hexDec =  3;
               break;
            case '4':
               hexDec =  4;
               break;
            case '5':
               hexDec =  5;
               break;
            case '6':
               hexDec =  6;
               break;
            case '7':
               hexDec =  7;
               break;
            case '8':
               hexDec =  8;
               break;
            case '9':
               hexDec =  9;
               break;
            case 'A' , 'a': 
               hexDec =  10;
               break;
            case 'B' , 'b':
               hexDec =  11;
               break;
            case 'C' , 'c':
               hexDec =  12;
               break;
            case 'D' , 'd':
               hexDec =  13;
               break;
            case 'E' , 'e':
               hexDec =  14;
               break;
            case 'F' , 'f':
               hexDec =  15;
               break;
    
         }

         return hexDec;
    }
}