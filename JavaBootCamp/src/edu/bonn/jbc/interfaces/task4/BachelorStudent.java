package edu.bonn.jbc.interfaces.task4;

public class BachelorStudent extends Student {

	public BachelorStudent(String matriculationNr, String name, String email) {
		super(matriculationNr, name, email);
	}

	public String getProgram() {
		return "Bachelor";
	}

}
