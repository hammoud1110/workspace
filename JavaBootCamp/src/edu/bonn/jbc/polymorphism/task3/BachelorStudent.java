package edu.bonn.jbc.polymorphism.task3;

public class BachelorStudent extends Student {

	@Override
	public String getProgram() {
		return BACHELOR;
	}

	@Override
	public BachelorStudent getExampleStudent() {
		BachelorStudent example = new BachelorStudent();
		example.setName("Carol");
		example.setEmail("carol@uni-bonn.de");
		return example;
	}

}
