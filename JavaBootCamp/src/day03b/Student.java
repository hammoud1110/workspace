package day03b;

import java.util.Calendar;

public class Student extends Person {
	private int matriculationNr;
	
	
	public void getMatriculationNr(int matriculationNr){
		this.matriculationNr = matriculationNr;
	}
	
	public int getMatriculationNr(){
		return matriculationNr;
	}

	
	public Student(String firstName,String lastName,Calendar birthday, int matriculationNr, String email){
		super(firstName,lastName,birthday, email);
		this.matriculationNr = matriculationNr;
	}

	

	

	public void setMatriculationNr(int matriculationNr) {
		this.matriculationNr = matriculationNr;
	}

	@Override
	public String toString() {

		//getName() +((getEmail()==null)? "":","+ getEmail())+ getMatriculationNr();
		return super.toString() + ", "+ matriculationNr;
	}
	
	

}
