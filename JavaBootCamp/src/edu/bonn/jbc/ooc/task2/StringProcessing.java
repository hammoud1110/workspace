package edu.bonn.jbc.ooc.task2;

public class StringProcessing {
 public static void main(String[] args) {
	String greeting="Hello";
	String helloVariable=greeting;
	greeting=greeting+ "Friend!";
	
	if(greeting==helloVariable){
		System.out.println("The two objects are the same");
	}
	else {
		System.out.println("The two objects are different");
	}
}
}
