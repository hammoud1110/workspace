package day03b;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;



public class Person {
	private static final DateFormat DATE_FORMAT = new SimpleDateFormat("dd.MM.yyyy"); 
	private String firstName;
	private String lastName;
	private Calendar birthday;
	private String email;
	
	public String getFirstName(){
		return this.firstName ;
	}
	
	
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}


	public String getEmail() {
		return this.email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	public Person(String firstName, String lastName, Calendar birthday) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthday = birthday;
	}
	public Person(String firstName, String lastName, Calendar birthday, String email) {
		
		this(firstName,lastName,birthday);
		this.email = email;
		
		
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


	@Override
	public String toString() {
		return "Name: " + firstName + " " + lastName + ", birthday: " + DATE_FORMAT.format(birthday.getTime());
	}
	
	
	
	
}
