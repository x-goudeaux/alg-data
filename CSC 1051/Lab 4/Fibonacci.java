public class Fibonacci{
   public static void main(String []args){
   
   System.out.println("The first 15 Fibonacci numbers are:");
   
      int a = 0;
      int b = 1;
      int sum = 0;
      System.out.print(a + b + " ");
      
      for (int i = 1; i < 15; i++){
       
      int c =  a + b;
      System.out.print(c +" ");
      a=b;
      b=c;
      
      sum += c;
      
      }
      System.out.println();
      double average = sum / 15; 
      System.out.println("The average is " + average);
      
   }
}
      