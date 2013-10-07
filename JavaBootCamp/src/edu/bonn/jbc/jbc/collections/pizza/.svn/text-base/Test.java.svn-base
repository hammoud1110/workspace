package edu.bonn.jbc.collections.pizza;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		Pizza pizza1=new Pizza("Prosciuto", "medium", 1, 1 ,1,1);
		Pizza pizza2=new Pizza("Margherita", "large", 2, 2 ,0,2);
		Pizza pizza3=new Pizza("Funghi", "large", 2, 2 ,0,3);
		Pizza pizza4=new Pizza("Funghi", "medium", 2, 2 ,0,3);
		
		
		
		List<Pizza> pizzas1=new ArrayList<Pizza>();
		pizzas1.add(pizza1);
		pizzas1.add(pizza2);
		pizzas1.add(pizza3);
		pizzas1.add(pizza4);
		
		PizzaOrder pizzaOrder1=new PizzaOrder();
		pizzaOrder1.setPizzas(pizzas1);
		
		Date d=new Date();
		pizzaOrder1.setOrderDate(new Date(d.getTime()-1200*1000) );
		
		Pizza pizza11=new Pizza("Margherita", "medium", 1, 1 ,1,1);
		Pizza pizza22=new Pizza("Margherita", "large", 2, 2 ,0,2);
		Pizza pizza33=new Pizza("Funghi", "large", 2, 2 ,0,3);
		Pizza pizza44=new Pizza("QuatroStagione", "medium", 2, 2 ,0,3);
		
		
		
		List<Pizza> pizzas2=new ArrayList<Pizza>();
		pizzas2.add(pizza11);
		pizzas2.add(pizza22);
		pizzas2.add(pizza33);
		pizzas2.add(pizza44);
		
		PizzaOrder pizzaOrder2=new PizzaOrder();
		pizzaOrder2.setPizzas(pizzas2);
		pizzaOrder2.setOrderDate(new Date(d.getTime()-2400*1000) );
		
		List<PizzaOrder> pizzaOrders=new ArrayList<PizzaOrder>();
		pizzaOrders.add(pizzaOrder1);
		pizzaOrders.add(pizzaOrder2);
		
		
//		int totalWithVat=pizzaOrder1.calcTotal(10);
//		System.out.println("total sum with vat is "+totalWithVat);
//		double result=pizzaOrder1.calcTotal((double)totalWithVat);
//		System.out.println("The total sum of the PizzaOrder is "+result);
//		
//		
//		
//		
//		
//		
//		System.out.println("The pizza order 1 before sorting pizzas by name:");
//		System.out.println(pizzaOrder1.toString());
//		pizzaOrder1.sortPizzasByName(pizzas1);
//		System.out.println("The pizza order 1 after sorting pizzas by name:");
//		System.out.println(pizzaOrder1.toString());
//		
		PizzaShop ps=new PizzaShop(pizzaOrders, "Mikele", "Romerstrasse nr.5");
//		List ms=ps.getAllPizzasByName("Margherita");
//		System.out.println(ms.toString());
//		
//		
		System.out.println("Pizza orders sorted by date: "+ps.sortPizzaOrdersByDate().toString());
		
		System.out.println("List of pizzas: "+ps.putInQueue().toString());
		System.out.println("Pizza queue size is "+ps.pizzaQueue.size());
		ps.backe();
//		ReSortComparator re=new ReSortComparator();
//		Collections.sort(pizzaOrder1.getPizzas(), re);
//		System.out.println(pizzaOrder1.toString());
//		
//		System.out.println(PizzaOrder.searchPizza("Funghi", pizzas1).toString());
//		Pizza.isTheSame(pizza1, pizza2);
	}
}
