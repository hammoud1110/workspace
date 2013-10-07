package edu.bonn.jbc.inheritance.task2;

import edu.bonn.jbc.inheritance.task1.*;

public class Test {
	
	private static final String JOHN = "John Doe";
	private static final String JANE = "Jane Doe, jane@doe.com";
	private static final String ALICE = "Alice, 123456";
	private static final String BOB = "Bob, bob@example.com, 654321";
	
	public static void main(String[] args) {
		Person p1 = new Person("John Doe");
		System.out.println(p1);
		if (!JOHN.equals(p1.toString())) {
			System.err.println("The output should be \"" + JOHN + "\"!");
		}
		
		Person p2 = new Person("Jane Doe", "jane@doe.com");
		System.out.println(p2);
		if (!JANE.equals(p2.toString())) {
			System.err.println("The output should be \"" + JANE + "\"");
		}
		
		Person p3 = new Student("Alice", "123456");
		System.out.println(p3);
		if (!ALICE.equals(p3.toString())) {
			System.err.println("The output should be \"" + ALICE + "\"");
		}
			
		Person p4 = new Student("Bob", "bob@example.com", "654321");
		System.out.println(p4);
		if (!BOB.equals(p4.toString())) {
			System.err.println("The output should be \"" + BOB + "\"");
		}
	}

}
