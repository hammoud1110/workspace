package day04b;

import java.util.Arrays;
import java.util.Random;

public class JavaNumberTool implements NumberTool {

	/**
	 * Generates pseudo-random doubles, approximately uniformly 
	 * distributed over the whole integer range. 
	 * @see Random#nextDouble()
	 */
	@Override
	public Number[] generateRandomNumbers(int quantity) {
		Number[] numbers = new Integer[quantity];
		Random r = new Random();
		for (int i=0; i<quantity; i++) {
			numbers[i] = r.nextInt();
		}
		return numbers;
	}

	/**
	 * Sorts the given array of numbers using a tuned quicksort.
	 * @see Arrays#sort(double[])
	 */
	@Override
	public void sort(Number[] numbers) {
		Arrays.sort(numbers);
	}

	/**
	 * Prints a list representation of the given number array.
	 * @see Arrays#toString(double[])
	 */
	@Override
	public void print(Number[] numbers) {
		System.out.println(Arrays.toString(numbers));
	}

}
