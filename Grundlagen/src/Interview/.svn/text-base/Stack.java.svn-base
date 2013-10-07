package Interview;



public class Stack {

	public class Node{
		int data;
		Node next;
	}
	
	public Node top;
	
	public void push(int n){
		Node newTop = new Node();
		newTop.data = n;
		newTop.next = top;
		top=newTop;
	}
	
	public int pop(){
		
		
		int upperTop = top.data;
		top = top.next;
			
		return upperTop;
		
		
	}
	
	public static void main(String[] args) {
		Stack obj = new Stack();
		
		obj.push(4);
		obj.push(5);
		obj.push(6);
		obj.push(7);
		try{
		System.out.println(obj.pop());
		System.out.println(obj.pop());
		System.out.println(obj.pop());
		System.out.println(obj.pop());
		
		System.out.println(obj.pop());
		}catch(NullPointerException e){
		System.out.println("Stack is empty");
		}
		
	}
	
	
	
}
