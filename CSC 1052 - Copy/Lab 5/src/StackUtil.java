/**
 * StackUtil program that contains three utility methods for
 * working with stacks.
 * 
 * @author Xavier Goudeaux
 *
 */
public class StackUtil
{
	/**
	 * Reverses the contents of a Stack object in place.
	 * @param stack the Stack to reverse
	 */
	public static void reverse(Stack<String> stack)
	{
		ArrayStack<String> temp = new ArrayStack<String>();
		ArrayStack<String> temp2 = new ArrayStack<String>();
		while(!stack.isEmpty()) {
			temp.push(stack.pop());
		}
		while(!temp.isEmpty()) {
			temp2.push(temp.pop());
		}
		while(!temp2.isEmpty()) {
			stack.push(temp2.pop());
		}
	}
	
	/**
	 * Makes a copy of a Stack object, and not simply a reference.
	 * Any changes made later to the copy will not be made to the 
	 * original, and vice versa.
	 * @param stack the stack to copy
	 * @return a copy of the original stack
	 */
	public static Stack<String> copy(Stack<String> stack)
	{
		ArrayStack<String> copy = new ArrayStack<String>();
		ArrayStack<String> temp = new ArrayStack<String>();
	
		String popped;
		
		while(!stack.isEmpty()) {
			temp.push(stack.pop());
		}
		while(!temp.isEmpty()) {
			popped = temp.pop();
			stack.push(popped);
			copy.push(popped);
		}
		return copy;
	}
	
	/**
	 * Iteratively remove all adjacent doubles in the stack until
	 * no adjacent doubles remain. Some examples include:
	 * [a, b, c]             => [a, b, c]
	 * [a, b, b, c]          => [a, c]
	 * [a, a, b, b, c]       => [c]
	 * [a, b, b, a, c]       => [c]
	 * [a, b, c, c, b, a, d] => [d]
	 * @param stack the initial stack
	 * @return true if any doubles were removed
	 */
	public static boolean removeDoubles(Stack<String> stack)
	{	
		ArrayStack<String> hold = new ArrayStack<String>();
		boolean removed = false;
        
 		while(stack.size() != 1) {
 			hold.push(stack.pop());
 			while(hold.peek() == stack.peek()) {
 				hold.pop();
 				stack.pop();
 				removed = true;
 			}
 		}
 		while(!hold.isEmpty()) {
 			stack.push(hold.pop());
 		}
	   return removed;
		
	}
	
	/**
	 * main method containing tests. Additional tests can be added
	 * but the existing tests should not be modified.
	 */
	public static void main(String[] args)
	{
		// Starting point
		ArrayStack<String> myStack = new ArrayStack<String>();
		myStack.push("one");
		myStack.push("two");
		myStack.push("three");
		myStack.push("four");
		myStack.push("four");
		myStack.push("three");
		myStack.push("five");
		System.out.println("Start expect: " + "[one, two, three, four, four, three, five]");
		System.out.println("Start actual: " + myStack);
		System.out.println();
		
		// Test reverse
		reverse(myStack);
		System.out.println("Rev expect: " + "[five, three, four, four, three, two, one]");
		System.out.println("Rev actual: " + myStack);
		System.out.println();
		
		// Test copy
		Stack<String> copyStack = copy(myStack);
		String popped = copyStack.pop(); // pop top from the copy
		System.out.println("Popped expect: " + "one");
		System.out.println("Popped actual: " + popped);
		// Make sure original is unchanged
		System.out.println("Orig expect: " + "[five, three, four, four, three, two, one]");
		System.out.println("Orig actual: " + myStack);
		// Verify the copy is correct
		System.out.println("Copy expect: " + "[five, three, four, four, three, two]");
		System.out.println("Copy actual: " + copyStack);
		System.out.println();
		
		// Test remove doubles
		removeDoubles(myStack);
		System.out.println("Remove doubles expect: " + "[five, two, one]");
		System.out.println("Remove doubles actual: " + myStack);
		
		
	}
}
