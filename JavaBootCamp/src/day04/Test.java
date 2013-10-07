package day04;


public class Test {

	public static void main(String[] args) {
		Student alice = new DiplomaStudent("123456", "Alice", "alice@uni-bonn.de");
		Student bob = new BachelorStudent("234567", "Bob", "bob@uni-bonn.de");
		Student carol = new MasterStudent("345678", "Carol", "carol@uni-bonn.de", "UK");

		StudentPrinter p = new StudentPrinter();
		p.print(new Student[]{alice, bob, carol});
	}

}
