package day04b;
import java.util.Arrays;
public class MyImplementation implements NumberTool{

	@Override
	public Number[] generateRandomNumbers(int quantity) {
		// TODO Auto-generated method stub
		Number[] numbers =  new Number[quantity];
		
		for (int i=0; i< quantity; i++){
			numbers[i] =   Math.random()*quantity;
			System.out.print(numbers[i]+"--");
			
		}
		System.out.println();
		
		
		
		return numbers;
	}

	@Override
	public void sort(Number[] numbers) {
		// TODO Auto-generated method stub
		
		Arrays.sort(numbers);
		
		
		
		
	}

	@Override
	public void print(Number[] numbers) {
		// TODO Auto-generated method stub
		for (int i=0; i< numbers.length; i++){
			
			System.out.print(numbers[i]+"--");
		}
	}

	
	
	
	
}
