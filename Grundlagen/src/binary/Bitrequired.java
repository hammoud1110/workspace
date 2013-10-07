package binary;

public class Bitrequired {

	
	
	public int getNumberToConvert(int n,int m){
		int counter=0;
		while(n>0 || m> 0){
			if (n%2 != m%2)
				counter++;
				n= n/2;
				m=m/2;
		}
		
		return counter;
	}
	
	public static void main(String[] args) {
		Bitrequired zaza = new Bitrequired();
		System.out.println(zaza.getNumberToConvert(31, 14));
	}
}
