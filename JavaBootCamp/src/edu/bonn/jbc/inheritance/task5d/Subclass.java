package edu.bonn.jbc.inheritance.task5d;

class Superclass {
	private String greeting;

	public Superclass(String greeting) {
		this.greeting = greeting;
	}

	private final String greet() {
		return this.greeting;
	}
}

public class Subclass extends Superclass {
	private String greeting;

	/*
	 * Does not compile, since in the constructor, an implicit call to the 
	 * super constructor is made. However, the class Superclass has no constructor
	 * without arguments. super(String) has to be called in order to compile this
	 * example.
	 */
	public Subclass(String greeting) {
		this.greeting = greeting;
	}

	public String greet() {
		return this.greeting;
	}

	public static void main(String[] args) {
		Subclass s = new Subclass("Hello");
		System.out.println(s.greet());
	}
}
