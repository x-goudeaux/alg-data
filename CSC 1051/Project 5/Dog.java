
public class Dog {

   final private String name;
   final private String breed;
   private int age;
   final private String gender;
   private String status;

   public Dog(String petName,String type,String pronoun,int years){
      
      age = years;
      breed = type;
      gender = pronoun;
      name = petName;
      
      status = name + " is hungry.";
      
   }
   
     
   
   public void setAge(int years){
      age = years;
   
   
   
   }
   
   public void printInfo(){
      System.out.println("This dog's name is " + name + ".");
      System.out.println(name + " is a " + breed + ".");
      System.out.println(gender + " is " + age + " years old.");
      System.out.println();
  
   }
   
   public String getStatus(){
      return status;
      
   
   
   }
   
   
   
   public void play(){
      
      if (status.equals( name + " is hungry.")){
         System.out.println(name + " is hungry. " + gender + " does not want to play.");
      }
      if (status.equals( name + " is not hungry.")){
         System.out.println(name + " is playing. It looks like " + gender.toLowerCase() + " is getting hungry.");
         status = name + " is hungry.";
      }
   
   
   
   }
   
   public void feed(){
      status = name + " is not hungry.";
      System.out.println(name + " has been fed.");
   
   
   }

}



















