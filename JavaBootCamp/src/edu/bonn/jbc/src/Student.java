
public class Student extends Person {
	private String matriculationNumber;

	public Student(String name, String matriculationNumber) {
		super(name);
		this.matriculationNumber = matriculationNumber;
	}
	
	public String getMatriculationNumber() {
		return matriculationNumber;
	}

	public void setMatriculationNumber(String matriculationNumber) {
		this.matriculationNumber = matriculationNumber;
	}

	
	
}
