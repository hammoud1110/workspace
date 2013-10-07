package edu.bonn.jbc.polymorphism.task1;

public class MasterStudent extends Student {
	
	private String homeCountry;

	public MasterStudent(String matriculationNr, String name, String email, String homeCountry) {
		super(matriculationNr, name, email);
		this.homeCountry = homeCountry;
	}
	
	public String getHomeCountry() {
		return homeCountry;
	}
	
	public void setHomeCountry(String homeCountry) {
		this.homeCountry = homeCountry;
	}

	public String getProgram() {
		return "Master";
	}

}
