package edu.bonn.jbc.polymorphism.task4;

import java.util.ArrayList;
import java.util.List;

public class Test {
	
	public static void main(String[] args) {
		RandomStudent random = new RandomStudent("src/edu/bonn/jbc/polymorphism/task4/students.txt");
		List<Student> seen = new ArrayList<Student>();
		Student one, two;
		do {
			one = getStudent(random, seen);
			two = getStudent(random, seen);
			if (two == null) {
				System.out.println(one + " has to work alone :(");
			} else {
				System.out.println(one + " and " + two + " will work together.");
			}
		} while (one != null && two != null);
	}
	
	private static Student getStudent(RandomStudent random, List<Student> seen) {
		Student s = random.nextStudent(seen.toArray(new Student[seen.size()]));
		if (seen.contains(s)) {
			System.err.println("Student " + s.getName() + " already has a group!");
		}
		seen.add(s);
		return s;
	}

}
