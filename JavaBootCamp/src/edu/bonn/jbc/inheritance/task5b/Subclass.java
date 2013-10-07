package edu.bonn.jbc.inheritance.task5b;

class Superclass {
	private final String greet() {
		return "Hello";
	}
}

public class Subclass extends Superclass {
	/*
	 * This one compiles although the superclass method is final; since it is 
	 * private, it is not visible to the subclass and the greet() method is not 
	 * overwritten, but newly defined here. 
	 */
	public String greet() {
		return "Hello, I am the subclass";
	}

	public static void main(String[] args) {
		Subclass s = new Subclass();
		System.out.println(s.greet());
	}
}
