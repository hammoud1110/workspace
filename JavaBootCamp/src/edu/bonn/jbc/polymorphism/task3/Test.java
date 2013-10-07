package edu.bonn.jbc.polymorphism.task3;

public class Test {
	
	public static void main(String[] args) {
		BachelorStudent bachelor = new BachelorStudent().getExampleStudent();
		if (bachelor.getName() == null || bachelor.getEmail() == null) {
			System.err.println("The example bachelor student should have name and email address!");
		}
		if (!"Bachelor".equals(bachelor.getProgram())) {
			System.err.println("The bachelor student's program should be \"Bachelor\"!");
		}
		
		MasterStudent master = new MasterStudent().getExampleStudent();
		if (master.getName() == null || master.getEmail() == null) {
			System.err.println("The example master student should have name and email address!");
		}
		if (!"Master".equals(master.getProgram())) {
			System.err.println("The master student's program should be \"Master\"!");
		}
		
		DiplomaStudent diploma = new DiplomaStudent().getExampleStudent();
		if (diploma.getName() == null || diploma.getEmail() == null) {
			System.err.println("The example diploma student should have name and email address!");
		}
		if (!"Diploma".equals(diploma.getProgram())) {
			System.err.println("The diploma student's program should be \"Diploma\"!");
		}
		
		System.out.println("Well done!");
	}

}
