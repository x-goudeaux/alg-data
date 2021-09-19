import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * ArrayListIntro class that introduces use of an ArrayList.
 * 
 * @author XavierGoudeaux
 *
 */
public class ArrayListIntro
{
	// TODO: declare and instantiate a Random object here
	Random gen = new Random();
	

	// TODO: declare an ArrayList<Integer> object here
	List<Integer> numbers;

	/**
	 * Constructor. Instantiates an empty ArrayList object.
	 */
	public ArrayListIntro()
	{
		// TODO: initialize the ArrayList object here
		numbers = new ArrayList<Integer>();
	}

	/**
	 * Fills an existing ArrayList with n items.
	 * 
	 * @param n number of items to add to ArrayList
	 */
	private void fill(int n)
	{
		// TODO: add code here to fill the ArrayList with n random integers
			
		for(int i = 0; i < n; i++) {
			int num = gen.nextInt(99) + 1;
			numbers.add(num);
		}
	}

	/**
	 * Returns a count of the number of items in the ArrayList.
	 * 
	 * @return length of the ArrayList
	 */
	private int count()
	{
		// TODO: add code here to return the size of the ArrayList
		return numbers.size();
	}

	/**
	 * Returns the maximum value in the ArrayList.
	 * 
	 * @return maximum value
	 */
	private int getMax()
	{
		// TODO: add code here to return the maximum value of the ArrayList
		int max = 0;

		for (int i = 1; i < numbers.size(); i++) {
		    if (numbers.get(i) > max) {
		    	max = numbers.get(i);
		    }
		}
		return max;
	}

	/**
	 * Main method that runs tests.
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		ArrayListIntro list1 = new ArrayListIntro();
		list1.fill(10);
		System.out.println("Length of list1: " + list1.count() + "  expected: " + 10);
		System.out.println("Max value of list1: " + list1.getMax());

		ArrayListIntro list2 = new ArrayListIntro();
		list2.fill(1000);
		System.out.println("Length of list2: " + list2.count() + "  expected: " + 1000);
		System.out.println("Max value of list2: " + list2.getMax());

		ArrayListIntro list3 = new ArrayListIntro();
		list3.fill(100000);
		System.out.println("Length of list3: " + list3.count() + "  expected: " + 100000);
		System.out.println("Max value of list3: " + list3.getMax());
	}
}
