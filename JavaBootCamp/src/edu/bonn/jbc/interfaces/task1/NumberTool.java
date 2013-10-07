package edu.bonn.jbc.interfaces.task1;

/**
 * This interface provides many handy tools for numbers.
 */
public interface NumberTool {
	
	/**
	 * Generates an array of random numbers. The generation method
	 * depends on the implementing class, where it should be documented.
	 * @param quantity Indicates how many random numbers will be generated
	 * @return An array containing random numbers. The type of the numbers 
	 * (Integer, Double, ...) depends on the implementing class, where it
	 * should be documented.
	 */
	public Number[] generateRandomNumbers(int quantity);
	
	/**
	 * Sorts the given array of numbers. The sorting algorithm depends on 
	 * the implementing class, where it should be documented.
	 * @param numbers The numbers to sort. The order of the given array will be 
	 * changed during sorting.
	 */
	public void sort(Number[] numbers);
	
	/**
	 * Prints the given array of numbers in a fancy way.
	 * @param numbers The numbers to print.
	 */
	public void print(Number[] numbers);

}
