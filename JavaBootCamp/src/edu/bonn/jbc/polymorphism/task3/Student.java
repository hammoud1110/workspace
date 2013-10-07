package edu.bonn.jbc.polymorphism.task3;

public abstract class Student {
	
	final static String BACHELOR = "Bachelor";
	final static String MASTER   = "Master";
	final static String DIPLOMA  = "Diploma";
	
	private String name;
	private String email;
	
	public abstract String getProgram();
	
	protected abstract Student getExampleStudent();
	
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
