

/**
 * ResizingIntegerArray represents an array of integers that grows and shrinks. 
 * @author Xavier Goudeaux
 *
 */
public class ResizingIntegerArray implements IntegerArray
{
	// TODO: Declare a private int array as an instance variable
	private int[] numbers;
	
	// Constructor.
	public ResizingIntegerArray()
	{
		// TODO: initialize the instance variable array as size 0
		numbers = new int [0];
	}

	/**
	 * Add an item to the array. After adding the item,
	 * the array will be one item longer than before.
	 *
	 * @param item the item (value) to add to the array
	 */
	public void add(int item)
	{
		int [] temp = new int[numbers.length + 1];
		if(numbers.length != 0) {
			for(int i = 0; i < numbers.length; i++) {
				temp[i] = numbers[i];
			}
		}
		temp[temp.length - 1] = item;
		
		numbers = new int[temp.length];
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = temp[i];
		}
		
		
		
		
	}

	/**
	 * Remove an item to the array. After removing the item,
	 * the array will be one item shorter than before.
	 *
	 * @param item the item (value) to remove from the array
	 */
	public void remove(int item)
	{
		int location = -1; 
		for(int i = 0 ; i < numbers.length; i++) {
			if(numbers[i] == item) {
				location = i; 
				break;
			}
		}
		if(location != -1) {
			int [] temp = new int [numbers.length - 1];
		    for(int i = 0 , k = 0; i < numbers.length; i++) {
		    	if(i == location) {
		    		continue;
		    	}
		    	temp[k++] = numbers[i];
		    }
		    numbers = new int[temp.length];
		    for(int i = 0; i < numbers.length; i++) {
		    	numbers[i] = temp[i];
		    }
		}
	}

	/**
	 * Returns the count of items in the array.
	 * @return number of items in the array.
	 */
	public int size()
	{
		return numbers.length;
	}

	/**
	 * Returns a string representation of the array, delimited by commas.
	 * @return comma-delimited string representation of the array
	 */
	public String toString()
	{	
		String array = "";
		for(int i = 0; i < numbers.length; i++) {
			int num = numbers[i];
			if(i != numbers.length-1 ) {
				array += num + ",";
			}
			else {
				array += num;
			}
		}
		return array;
	}
}
