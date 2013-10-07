package day04task2;

import day04.Student;

public class StudentCopier {
			
//		public Student[] copy(Student[] original) {
//			Student[] copy = new Student[original.length];
//			for (int i=0; i<original.length; i++) {
//				copy[i] = new Student(original[i]);
//			}
//			return copy;
//		}
//		public Student clone(){
//			
//			
//			return null;
//			
//		}
//
//	}


	
	public Student[] copy(Student[] original) {
		return original.clone();
	}

}


