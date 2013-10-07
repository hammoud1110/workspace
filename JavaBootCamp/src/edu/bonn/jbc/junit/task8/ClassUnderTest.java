package edu.bonn.jbc.junit.task8;

public class ClassUnderTest {
	
	private String string;
	
	public String createStringOnce() {
		if (string == null) {
			string = "TestString";
			return string;
		} else {
			throw new IllegalAccessError("This method may only be called once!");
		}
	}
	
	public String doubleString(String original) {
		return original + original;
	}

}
