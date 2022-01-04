import java.util.Hashtable;
import java.util.Scanner;
import java.io.*;

//@Xavier Goudeaux

/*
 * Cracker() reads file with usernames and hashed passwords then enters them into a HashTable
 * (username as key: password as value)
 * 
 * The method also tries to crack each password which might be 6-letters('a' to 'z') or 5-letters ('0' to 'Z')
 * and outputs whether or not the password was cracked
 */
public class HashTableTester {
	
	public static void Cracker() throws FileNotFoundException {
		Scanner scan = new Scanner(new File("src/passwords.txt"));
		Hashtable<String, Integer> passwords = new Hashtable<String, Integer>();
		
		
		System.out.println("Reading in password file...");
		while(scan.hasNextLine()) {
			String line = scan.nextLine();
			String username = "";
			String password = "";
			if(line.charAt(0) == '#') {
				continue;
			}
			for(int i = 0; i < line.length(); i++) {
				if(Character.isAlphabetic(line.charAt(i))) {
					username += line.charAt(i);
				}
				else if(Character.isDigit(line.charAt(i))){
					password += line.charAt(i);
				}
			}
			passwords.put(username, Integer.parseInt(password));
		}
		scan.close();
		
		System.out.println("Cracking passwords....");
		for (String user : passwords.keySet()) {
			 boolean crackingone = true;
			 boolean crackingtwo = true;
			
			 int hashcode = passwords.get(user);
		loop : for (char c1 = 'a'; c1 <= 'z'; c1++) {
				   for (char c2 = 'a'; c2 <= 'z'; c2++) {
					   for (char c3 = 'a'; c3 <= 'z'; c3++) {
						   for (char c4 = 'a'; c4 <= 'z'; c4++) {
							   for (char c5 = 'a'; c5 <= 'z'; c5++) {
								   for (char c6 = 'a'; c6 <= 'z'; c6++) {
									   String pass = "" + c1 + c2 + c3 + c4 + c5 + c6;
									   if (hashcode == hash(pass)){
				                            System.out.println("6-letter password for username " + user + " is " + pass);
				                            break loop;
				                       }
									   if(c1 == 'z' && hashcode != hash(pass)) {
										   System.out.println("Could not crack 6-letter password for username " + user );
										   break loop;
									   }
				                		
								   }
							   }  
						   }
					   }
				   }
				   
			   }     
			 
		 
    
		loop2: for (char c1 = '0'; c1 <= 'Z'; c1++) {
			        for (char c2 = '0'; c2 <= 'Z'; c2++) {
			            for (char c3 = '0'; c3 <= 'Z'; c3++) {
			                for (char c4 = '0'; c4 <= 'Z'; c4++) {
			                	for (char c5 = '0'; c5 <= 'Z'; c5++) {
			                		String pass = "" + c1 + c2 + c3 + c4 + c5;
			                		if (hashcode == hash(pass)){
			                            System.out.println("5-letter password for username " + user + " is " + pass);
			                            break loop2;
			                        }
			                		 if(c1 == 'Z' && hashcode != hash(pass)) {
										   System.out.println("Could not crack 5-letter password for username " + user );
										   break loop2;
									   }
			                	}
			                }
			            }
			        }
			   }
		 }             
	  
		 System.out.println("Done.");
		
		
	}
	private static int hash(String password)
	{
	    return Math.abs(password.hashCode());
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		
		Cracker();
	}

}
