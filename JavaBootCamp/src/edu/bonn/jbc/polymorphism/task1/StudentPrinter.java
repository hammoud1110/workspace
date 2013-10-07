package edu.bonn.jbc.polymorphism.task1;

public class StudentPrinter {
	
	public void print(Student[] students) {
		StringBuilder sb = new StringBuilder();
		sb.append("matr no\t| email\t\t\t| program\t| home country (Master only)\n");
		for (Student student : students) {
			sb.append(student.getMatriculationNr());
			sb.append("\t| ");
			sb.append(student.getEmail());
			sb.append("\t| ");
			if (student instanceof BachelorStudent) {
				sb.append(((BachelorStudent)student).getProgram());
			}
			if (student instanceof MasterStudent) {
				sb.append(((MasterStudent)student).getProgram());
			}
			if (student instanceof DiplomaStudent) {
				sb.append(((DiplomaStudent)student).getProgram());
			}
			sb.append("\t| ");
			if (student instanceof MasterStudent) {
				sb.append(((MasterStudent)student).getHomeCountry());
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}


}
