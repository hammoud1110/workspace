package edu.bonn.jbc.exceptions.task4;

public class Pizza {
	
	private String name;
	private String size;
	
	public Pizza(String name) {
		this.name = name;
	}
	
	public Pizza(String name, String size) { 
		this(name);
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
	
}
