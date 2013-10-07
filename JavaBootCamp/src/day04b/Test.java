package day04b;

public class Test {

	
	
	public static void main(String[] args) {
		NumberTool myTool = new BBSShellNumberTool();
		NumberTool myTool1 = new JavaNumberTool(); 
		NumberTool myTool2 = new MyImplementation();
		
		Number[] numbers =myTool.generateRandomNumbers(6);
		myTool.sort(numbers);
		myTool.print(numbers);
		
		Number[] numbers1 =myTool1.generateRandomNumbers(6);
		myTool1.sort(numbers1);
		myTool1.print(numbers1);
		
		Number[] numbers2 =myTool2.generateRandomNumbers(6);
		myTool2.sort(numbers2);
		myTool2.print(numbers2);
		
		
	}
}
