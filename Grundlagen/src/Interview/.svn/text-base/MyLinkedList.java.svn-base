package Interview;

class Node {
	Node next;
	int value;
}

public class MyLinkedList {

	private Node head;

	public void add(int x) {
		if (head == null) {
			head = new Node();
			head.value = x;
			head.next = null;
		} else {
			Node nextNode = head;
			while (nextNode.next != null) {
				nextNode = nextNode.next;
			}
			Node xNode = new Node();
			xNode.value = x;
			xNode.next = null;
			nextNode.next = xNode;

		}
	}

	/**
	 * 
	 * @param x
	 * @return
	 */
	public boolean remove(int x) {

		Node nextNode = null;


		if (head== null){
			return false;
		}

		if (head.value == x) {
			head = head.next;
			return true;
		}

		Node testNode = head;
		while(testNode != null){
			if (testNode.next != null && testNode.next.value == x) {
				testNode.next = testNode.next.next;
				return true;
			}
			testNode = testNode.next;
		}
		return false;
}

/**
 * 
 * @param x
 * @return the index of x if found, else return -1
 */
public int find(int x) {
	int i = 0;
	if (head == null) {
		return -1;
	} else {
		Node nextNode = head;
		while (nextNode != null) {
			if (nextNode.value == x) {
				return i;
			} else {
				nextNode = nextNode.next;
				i++;
			}
		}
	}
	return -1;
}

public void reverse() {
	
	if (head == null){
		return;
	}
	
	if (head.next == null){
		return;
	}
	
	Node p1 = head;
	Node p2 = head.next;
	Node p3 = head.next.next;
	head.next = null;
	
	while(p3 != null){
		p2.next = p1;
		p1 = p2;
		p2 = p3;
		p3 = p3.next;
		
	}
	p2.next = p1;
	head = p2;
	
}

public void printList() {
	Node temp= head;
	while (temp != null){
		System.out.print(temp.value+" ");
		
		temp = temp.next;
	}
	System.out.println();
}

public static void main(String[] args) {
	MyLinkedList list = new MyLinkedList();
	list.add(7);
	list.add(6);
	list.add(5);
	list.add(4);
	list.add(3);
	list.printList();
	//list.remove(5);
	//list.remove(200);
	list.printList();
	list.reverse();
	list.printList();
	System.out.println(list.find(6));
}

}
