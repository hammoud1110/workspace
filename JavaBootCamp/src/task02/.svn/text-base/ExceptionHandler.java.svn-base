package task02;

public class ExceptionHandler {
	public static void main(String[] args) {
		int[] array = new int[]{1,2,3,4,5};
		try {
		System.out.print("array = [");
		System.out.print(array[1] + " ");
		System.out.print(array[2] + " ");
		System.out.print(array[3] + " ");
		System.out.print(array[4] + " ");
		System.out.println(array[5] + "]");
		} catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("oops");
		e.printStackTrace();
		System.exit(-1);
		} finally {
		System.out.println("Free the variables");
		array = null;
		System.out.println("array = " + array);
		}
	}
}
