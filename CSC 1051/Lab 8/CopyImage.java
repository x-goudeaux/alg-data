import java.io.*; 


public class CopyImage{
   public static void main(String [] args) throws IOException {
   
      FileInputStream inputS = new FileInputStream("pets.jpg");
     
   
      FileOutputStream outputS = new FileOutputStream("pets_copy.jpg");
      
      int x; 
      
      System.out.println("Copying file...");
      
      while((x = inputS.read()) != -1){
     
         
         outputS.write(x);
      
      }
      
      inputS.close();
      outputS.close();
      
      System.out.println("Copying complete");
   }
}
      