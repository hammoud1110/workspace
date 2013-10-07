package edu.bonn.jbc.interfaces.task1;

public class Test {
	
	public static void main(String[] args) {
		NumberTool t1 = new JavaNumberTool();
		test(t1);
		NumberTool t2 = new BBSShellNumberTool();
		test(t2);
	}
	
	private static void test(NumberTool tool) {
		System.out.println("Using class " + tool.getClass());
		Number[] numbers = tool.generateRandomNumbers(10);
		tool.print(numbers);
		tool.sort(numbers);
		tool.print(numbers);
		System.out.println();
	}

}
