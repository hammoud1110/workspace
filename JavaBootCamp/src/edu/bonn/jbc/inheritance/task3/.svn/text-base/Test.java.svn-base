package edu.bonn.jbc.inheritance.task3;

import java.util.GregorianCalendar;

public class Test {
	
	private static final String ALICE = "Name: Alice One, birthday: 19.12.1983, matriculation nr: 654321, email: three@uni-bonn.de, subscribed to mailing list: yes";
	private static final String BOB = "Name: Bob Two, birthday: 03.05.1985";
	private static final String JOHN = "Name: John Three, birthday: 05.10.1984, matriculation nr: 123456";
	private static final String JANE = "Name: Jane Four, birthday: 23.08.1986, email: jane@uni-bonn.de";
	
	public static void main(String[] args) {
		// Be aware that the month of the year is zero-based (i.e., 0 = January, 11 = December)
		JavaBootCampParticipant alice = new JavaBootCampParticipant("Alice", "One", 
				new GregorianCalendar(1983, 11, 19), "654321", "three@uni-bonn.de", true);
		Person bob = new Person("Bob", "Two", new GregorianCalendar(1985, 4, 3));
		Student john = new Student("John", "Three", new GregorianCalendar(1984, 9, 5), "123456");
		Tutor jane = new Tutor("Jane", "Four", new GregorianCalendar(1986, 7, 23), "jane@uni-bonn.de");
		
		System.out.println(alice);
		if (!ALICE.equals(alice.toString())) {
			System.err.println("Output should be \"" + ALICE + "\"!");
		}
		System.out.println(bob);
		if (!BOB.equals(bob.toString())) {
			System.err.println("Output should be \"" + BOB + "\"!");
		}
		System.out.println(john);
		if (!JOHN.equals(john.toString())) {
			System.err.println("Output should be \"" + JOHN + "\"!");
		}
		System.out.println(jane);
		if (!JANE.equals(jane.toString())) {
			System.err.println("Output should be \"" + JANE + "\"!");
		}
	}

}
