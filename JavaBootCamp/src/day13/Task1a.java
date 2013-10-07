package day13;

public class Task1a extends Thread {
	public void run() {
        System.out.println("Hello from a thread!");
        for(int i=0; i<400; i++){
			System.out.print(i);
		}
    }

    public static void main(String args[]) {
    	Task1a p = new Task1a();
        p.start();
    }
	
}
