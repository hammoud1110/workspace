package edu.bonn.jbc.inheritance.task5c;

class Superclass {
	private final String greet() {
		return "Hello";
	}
}

public class Subclass extends Superclass {
	/*
	 * Does not compile since the super method greet() is not visible to the 
	 * subclass and can therefore not be called via super.
	 */
	public String greet() {
		return super.greet() + ", I am the subclass";
	}

	public static void main(String[] args) {
		Subclass s = new Subclass();
		System.out.println(s.greet());
	}
}
