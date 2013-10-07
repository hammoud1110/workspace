package edu.bonn.jbc.inheritance.task5a;

class Superclass {
	public final String greet() {
		return "Hello";
	}
}

public class Subclass extends Superclass {
	/*
	 * Cannot compile since the super method is final and must not be overwritten.
	 */
	public String greet() {
		return super.greet() + ", I am the subclass";
	}

	public static void main(String[] args) {
		Subclass s = new Subclass();
		System.out.println(s.greet());
	}
}
