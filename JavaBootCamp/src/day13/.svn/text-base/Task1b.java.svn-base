package day13;

public class Task1b implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Hello from a thread!");
        for(int i=0; i<400; i++){
			System.out.print(i);
		}
	}
	public static void main(String[] args) {
		
		Thread t = new Thread(new Task1b());
		t.start();
	}

}
