package day02b;

public class Pizza {
	private String name;
	private String size;
	private int cheeseToppings,pepperoniToppings,hamToppings;
	
	public int getCheeseToppings() {
		return cheeseToppings;
	}
	public int getHamToppings() {
		return hamToppings;
	}
	public int getPepperoniToppings() {
		return pepperoniToppings;
	}
	public String getName() {
		return name;
	}
	public String getSize() {
		return size;
	}
	public void setCheeseToppings(int cheeseToppings) {
		this.cheeseToppings = cheeseToppings;
	}
	public void setHamToppings(int hamToppings) {
		this.hamToppings = hamToppings;
	}
	public void setPepperoniToppings(int pepperoniToppings) {
		this.pepperoniToppings = pepperoniToppings;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSize(String size) {
		this.size = size;
	}

	
	//check if 2 pizzas are the same
	public boolean isTheSame(Pizza p){
		Pizza q= new Pizza(name, size);
		 if ( (q.getSize().equals(p.getSize()) &&
			q.getHamToppings()== p.getHamToppings() &&
			q.getCheeseToppings() == p.getCheeseToppings() &&
			q.getPepperoniToppings() == p.getPepperoniToppings() &&
			q.getName().equals(p.getName())) ) {
			 System.out.println("They are the same");
			 return true;
		 }else
		 {
			System.out.println("not the same");
		return false;
		 }
		 
	}
	
	public Pizza(String name,String size){
		this.name = name;
		this.size = size; 
	}
	public Pizza(String name, String size, int cheeseToppings, int pepperoniToppings,int hamToppings){
		this(name,size);
		this.cheeseToppings=cheeseToppings;
		this.pepperoniToppings=pepperoniToppings;
		this.hamToppings=hamToppings;
	}
	
	
	public double calcCost(){
	double cost=0;
		if (size.equalsIgnoreCase("small")) {
			cost= 10 + 2*this.cheeseToppings + 2*this.hamToppings + 2*this.pepperoniToppings;
		}else
			if(size.equalsIgnoreCase("medium")){
				cost= 12 + 2*this.cheeseToppings + 2*this.hamToppings + 2*this.pepperoniToppings;
			}else
				if (size.equalsIgnoreCase("large")){
					cost= 14 + 2*this.cheeseToppings + 2*this.hamToppings + 2*this.pepperoniToppings;
				}
		
		return cost;
	}
	
	
	public String toString(){
		
		
		return "Pizza [cheeseToppingsNr=" + cheeseToppings
				+ ", hamToppingsNr=" + hamToppings 
				+ ", name=" + name
				+ ", pepperoniToppingsNr=" + pepperoniToppings 
				+ ", size="	+ size + "]";
				
	}
	
	public String getDescription (){
		return this.toString() + " "+calcCost();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
