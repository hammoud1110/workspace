package edu.bonn.jbc.collections.pizza;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class PizzaOrder {
	private List<Pizza> pizzas;
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

	public PizzaOrder(List<Pizza> p, Date orderDate) {
		this.pizzas = p;
		this.orderDate = orderDate;
	}

	public static void sortPizzasByName(List<Pizza> pizzas) {
		Collections.sort(pizzas, new ReSortComparator());

	}

	public static List<Pizza> searchPizza(String pizzaName, List<Pizza> pizzas) {
		Collections.sort(pizzas, new ReSortComparator());
		List<Pizza> pizzasToRemove = new ArrayList<Pizza>();
		Pizza pizza = new Pizza(pizzaName);
		int index = Collections.binarySearch(pizzas, pizza,
				new ReSortComparator());
		while (index >= 0) {

			System.out.println("Index is " + index);
			Pizza removedPizza = pizzas.remove(index);
			pizzasToRemove.add(removedPizza);
			index = Collections.binarySearch(pizzas, pizza,
					new ReSortComparator());
		}
		return pizzasToRemove;
	}

	public List<Pizza> getPizzas() {
		return pizzas;
	}

	public void setPizzas(List<Pizza> pizzas) {
		this.pizzas = pizzas;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	private double calcTotal() {
		double total = 0;
		for (Pizza pizza : pizzas) {
			total = total + pizza.calcCost();
		}
		return total;
	}

	public int calcTotal(int vat) {
		double totalWithVat = this.calcTotal() + (double) vat / 100
				* this.calcTotal();
		return (int) totalWithVat;
	}

	public double calcTotal(double totalWithVat) {
		int discount = 3;
		double finalTotal = 0;
		if (totalWithVat > 30) {
			finalTotal = totalWithVat - 3;
		} else {
			finalTotal = totalWithVat + 3;
		}
		return finalTotal;
	}

	public void addToOrder(Pizza p) {
		pizzas.add(p);
	}

	

	@Override
	public String toString() {
		return "PizzaOrder [orderDate=" + orderDate + ", pizzas=" + pizzas
				+ "]";
	}



	static class ReSortComparator implements Comparator<Pizza> {
		public int compare(Pizza p1, Pizza p2) {
			if (p1.getName().compareToIgnoreCase(p2.getName()) < 0)
				return -1;
			else if (p1.getName().compareToIgnoreCase(p2.getName()) > 0)
				return 1;
			else
				return 0;
		}
	}

}
