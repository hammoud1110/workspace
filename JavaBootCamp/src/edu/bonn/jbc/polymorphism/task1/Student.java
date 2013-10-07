package edu.bonn.jbc.polymorphism.task1;

public class Student {
	
	private String matriculationNr;
	private String name;
	private String email;
	
	public Student(Student student) {
		this.matriculationNr = student.getMatriculationNr();
		this.name = student.getName();
		this.email = student.getEmail();
	}
	
	public Student(String matriculationNr, String name, String email) {
		this.matriculationNr = matriculationNr;
		this.name = name;
		this.email = email;
	}

	public String getMatriculationNr() {
		return matriculationNr;
	}

	public void setMatriculationNr(String matriculationNr) {
		this.matriculationNr = matriculationNr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
