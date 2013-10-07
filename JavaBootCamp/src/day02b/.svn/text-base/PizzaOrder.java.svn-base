package day02b;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PizzaOrder {


	/*
	 * private List<Pizza> pizzas;
	private Date orderDate;

	public PizzaOrder() {
		this.pizzas = null;
		this.orderDate = null;
	}

	public PizzaOrder(PizzaOrder original) {
		if (original == null) {
			System.out.println("Fatal error.");
			System.exit(0);
		}
		if (original.pizzas != null)
			this.pizzas = new ArrayList<Pizza>(original.pizzas);
		if (original.orderDate != null)
			this.orderDate = new Date(original.orderDate.getTime());

	}
	
	private List<Pizza> pizzas;
	private Date orderDate;

	public PizzaOrder() {
		this.pizzas = null;
		this.orderDate = null;
	}

	public PizzaOrder(PizzaOrder original){
		if (original == null){
			System.out.println("Fatal error.");
			System.exit(0);
		}
		if (original.pizzas != null){
			this.pizzas = new ArrayList<Pizza>(original.pizzas);
		}
		if (original.pizzas != null){
			this.orderDate = new Date(original.orderDate.getTime());
		}

	}





	public List<Pizza> getPizzas() {
		return pizzas;
	}

	public void setPizzas(List<Pizza> pizzas) {
		this.pizzas = pizzas;
	}
	
	 */
	/*
	 * returns the total cost of the order
	 */
	/*
	public double calcTotal(){
		double total = 0;
		for (Pizza pizza: pizzas){
			total += pizza.calcCost();
		}
		return total;

	}
	 */
	/*
	 * adds a value added tax to the order and rounds the result to an int
	 */
	/*
	public int calcTotal(int vat){
		int total= 0;
		for(Pizza pizza : pizzas){
			total += pizza.calcCost() + (double) vat / 100 * pizza.calcCost();
		}
		return (int)total;
	}
	 */
	/*
	 * checks if the total cost of the order after the value added tax was applied is >30$.
	 *  If it is then a discount of 3$ is applied to the order.
	 */
	
	/*
	public double calcTotal(double totalWithVat){
		int discount = 3;
		double finaltotal=0;
		if (totalWithVat > 30){
			finaltotal = totalWithVat - 3;
		}else{
			finaltotal = totalWithVat + 3;
		}
		return finaltotal;
		
	}
	 */
	/*
	public static void main(String[] args) {
		Pizza p1 = new Pizza("Prosciuto", "Large");
		Pizza p2 = new  Pizza("Margherita", "medium ");
		PizzaOrder inst = new PizzaOrder();
		
		
		
		inst.pizzas.add(p1);
		inst.pizzas.add(p2);
		
		
		inst.calcTotal(10);
		inst.calcTotal(inst.calcTotal(10));
	}
	
	 */
	

	private Pizza pizza1;
	private Pizza pizza2;
	private Pizza pizza3;
	
	PizzaOrder(Pizza pizza1){
		this.pizza1=pizza1;
	
	}
	PizzaOrder(Pizza pizza1, Pizza pizza2){
		this(pizza1);
		this.pizza2= pizza2;
		
	
	}
	PizzaOrder(Pizza pizza1, Pizza pizza2, Pizza pizza3){
		this(pizza1,pizza2);
		this.pizza3 = pizza3;
		
	
	}
	
	public PizzaOrder() {
		// TODO Auto-generated constructor stub
	}
	public void setPizza1(Pizza pizza1) {
		this.pizza1 = pizza1;
	}
	public void stePizza2(Pizza pizza2){
		this.pizza2 = pizza2;
	}
	public void stePizza3(Pizza pizza3){
		this.pizza3 = pizza3;
	}
	
	private double calcTotal(){
		double total = 0;
		if (pizza1 != null){
			total = total + pizza1.calcCost();
		}
		if (pizza2 != null){
			total = total + pizza2.calcCost();
		}
		if (pizza3 != null){
			total = total + pizza3.calcCost();
		}
	return total;
	
	}
	
	//adds a value added tax to the order and rounds the result to an int
	private int calcTotal(int vat){
	double totalWithVat=0;
	totalWithVat = totalWithVat + this.calcTotal() + (double)vat/100* this.calcTotal();
	return (int)totalWithVat;
	
	}
	
	public double calcTotal(double totalWithVat){
		
		
		double finalTotal=0;
		
		if (totalWithVat > 30){
			finalTotal = totalWithVat - 3;
		}else{
			finalTotal = totalWithVat + 3;
		}
		return finalTotal;
	}
	
	
	public static void main(String[] args) {
		
		
		Pizza p1= new Pizza("Prosciuto", "large", 1, 1, 1);
		Pizza p2 = new Pizza("Margherita", "medium", 2, 2, 0);
		PizzaOrder test = new PizzaOrder();
		PizzaOrder inst = new PizzaOrder(p1,p2);
			
		
		test.setPizza1(p1);
		//test.setPizza1(p2);
		System.out.println(test.calcTotal());
		double total = inst.calcTotal();
		System.out.println(total);
		int totalWithVat=inst.calcTotal(10);
		System.out.println("total sum with vat is "+totalWithVat);
		double result=inst.calcTotal((double)totalWithVat);
		System.out.println("The total sum of the PizzaOrder is "+result);
	}
	
}
