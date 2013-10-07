package day04b;


	import java.util.Random;

	public class BBSShellNumberTool implements NumberTool {

		/**
		 * This class implements the interface {@link NumberTool} using the 
		 * Blum Blum Shub (B.B.S.) algorithm for random number generation and 
		 * shell sort for sorting.
		 */
		private static final Integer M = 17*19;
		
		/**
		 * Generates pseudo-random integers using Blum Blum Shub.
		 * The parameter M is chosen as {@value BBSShellNumberTool#M}.
		 * {@link http://en.wikipedia.org/wiki/Blum_Blum_Shub}
		 */
		@Override
		public Number[] generateRandomNumbers(int quantity) {
			Integer[] numbers = new Integer[quantity];
			numbers[0] = new Random().nextInt(Integer.MAX_VALUE);	// the seed
			for (int i=1; i<quantity; i++) {
				numbers[i] = (int) Math.pow(numbers[i-1], 2) % M;
			}
			return numbers;
		}

		/**
		 * Sorts the given array of numbers using shell sort.
		 * {@link http://en.wikipedia.org/wiki/Shell_sort}
		 */
		@Override
		public void sort(Number[] numbers) {
			int n = numbers.length;
			int inc = n / 2;
			Number temp;
			int j;
			while (inc > 0) {
				for (int i=inc; i<n; i++) {
					temp = numbers[i];
					j = i;
					while (j >= inc && numbers[j-inc].doubleValue() > temp.doubleValue()) {
						numbers[j] = numbers[j-inc];
						j = j-inc;
					}
					numbers[j] = temp;
				}
				inc /= 2.2;
			}
		}

		/**
		 * Prints a fancy representation of the given number array.
		 */
		@Override
		public void print(Number[] numbers) {
			StringBuilder sb = new StringBuilder();
			sb.append("*");
			for (int i=0; i<numbers.length; i++) {
				for (int j=0; j<numbers[i].toString().length(); j++) {
					sb.append("*");
				}
				sb.append("*");
			}
			sb.append("\n");
			String l = sb.toString();
			for (Number n : numbers) {
				sb.append(" ");
				sb.append(n);
			}
			sb.append("\n");
			sb.append(l);
			System.out.println(sb.toString());
		}

	}


