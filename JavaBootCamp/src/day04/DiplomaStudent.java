package day04;



public class DiplomaStudent extends Student {

	public DiplomaStudent(String matriculationNr, String name, String email) {
		super(matriculationNr, name, email);
	}

	public String getProgram() {
		return "Diploma";
	}

}

