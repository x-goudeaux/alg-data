public class ArrayElements{
   public static void main(String[]args){
      int[] numbers = new int[10];
      
      for (int num = 0; num < 10; num++)
         numbers[num] = num;
      
      for (int i = 0; i < 10; i++)
         System.out.print(numbers[i] + " ");
      System.out.println();
      
      numbers[5] = numbers[8] + numbers[9];
      
      for (int i = 0; i < 10; i++)
         System.out.print(numbers[i] + " ");
      System.out.println();
   }
}