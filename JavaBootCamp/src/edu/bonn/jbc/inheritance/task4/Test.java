package edu.bonn.jbc.inheritance.task4;

import java.util.GregorianCalendar;

import edu.bonn.jbc.inheritance.task3.*;

public class Test {
	
	public static void main(String[] args) {
		testEquals();
		testEquals2();
	}
	
	private static void testEquals() {
		JavaBootCampParticipant alice1 = new JavaBootCampParticipant("Alice", "One", 
				new GregorianCalendar(1983, 11, 19), "654321", "three@uni-bonn.de", true);
		JavaBootCampParticipant alice2 = new JavaBootCampParticipant("Alice", "One", 
				new GregorianCalendar(1983, 11, 19), "654321", "three@uni-bonn.de", true);
		Student alice3 = new Student("Alice", "One", new GregorianCalendar(1983, 11, 19), "654321", "three@uni-bonn.de");
		
		if (!alice1.equals(alice2)) {
			System.err.println("alice1 and alice2 should be equal!");
		}
		if (alice1.equals(alice3)) {
			System.err.println("alice1 and alice3 should not be equal!");
		}
		if (!alice3.equals(alice1)) {
			System.err.println("alice3 and alice1 should be equal using instanceof!");
		}
	}
	
	private static void testEquals2() {
		JavaBootCampParticipant alice1 = new JavaBootCampParticipant("Alice", "One", 
				new GregorianCalendar(1983, 11, 19), "654321", "three@uni-bonn.de", true);
		JavaBootCampParticipant alice2 = new JavaBootCampParticipant("Alice", "One", 
				new GregorianCalendar(1983, 11, 19), "654321", "three@uni-bonn.de", true);
		Student alice3 = new Student("Alice", "One", new GregorianCalendar(1983, 11, 19), "654321", "three@uni-bonn.de");
		
		if (!alice1.equals2(alice2)) {
			System.err.println("alice1 and alice2 should be equal!");
		}
		if (alice1.equals2(alice3)) {
			System.err.println("alice1 and alice3 should not be equal!");
		}
		if (alice3.equals2(alice1)) {
			System.err.println("alice3 and alice1 should not be equal using getClass()!");
		}
	}
	
}
