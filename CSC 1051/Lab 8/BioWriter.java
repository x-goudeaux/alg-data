import java.io.*; 
public class BioWriter {
   public static void main (String [] args) throws IOException{
      PrintWriter out = new PrintWriter("bio.txt");
      
      out.println("My name is Xavier Jibril Goudeaux.");
      out.println("My current major is Cognitive Behavioral Neuroscience.");
      out.println("I'm sure that I want a career in computer science...");
      out.println("but i'm not so sure of what I want to do just yet.");
      out.println("I'm still getting the hang of Python with some C++.");
      
      out.close();
      
      
      
   }
}
      