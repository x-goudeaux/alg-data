import java.util.Random;
import java.util.Scanner;

//@Xavier Goudeaux

/*
 * Three methods that test the application of binary search trees (MyBST).
 * 
 * testWordOrder() takes a sentence and splits the words up putting them into the
 * binary search tree, then it outputs the words in order of the tree.
 * 
 * testRandomNumbers() takes 1000 random numbers (each between 1 - 1000)  into a binary search tree. Then
 * 20 more numbers are generated to see if those numbers exist in the tree.\
 * 
 * testMoreNumbers() takes 1000 random numbers (each between 1 - 1000), then outputs the average of these numbers
 * along with the amount of numbers less than the average.
 * 
 */
public class TreeTester {
	
	public static void testWordOrder() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Testing Word Order =======================");
		System.out.print("Enter a sentence > ");
		String sentence = scan.nextLine();
		
		
		MyBST<String> tree = new MyBST<String>();
		
		String [] words = (sentence.toLowerCase()).split("\\W+");
		
		for(String word:words) {
			tree.add(word);
		}
		tree.printInOrder(" ");
		
		System.out.println("==========================================");
	}
	
	public static void testRandomNumbers() {
		MyBST<Integer> tree = new MyBST<Integer>();
		Random generator = new Random();
		
		System.out.println("Testing Random Numbers =================== ");
		for(int i = 1; i <= 1000; i++) {
			tree.add(generator.nextInt(1000)+1);
		}
		
		for(int i = 1; i <= 20; i++) {
			int number = generator.nextInt(1000)+1;
			
			if(tree.contains(number)) {
				System.out.println("Tree contains " + number);
			}
			else {
				System.out.println("Tree does not contain " + number);
			}
			
		}
		System.out.println("==========================================");
	}
	
	public static void testMoreNumbers() {
		MyBST<Integer> tree = new MyBST<Integer>();
		Random generator = new Random();
		
		int sum = 0;
		int count = 0;
		
		for(int i = 1; i <= 1000; i++) {
			
			int number = generator.nextInt(1000)+1;
			sum += number;
			tree.add(number);
		}
		
		int average = sum / tree.size();
		System.out.println("Testing More Numbers =================== ");
		System.out.println("Average of " + tree.size() + " random numbers is " + average);
		
		for(int i = 1; i <= tree.size(); i++) {
			if(tree.contains(i) && i < average) {
				count += 1;
			}
		}
		System.out.println("There are " + count + " numbers less than " + average );
		System.out.println("==========================================");
	}

	public static void main(String[] args) {
		testWordOrder();
		
		testRandomNumbers();
		
		testMoreNumbers();
	}

}
