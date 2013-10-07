package edu.bonn.jbc.polymorphism.task2;

import edu.bonn.jbc.polymorphism.task1.BachelorStudent;
import edu.bonn.jbc.polymorphism.task1.DiplomaStudent;
import edu.bonn.jbc.polymorphism.task1.MasterStudent;
import edu.bonn.jbc.polymorphism.task1.Student;
import edu.bonn.jbc.polymorphism.task1.StudentPrinter;

public class Test {
	
	public static void main(String[] args) {
		Student alice = new DiplomaStudent("123456", "Alice", "alice@uni-bonn.de");
		Student bob = new BachelorStudent("234567", "Bob", "bob@uni-bonn.de");
		Student carol = new MasterStudent("345678", "Carol", "carol@uni-bonn.de", "UK");
		
		Student[] original = new Student[]{alice, bob, carol};
		
		StudentPrinter p = new StudentPrinter();
		p.print(original);
		
		StudentCopier c = new StudentCopier();
		Student[] copy = c.copy(original);
		
		p.print(copy);
	}

}
