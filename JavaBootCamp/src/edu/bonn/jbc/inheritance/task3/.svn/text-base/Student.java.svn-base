package edu.bonn.jbc.inheritance.task3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Student {
	
	private static final DateFormat DATE_FORMAT = new SimpleDateFormat("dd.MM.yyyy");
	
	private String firstName;
	private String lastName;
	private Calendar birthday;
	private String matriculationNr;
	
	public Student(String firstName, String lastName, Calendar birthday, String matriculationNr) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthday = birthday;
		this.matriculationNr = matriculationNr;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public Calendar getBirthday() {
		return birthday;
	}
	
	public void setBirthday(Calendar birthday) {
		this.birthday = birthday;
	}
	
	public String getMatriculationNr() {
		return matriculationNr;
	}
	
	public void setMatriculationNr(String matriculationNr) {
		this.matriculationNr = matriculationNr;
	}
	
	@Override
	public String toString() {
		return "Name: " + firstName + " " + lastName + ", birthday: " + 
			DATE_FORMAT.format(birthday.getTime()) + ", matriculation nr: " + matriculationNr;
	}
	
}
