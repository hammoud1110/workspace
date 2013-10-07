package day03;

public class ReferenceTest {

	
	
	
	public void modifyPerson(Person p){
		p.setName("Jenny");
		p.setAddress("Köln");
		
	}
	public void modifyPrimitive(int primitiveValue){
		primitiveValue += 1;
	}
	
	public static void main(String[] args) {
		Person person = new Person("Haitham", "Bonn");
		int i = 0;
		System.out.println(person.toString());
		System.out.println(i);
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
}
