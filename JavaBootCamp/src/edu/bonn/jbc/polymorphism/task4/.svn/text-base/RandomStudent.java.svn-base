package edu.bonn.jbc.polymorphism.task4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class RandomStudent extends Random {
	
	private static final long serialVersionUID = 1L;
	
	/** An array of students that we have in class */
	private Student[] students;
	
	/**
	 * Initializes the student array to a fix test value. The test array
	 * contains the students John Doe, Jane Example, Alice, Bob, and Carol.
	 */
	public RandomStudent() {
		this.students = new Student[]{
			new Student("John Doe"),
			new Student("Jane Example"),
			new Student("Alice"),
			new Student("Bob"),
			new Student("Carol")
		};
	}
	
	/**
	 * Initializes the student array to contain students read from the file with 
	 * the given name. The file should contain the student's name, one per line.
	 * @param filename The name of the file containing the students.
	 */
	public RandomStudent(String filename) {
		File file = new File(System.getProperty("project.home"), filename);
		ArrayList<Student> students = new ArrayList<Student>();
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String line;
			while ((line = br.readLine()) != null) {
				students.add(new Student(line));
			}
		} catch (FileNotFoundException e) {
			System.err.println("Unable to find file " + file.getAbsolutePath());
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println("Unable to read another line from file " + filename);
			e.printStackTrace();
		}
		this.students = students.toArray(new Student[students.size()]);
	}
	
	/**
	 * Returns a random student from the student list
	 * @return a random student
	 */
	public Student nextStudent() {
		return students[super.nextInt(students.length)];
	}
	
	/**
	 * Returns a random student from the student list, but never a student 
	 * in the given list.
	 * @param leaveOut Students that should not be returned as random students
	 * @return A random student from the student list, but never from the list given
	 * as parameter. Might return null if the student list does not contain any student
	 * that is not in the given list.
	 */
	public Student nextStudent(Student[] leaveOut) {
		List<Student> studentList = new LinkedList<Student>(Arrays.asList(this.students));
		studentList.removeAll(Arrays.asList(leaveOut));
		if (studentList.isEmpty()) {
			return null;
		}
		return studentList.get(super.nextInt(studentList.size()));
	}

}
