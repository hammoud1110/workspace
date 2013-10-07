package day02b;

public class Dog {
	private String name;
	private int age;
	private int weight;
	
	private Collar collar;
	private Owner owner;
	public Dog(String name, int age, int weight, Collar collar, Owner owner) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.collar = collar;
		this.owner = owner;
	}
	
		
	public Dog() {
		
	}

	public Dog(String name, int age, int weight) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public Collar getCollar() {
		return collar;
	}
	public void setCollar(Collar collar) {
		this.collar = collar;
	}
	public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	
	
	public void bark(){
		
	}
	
	public void bark(char c, byte b){
		System.out.println("bark char");
	}
	

	
	public void bark(byte b, char c){
		System.out.println("bark byte");
	}
	
	public void bark(short s){
		System.out.println("bark short");
	}
	
	public void bark(int i){
		System.out.println("bark int");
	}
	
	public void bark(double d){
		System.out.println("bark double");
	}
	
	public void bark(long l){
		System.out.println("bark long");
	}
	
	
	
	
	public static void main(String[] args) {
		
	}
	
	
	
	
	
	
	
	
}
