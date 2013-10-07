package edu.bonn.jbc.ooc.task2;

//task 5.5
class ReferenceTest {
	
	void modifyObject(Person person) {
		person.setName("Jenny");
		person.setAddress("Koln");
		
	}
	void modifyPrimitive(int primitive){
		primitive=primitive+1;
	}
	
	void modifyWrapperObject(Integer wrapperObject){
		wrapperObject=wrapperObject+1;
	}
	void modifyString(String str){
		str=str+" string";
	}
	public static void main(String[] args) {

		Person object = new Person("Cris", "Bonn");
		int primitive=0;
		Integer wrapperObject=new Integer(42);
		String str="test";
		
		ReferenceTest rt = new ReferenceTest();
		System.out.println("Before modify() owner= " + object.toString());
		System.out.println("Before modify() primitive= "+primitive);
		System.out.println("Before modify() wrapperObject= "+wrapperObject);
		System.out.println("Before modify() string= "+str);
		rt.modifyObject(object);
		rt.modifyPrimitive(primitive);
		rt.modifyWrapperObject(wrapperObject);
		rt.modifyString(str);
		
		/*We notice that for the primitive type the vaalue is not changed since the argument that is passed to the modify methid is just
		 * a copy of the variable and not the variable itself. In comparison, for the object, we pass a copy of the reference to the variable
		 * which will still refer to the object. So the object will be modified.*/
		System.out.println("After modify() owner = " + object.toString());
		System.out.println("After modify() primitive= "+primitive);
		
		/*We notice that for String and for Wrapper classes the value of the object is not changed. Even though we pass the copy of 
		 * the reference as argument in the modify method. This happens because in the modify method we create different objects by 
		 * manipulating the Integer or the String. Wrapper classes and Strings are immutable -contain no methods that can change the 
		 * data in the object*/
		System.out.println("After modify() wrapperObject= "+primitive);
		System.out.println("After modify() string= "+str);
		
	}

	
}
