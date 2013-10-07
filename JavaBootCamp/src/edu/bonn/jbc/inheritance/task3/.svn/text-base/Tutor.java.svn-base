package edu.bonn.jbc.inheritance.task3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Tutor {
	
	private static final DateFormat DATE_FORMAT = new SimpleDateFormat("dd.MM.yyyy");
	
	private String firstName;
	private String lastName;
	private Calendar birthday;
	private String email;
	
	public Tutor(String firstName, String lastName, Calendar birthday, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthday = birthday;
		this.email = email;
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
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Name: " + firstName + " " + lastName + ", birthday: " + 
			DATE_FORMAT.format(birthday.getTime()) + ", email: " + email;
	}
	
}
