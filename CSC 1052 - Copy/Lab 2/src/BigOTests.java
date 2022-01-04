/**
 * BigOTests that times array max-finding algorithms. 
 * @author Your Name
 *
 */
import java.util.Random; 

public class BigOTests
{
	/**
	 * Times finding the maximum value in a 1D array of a specified size
	 * @param n size of array
	 */
	private static void time1DArray(int n)
	{
		Random gen = new Random();
		// declare 1D array of size n
		int[] oneDim = new int[n];
		// initialize array with random values
		for(int i = 0; i < oneDim.length; i++) {
			oneDim[i] = gen.nextInt(100) + 1;
		}
		// start timer
        long start = System.nanoTime();
		// find maximum value in array
        int max = 0;
    	for(int i = 0; i < oneDim.length; i++) {
    		if (max < oneDim[i]) {
    			max = oneDim[i];
    		}
    	}
		// stop timer
    	long end = System.nanoTime();
		// print timing (number of nanoseconds)
    	long runTime = end - start;
    	System.out.println(runTime);
	}
	
	/**
	 * Times finding the maximum value in a 2D array of a specified size
	 * @param n size of array
	 */
	private static void time2DArray(int n)//creating and iterating through 2d arrays
	{
		Random gen = new Random();
		int[][] twoDim = new int[n][n];
		
		for(int row = 0; row < twoDim.length; row++) {
			for(int col = 0; col < twoDim[row].length; col++) {
				twoDim[row][col] = gen.nextInt(100) + 1;
			}
		}
		
		long start = System.nanoTime();
		int max = 0;
		for(int row = 0; row < twoDim.length; row++) {
			for(int col = 0; col < twoDim[row].length; col++) {
				if (max < twoDim[row][col]) {
		    		max = twoDim[row][col];
		    	}
			}
		}
		long end = System.nanoTime();
		
	    long runTime = end - start;
	    System.out.println(runTime);
		
	}
	
	/**
	 * Times finding the maximum value in a 3D array of a specified size
	 * @param n size of array
	 */
	private static void time3DArray(int n) //creating and iterating through 3d arrays
	{	
		Random gen = new Random();
		int[][][] threeDim = new int [n][n][n];
		
		for(int row = 0; row < threeDim.length; row++) {
			for(int col = 0; col < threeDim[row].length; col++) {
				for(int table = 0; table < threeDim[row][col].length; table++) {
					threeDim[row][col][table] = gen.nextInt(100) + 1;
				}
			}
		}
		

		long start = System.nanoTime();
		int max = 0;
		for(int row = 0; row < threeDim.length; row++) {
			for(int col = 0; col < threeDim[row].length; col++) {
				for(int table = 0; table < threeDim[row][col].length; table++) {
					if (max < threeDim[row][col][table]) {
			    		max = threeDim[row][col][table];
			    	}
				}
			}
		}
		long end = System.nanoTime();
		
	    long runTime = end - start;
	    System.out.println(runTime);
		
	}
	
	/**
	 * Main method that runs all tests for a specified array size.
	 * @param args
	 */
	public static void main(String[] args)
	{
		final int n = 10; // change this for each size of array and rerun
		
		time1DArray(n);
		time2DArray(n);
		time3DArray(n);
	}
}
