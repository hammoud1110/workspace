package binary;

public class BitUtility {

	int getNumbOnes(int n) {
		int counter = 0;
		while (n > 0) {
			if (n % 2 == 1) {
				counter++;
			}
			n = n / 2;
		}
		return counter;
	}

	int getBitLength(int n) {
		int counter = 0;
		while (n > 0) {
			counter++;
			n = n / 2;
		}
		return counter;
	}
	
	
	public int getMaximumNumber(int n){
		int length = getBitLength(n);
		int count = getNumbOnes(n);
		int num = 0;
		for (int i = length-1;  i>=length - count;i--) {
			
			num = num | (int)Math.pow(2, i);
		}
		return num;
	}
	
	public int getMinimumNumber(int n){
		int length = getBitLength(n);
		int count = getNumbOnes(n);
		int num = 0;
		for (int i = 0; i < count; i++) {
			
			
			num = num | (int)Math.pow(2, i);
			
		}
		System.out.println("count= " + count);
		
		
		return num;
	}
	
	public static void main(String[] args) {
		BitUtility motaz = new BitUtility();
		
		
		System.out.println(motaz.getMaximumNumber(50));
		System.out.println();
		System.out.println(motaz.getMinimumNumber(50));
		
		
	}

}
