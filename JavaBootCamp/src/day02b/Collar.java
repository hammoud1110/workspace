package day02b;

public class Collar {
	private int id;
	private String color;
	private Manufacturer manufacturer;
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public Manufacturer getManufacturer() {
		return manufacturer;
	}


	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}


	public Collar(int id, String color, Manufacturer producer) {
		super();
		this.id = id;
		this.color = color;
		this.manufacturer = producer;
	}







}
