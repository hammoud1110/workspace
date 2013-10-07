package Interview;

public class Fibonacci {


	public int f(int n){

		if (n== 0){
			return n;
		}
		if (n== 1){
			return n;
		}

		else{
			return f(n-1)+f(n-2);
		}


	}
	public static void main(String[] args) {
		Fibonacci obj = new Fibonacci();
		System.out.println(obj.f(7));
		
	}
}
