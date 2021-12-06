/**
 * A linked list data structure. This class is based on the
 * MyCollection class in the LinkedLists topic in Rephactor.
 *
 * @author Xavier Goudeaux
 */
public class MyLinkedList
{
    private Node head;  // a reference to the first node in the list
    
    /**
     * Sets up an initially empty linked list.
     */
    public MyLinkedList()
    {
        head = null;
    }

    /**
     * Traverses the list, printing each element.
     * Genreates lots of output for a long list!
     */
    public void printList()
    {
        Node current = head;
        while (current != null)
        {
            System.out.println(current.elem);
            current = current.next;
        }
    }
    
    /**
     * Adds the specified element to the front of the list. 
     * @param elementToAdd generic element to be added
     */
    public void addToFront(String elementToAdd)
    {
        head = new Node(elementToAdd, head);
    }
     
    /**
     * Determines if the specified element is in the list. 
     * @param elementToFind generic element to be found
     * @return true if the list contains the element and false otherwise
     */
    public boolean contains(String elementToFind)
    {
        Node current = head;
        
        while (current != null && current.elem.equals(elementToFind))
            current = current.next;
        
        return current != null;
    }

    /**
     * Returns the size of the linked list as a count of its nodes.
     * @return number of nodes
     */
    public int size()
    {
        int count = 0;
        Node current = head;
        
        while (current != null)
        {
            count++;
            current = current.next;
        }
        
        return count;
    }
    
    /**
     * 1. Returns a count of the number of names that start with the 
     * specified letter, matching its case exactly.
     * @param letter the first letter
     * @return count of names
     */
    public int countOfNamesStartingWith(char letter)
    {
    	int count = 0;
    	Node current = head;
    	String word;
    	
    	while(current != null) {
    		word = current.elem;
    		if(word.charAt(0) == letter) {
    			count++;
    		}
    		current = current.next;
    	}
    	
        return count;
    }
    
    /**
     * 2. Returns the average number of letters (as a floating point number) in names 
     * starting with the upper or lower case version of the specified letter.
     * @param letter the first letter
     * @return average number of letters
     */
    public double avgLettersInNamesStartingWith(char letter)
    {
    	double sum = 0.0;
    	Node current = head;
    	String word;
    	
    	while(current != null) {
    		word = current.elem +"";
    		if(word.charAt(0) == letter) {
    			for(int i = 0; i < word.length(); i++) {
    				sum++;
    			}
    		}
    		current = current.next;
    	}
    	double avg = sum / countOfNamesStartingWith(letter);
    	return avg;
    }
    
    /**
     * 3. Returns a count of the number of names that contain the upper
     * or lower case version of the specified letter. The letter can
     * occur anywhere in a name to match.
     * @param letter the letter to find
     * @return count of names
     */
    public int countOfNamesContaining(char letter)
    {	
    	int count = 0;
    	Node current = head;
    	String word;
    	
    	while(current != null) {
    		word = current.elem + "";
    		for(int i = 0; i < word.length();i++) {
    			String check = "" + word.charAt(i);
    			if(check.equalsIgnoreCase("" + letter)) {
    				count++;
    				break;
    			}
    		}
    		current = current.next;
    	}
        return count;
    }
    
    /**
     * 4. Returns the alphabetically first name in the list, ignoring case.
     * @return the first name
     */
    public String alphabeticallyFirstName()
    {
        Node current = head;
        String word;
        String first = current.elem + "";
        current = current.next;
        
        while(current != null) {
        	word = current.elem + "";
        	if(word.compareToIgnoreCase(first) < 0) {
        		first = word;
        	}
        	current = current.next;
        }
        return first;
    }
    
    /**
     * 5. Returns the alphabetically first name in the list that starts
     * with the upper or lower case version of the specified letter.
     * @return the first name
     */
    public String alphabeticallyFirstNameStartingWith(char letter)
    {
    	Node current = head;
    	String word;
    	String first = current.elem;
    	
    	while(current != null) {
    		word = current.elem;
    		if(word.charAt(0) == letter) {
    			if(word.compareTo(first) < 0) {
    				first = word;
    			}
    		}
    		current = current.next;
    	}
        return first;
        
        
        
    }
    
    /**
     * 6. Returns the alphabetically last name in the list that starts
     * with the upper or lower case version of the specified letter.
     * @return the last name
     */
    public String alphabeticallyLastNameStartingWith(char letter)
    {
    	Node current = head;
    	String word;
    	String last = current.elem;
    	
    	while(current != null) {
    		word = current.elem;
    		if(word.charAt(0) == letter) {
    			if(word.compareTo(last) > 0) {
    				last = word;
    			}
    		}
    		current = current.next;
    	}
        return last;
        
    }

    /**
     * Returns the shortest name in the list. If more than one name
     * is the same, shortest length, it returns the first one it finds.
     * @return the shortest name
     */
    public String shortestName()
    {
    	Node current = head;
        String word;
        String small = current.elem + "";
           
        while(current != null) {
        	word = current.elem + "";
           	if(word.length() < small.length()) {
           		small = word;
           	}

           	current = current.next;
         }
         return small;
    }
    
    /**
     * Returns the shortest name in the list that starts with the upper
     * or lower case version of the specified letter. If more than one name
     * is the same, shortest length, it returns the first one it finds.
     * @return the shortest name
     */
    public String shortestNameStartingWith(char letter)
    {
    	Node current = head;
        String word;
        String small = current.elem + "";
        current = current.next;
           
           while(current != null) {
           		word = current.elem + "";
           		if(word.charAt(0) == letter) {
           		  	if(word.length() < small.length()) {
    	           		small = word;
    	           	}
    	           	else if(word.length() == small.length()) {
    	           		current = current.next;
    	           		continue;
    	           	}
           		}
           		current = current.next;
           }
           return small;
    }
    
    /**
     * Returns the longest name in the list. If more than one name
     * is the same, longest length, it returns the first one it finds.
     * @return the longest name
     */
    public String longestName()
    {
    	Node current = head;
        String word;
        String big = current.elem + "";
        current = current.next;
           
        while(current != null) {
        	word = current.elem + "";
           	if(word.length() > big.length()) {
           		big = word;
           	}
           	else if(word.length() == big.length()) {
           		current = current.next;
           		continue;
           	}
           	current = current.next;
         }
         return big;
    }
    
    /**
     * Returns the name at the specified position n in the list.
     * If n is after the last element, return "name not found".
     * @return the nth name if found, otherwise "name not found"
     */
    public String getNthName(int n)
    {
        Node current = head; 
        int count = 0;
        String nth = "";
        
        while(current != null) {
        	nth = current.elem;
        	if(count == n) {
        		break;
        	}
        	current = current.next;
        	count++;
        }
        return (current == null) ? "name not found" : nth;
        		
    }
    
      
    /**
     * A private inner class that represents a node in the linked list.
     */
    private class Node
    {
        private String elem; // the element stored in the node
        private Node next; // the reference to the next node in the list
        
        /**
         * Stores the element and sets the next reference to null.
         * @param element string element to be stored
         */
        public Node(String element)
        {
            this(element, null);
        }
        
        /**
         * Stores the element and sets the next reference to the node specified.
         * @param element string element to be stored
         * @param next node that will follow this node in the list
         */
        public Node(String element, Node next)
        {
            this.elem = element;
            this.next = next;
        }
    }
}