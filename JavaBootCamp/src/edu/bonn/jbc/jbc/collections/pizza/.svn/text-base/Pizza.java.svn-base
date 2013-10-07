package edu.bonn.jbc.collections.pizza;
/**Pizza class
 * @author Cristina
 * @version 1.0 */
public class Pizza {
	//task 1.1
	private String name;
	private String size;
	private int cheeseToppingsNr;
	private int pepperoniToppingsNr;
	private int hamToppingsNr;
	private int ID=0;
	
	

	public static int numberOfPizzas=0;
	
	public Pizza(String name){
		this.name=name;
	}
	//task 1.3
	public Pizza(String name, String size){
		this.name=name;
		this.size=size;
		ID=++numberOfPizzas;
	}
	
	//task 1.4
	public Pizza(String name, String size, int ID,int cheeseToppingsNr, int pepperoniToppingsNr,int hamToppingsNr){
		this(name,size);
		this.cheeseToppingsNr=cheeseToppingsNr;
		this.pepperoniToppingsNr=pepperoniToppingsNr;
		this.hamToppingsNr=hamToppingsNr;
		
	}
	//task 5.6.1
	public Pizza(Pizza original){
		if(original==null){
			System.out.println("Fatal error.");
			System.exit(0);
		}
		this.name=original.name;
		this.size=original.size;
		this.cheeseToppingsNr=original.cheeseToppingsNr;
		this.hamToppingsNr=original.hamToppingsNr;
		this.pepperoniToppingsNr=original.pepperoniToppingsNr;
		ID=++numberOfPizzas;
	}
	
	public static int getNumberOfPizzas(){
		return numberOfPizzas;
	}
	public static boolean isTheSame(Pizza p1, Pizza p2){
		if(p1.getName().equals(p2.getName()) && (p1.getSize().equals(p2.getSize())) && (p1.getCheeseToppingsNr()==p2.getCheeseToppingsNr())
				&& (p1.getHamToppingsNr()==p2.getHamToppingsNr()) && (p1.getPepperoniToppingsNr()==p2.getPepperoniToppingsNr() ) && (p1.getID()==p2.getID())){
			System.out.println("The 2 pizzas are the same");
			return true;
		}
		else {
			System.out.println("the 2 pizzas are not the same");
			return false;
		}
		
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
	
	public int getCheeseToppingsNr() {
		return cheeseToppingsNr;
	}

	public void setCheeseToppingsNr(int cheeseToppingsNr) {
		this.cheeseToppingsNr = cheeseToppingsNr;
	}

	public int getPepperoniToppingsNr() {
		return pepperoniToppingsNr;
	}

	public void setPepperoniToppingsNr(int pepperoniToppingsNr) {
		this.pepperoniToppingsNr = pepperoniToppingsNr;
	}

	public int getHamToppingsNr() {
		return hamToppingsNr;
	}

	public void setHamToppingsNr(int hamToppingsNr) {
		this.hamToppingsNr = hamToppingsNr;
	}
	
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}
	
	//task 1.6
	@Override
	public String toString() {
		return "Pizza [cheeseToppingsNr=" + cheeseToppingsNr
				+ ", hamToppingsNr=" + hamToppingsNr + ", name=" + name
				+ ", pepperoniToppingsNr=" + pepperoniToppingsNr + ", size="
				+ size + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cheeseToppingsNr;
		result = prime * result + hamToppingsNr;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + pepperoniToppingsNr;
		result = prime * result + ((size == null) ? 0 : size.hashCode());
		return result;
	}
	
	//task 1.2
	public boolean isTheSame(Pizza p) {
		if (cheeseToppingsNr != p.cheeseToppingsNr)
			return false;
		if (hamToppingsNr != p.hamToppingsNr)
			return false;
		if (name == null) {
			if (p.name != null)
				return false;
		} else if (!name.equals(p.name))
			return false;
		if (pepperoniToppingsNr != p.pepperoniToppingsNr)
			return false;
		if (size == null) {
			if (p.size != null)
				return false;
		} else if (!size.equals(p.size))
			return false;
		return true;
	}
	
	//task 1.5
	public double calcCost(){
		double cost=0;
		if(size.equalsIgnoreCase("small")){
			cost=10+2*this.cheeseToppingsNr+2*this.hamToppingsNr+2*this.pepperoniToppingsNr;
		}
		else if(size.equalsIgnoreCase("medium")){
			cost=12+2*this.cheeseToppingsNr+2*this.hamToppingsNr+2*this.pepperoniToppingsNr;
		}
		else if(size.equalsIgnoreCase("large")){
			cost=14+2*this.cheeseToppingsNr+2*this.hamToppingsNr+2*this.pepperoniToppingsNr;
		}
		return cost;
	}
	
	//task 1.7
	public String getDescription(){
		return this.toString()+" at the price "+calcCost();
	}

	
	
}
