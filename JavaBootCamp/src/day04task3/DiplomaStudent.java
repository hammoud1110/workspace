package day04task3;

public class DiplomaStudent extends Student {

	
	public DiplomaStudent(String name, String email){
		super(name,email);
	}
	
	public DiplomaStudent(){
		
	}
	
	
	@Override
	public String getProgram() {
		// TODO Auto-generated method stub
		return Diploma;
	}

	@Override
	protected Student getExampleStudent() {
		// TODO Auto-generated method stub
		 return new DiplomaStudent(getName(), getEmail());
	}

}
