package edu.bonn.jbc.polymorphism.task3;

public class MasterStudent extends Student {

	@Override
	public String getProgram() {
		return MASTER;
	}

	@Override
	public MasterStudent getExampleStudent() {
		MasterStudent example = new MasterStudent();
		example.setName("Bob");
		example.setEmail("bob@uni-bonn.de");
		return example;
	}

}
