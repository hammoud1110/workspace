package day04task4;




public class Student {
	
	private String name;
	
	public Student(String name) {
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Student)) {
			return false;
		}
		Student o = (Student)obj;
		if (this.name == null) {
			return o.getName() == null;
		} else {
			return this.name.equals(o.getName());
		}
	}
	
	@Override
	public String toString() {
		return this.name;
	}

}
