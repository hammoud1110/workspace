package edu.bonn.jbc.collections.sets;
import java.util.HashSet;

import edu.bonn.jbc.collections.task1.Student;


public class SetOperations {
	public static void main(String[] args) {
		Student s1=new Student("Bob", 298704);
		Student s2=new Student("Dan", 298774);
		Student s3=new Student("Ana", 298874);
		Student s4=new Student("Johnny",298374);
		Student s5=new Student("Lisa", 288774);
		Student s6=new Student("Marc", 268774);
		Student s7=new Student("Julia", 263774);
		
		HashSet<Student> masterStudents=new HashSet<Student>();
		masterStudents.add(s1);
		masterStudents.add(s2);
		masterStudents.add(s3);
		masterStudents.add(s4);
		masterStudents.add(s5);
		masterStudents.add(s6);
		
		System.out.println(masterStudents.toString());
		
		HashSet<Student> javaStudents=new HashSet<Student>();
		javaStudents.add(s1);
		javaStudents.add(s2);
		javaStudents.add(s7);
		
		//union of the two sets
//		masterStudents.addAll(javaStudents);
//		System.out.println(masterStudents.toString());
		
		//intersection of the two sets
//		masterStudents.retainAll(javaStudents);
//		System.out.println(masterStudents.toString());
		
		//difference of the two sets 
		masterStudents.removeAll(javaStudents);
		System.out.println(masterStudents.toString());
		
		
	}
}

