package edu.bonn.jbc.inheritance.task1;

public class Test {
	
	public static void main(String[] args) {
		Person p1 = new Person("John Doe");
		if (!"John Doe".equals(p1.getName())) {
			System.err.println("The name of person 1 should be John Doe, but is " + p1.getName());
		}
		if (p1.getEmail() != null) {
			System.err.println("John Doe should not have an email address, but has address " + p1.getEmail());
		}
		
		Person p2 = new Person("Jane Doe", "jane@doe.com");
		if (!"Jane Doe".equals(p2.getName())) {
			System.err.println("The name of person 2 should be Jane Doe, but is " + p2.getName());
		}
		if (!"jane@doe.com".equals(p2.getEmail())) {
			System.err.println("Jane Doe's email address should be jane@doe.com, but is" + p2.getEmail());
		}
		
		Student p3 = new Student("Alice", "123456");
		if (!"Alice".equals(p3.getName())) {
			System.err.println("The name of person 3 should be Alice, but is " + p3.getName());
		}
		if (!"123456".equals(p3.getMatriculationNr())) {
			System.err.println("Alice's matriculation nubmer should be 123456 but is " + p3.getMatriculationNr());
		}
		if (p3.getEmail() != null) {
			System.err.println("Alice should not have an email address, but has address " + p3.getEmail());
		}
		p3.setName("Alicia");
		if (!"Alicia".equals(p3.getName())) {
			System.err.println("Alice's name should now be Alicia, but is " + p3.getName());
		}
			
		Student p4 = new Student("Bob", "bob@example.com", "654321");
		if (!"Bob".equals(p4.getName())) {
			System.err.println("The name of person 4 should be Bob, but is " + p4.getName());
		}
		if (!"bob@example.com".equals(p4.getEmail())) {
			System.err.println("Bob's email address should be bob@example.com, but is" + p4.getEmail());
		}
		if (!"654321".equals(p4.getMatriculationNr())) {
			System.err.println("Bob's matriculation nubmer should be 654321 but is " + p4.getMatriculationNr());
		}
		if (!(p4 instanceof Student)) {
			System.err.println("Bob should be a student, but is an instance of class " + p4.getClass());
		}
		
		System.out.println("Well done!");
	}

}
