package Interview;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class MyBinaryTree {

	class Node {

		Node left, right;
		int value;


		public Node() {

		}

		public Node(int value) {
			this.value = value;
		}

	}


	public void traversePreorder(Node root) {
		System.out.print(root.value + " ");
		if (root.left != null) {
			traversePreorder(root.left);
		}
		if (root.right != null) {
			traversePreorder(root.right);
		}
	}


	Node root;


	public void insert(int x) {

		if (root == null) {
			root = new Node(x);
			return;
		}

		Node temp = root;

		while (temp != null) {

			if (temp.value < x) {
				if (temp.right != null) {
					temp = temp.right;
				} else {
					temp.right = new Node(x);
					return;
				}

			} else if (temp.value >= x) {
				if (temp.left != null) {
					temp = temp.left;
				} else {
					temp.left = new Node(x);
					return;
				}
			}
		}
	}



	/**
	 * Inorder:
    Traverse the left subtree.
    Visit the root.
    Traverse the right subtree.
	 */
	public void traverseInorder(Node root){
		if (root.left != null){
			traverseInorder(root.left);
		}
		System.out.print(root.value+" ");

		if (root.right != null){
			traverseInorder(root.right);
		}


	}


	public void traversePostorder(Node root){


		if(root.left != null){
			traversePostorder(root.left);
		}

		if(root.right != null){
			traversePostorder(root.right);

		}

		System.out.print(root.value+ " ");
	}


	public void printUpToDown(Node root) {




		if (root != null) {
			Queue<Node> q = new LinkedList<Node>();
			q.add(root);
			while (!q.isEmpty()) {
				Node n = q.poll();
				System.out.print(n.value+" ");
				if (n.left != null) {
					q.add(n.left);
				}
				if (n.right!= null) {
					q.add(n.right);
				}
			}
		}


	}

	public int height(Node root) {
		if (root == null) return -1;
		return 1 + Math.max(height(root.left), height(root.right));
	}

	public int compare(int x, Node root){

		if (x < root.value){
			return -1;
		}


		if (x > root.value){
			return 1;
		}

		else{
			return 0;

		}


	}


	public int findNode(int x){
		Node u = root;
		while (u != null){
			int comp = compare(x,u);
			if (comp < 0 ){
				u=u.left;

			}else{
				if(comp > 0){
					u=u.right;

				}else{ 
					
				System.out.println("found");
				return x;
				}
			}
		}
		return 0;

	}
	
	public int findNumberNodes(){
		Queue<Node> queue = new LinkedList<Node>();
		List<Node> liste = new ArrayList<Node>();
		//int i=0;
		queue.add(root);
		while (!queue.isEmpty()){
			Node n = queue.poll();
			liste.add(n);
			//i++;
			if (n.left != null){
				queue.add(n.left);
			}
			if (n.right != null){
				queue.add(n.right);
			}
		}
		return liste.size();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	


	public static void main(String[] args) {
		MyBinaryTree binTree = new MyBinaryTree();
		binTree.insert(5);
		binTree.insert(4);
		binTree.insert(13);
		binTree.insert(8);
		binTree.insert(3);
		binTree.insert(45);
		binTree.insert(32);
		binTree.insert(2);
		binTree.insert(99);
		binTree.insert(1);
/*
		 binTree.traversePreorder(binTree.root);

		System.out.println();
		binTree.traversePostorder(binTree.root);
		System.out.println();
		binTree.traverseInorder(binTree.root);
		System.out.println();
		System.out.println();

		binTree.printUpToDown(binTree.root);
		System.out.println();
		System.out.println(binTree.height(binTree.root));
		System.out.println();
		 
		binTree.findNode(4);
		binTree.findNode(3);
		binTree.findNode(444);
		binTree.findNode(8);
		*/
		System.out.println(binTree.findNumberNodes());
		
	}

}
