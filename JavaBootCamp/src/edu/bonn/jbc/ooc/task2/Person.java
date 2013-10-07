package edu.bonn.jbc.ooc.task2;
//task 5.5
public class Person {
	private String name;
	private String address;
	
	@Override
	public String toString() {
		return "Person [address=" + address + ", name=" + name + "]";
	}
	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
