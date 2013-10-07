package edu.bonn.jbc.collections.task1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Test {
	public static void main(String[] args) {
		Student s1=new Student("Bob", 298704);
		Student s11=new Student("Bob", 298704);
		
		Student s2=new Student("Dan", 298774);
		Student s3=new Student("Ana", 298874);
		Student s4=new Student("Johnny",298374);
		Student s5=new Student("Lisa", 288774);
		Student s6=new Student("Marc", 268774);
		
		
		
		List<Student> students=new ArrayList<Student>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
		students.add(s6);
		
		System.out.println("Unsorted " +students);
		Collections.sort(students, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				if(o1.getId()<o2.getId())
					return -1;
				else if(o1.getId()>o2.getId())
					return 1;
				else
				return 0;
			}
		});

		
		System.out.println("Sorted "+students);
		
		
		
		int s1Code=s1.hashCode();
		System.out.println("Hash code 1" +s1Code);
		
		int s2Code=s11.hashCode();
		System.out.println("Hash code 2" +s2Code);
		
		if(s1.equals(s11)){
			System.out.println("The two objects are equal");
		}
		else{
			System.out.println("The two objects are not equal");
		}
		if(s1Code==s2Code){
			System.out.println("The two hashes are equal");
		}
		else{
			System.out.println("The two hashes are not equal");
		}
	}	
}
