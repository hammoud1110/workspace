package edu.bonn.jbc.collections.pizza;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class PizzaShop {

	private List<PizzaOrder> orders;
	private String pizzaMaker;
	private String address;

	private List<Pizza> inTheOven=new ArrayList<Pizza>();
	private List<Pizza> backed=new ArrayList<Pizza>();
	public Queue<Pizza> pizzaQueue;
	private Timer t = new Timer();

	public PizzaShop(List<PizzaOrder> orders, String pizzaMaker, String address) {
		super();
		this.orders = orders;
		this.pizzaMaker = pizzaMaker;
		this.address = address;
	}

	public List<PizzaOrder> getOrders() {
		return orders;
	}

	public void setOrders(List<PizzaOrder> orders) {
		this.orders = orders;
	}

	public String getPizzaMaker() {
		return pizzaMaker;
	}

	public void setPizzaMaker(String pizzaMaker) {
		this.pizzaMaker = pizzaMaker;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Pizza> getAllPizzasByName(String name) {
		List<Pizza> allPizzas = new ArrayList<Pizza>();
		Iterator<PizzaOrder> it = orders.iterator();
		while (it.hasNext()) {
			PizzaOrder pizzaOrder = it.next();
			List<Pizza> pizzas = pizzaOrder.searchPizza(name, pizzaOrder
					.getPizzas());
			allPizzas.addAll(pizzas);
		}
		return allPizzas;
	}

	public List<PizzaOrder> sortPizzaOrdersByDate() {
		Collections.sort(this.orders, new ReSortComparator());
		return this.orders;
	}

	public Queue<Pizza> putInQueue() {
		List<PizzaOrder> order = this.sortPizzaOrdersByDate();
		Iterator<PizzaOrder> it = order.iterator();
		Queue<Pizza> allPizzas = new Queue<Pizza>();
		while (it.hasNext()) {
			PizzaOrder po = it.next();
			List<Pizza> pi = po.getPizzas();
			Iterator<Pizza> iter = pi.iterator();
			while (iter.hasNext()) {
				allPizzas.put(iter.next());
			}

		}
		pizzaQueue = allPizzas;
		return allPizzas;
	}

	public void backe() {
		putInQueue();
		System.out.println("Done putinQueue");
		TimerTask tt = new TimerTask() {

				@Override
				public void run() {
					// TODO Auto-generated method stub
					if (!pizzaQueue.isEmpty()) {
						if(!inTheOven.isEmpty()){
							System.out.println("Enter here");
							Iterator<Pizza> it = inTheOven.iterator();
							while (it.hasNext()) {
								backed.add(it.next());
//								inTheOven.remove(it.next());
							}
							inTheOven.clear();
						}
						System.out.println("At the moment in the oven are the following pizzas:");
						if(pizzaQueue.size()<4){
							System.out.println("or here");
							for (int i = 0; i < pizzaQueue.size(); i++) {
								Pizza p=pizzaQueue.get();
								inTheOven.add(p);
								System.out.println(p.toString());
								
							}
							System.out.println("size"+inTheOven.size());
						}
						else{
							System.out.println("oror here");
							for (int i = 0; i < 4; i++) {
								Pizza p=pizzaQueue.get();
								inTheOven.add(p);
								System.out.println(p.toString());
							}
							System.out.println("size"+inTheOven.size());
						}

					}
					else{ 
						System.out.println("entered else");
						t.cancel();
					}
				}

			};
		
			t.schedule(tt, 0, 3 * 1000);

		}
	

	static class ReSortComparator implements Comparator<PizzaOrder> {
		public int compare(PizzaOrder p1, PizzaOrder p2) {
			if (p1.getOrderDate().before(p2.getOrderDate()))
				return -1;
			else if (p1.getOrderDate().after(p2.getOrderDate()))
				return 1;
			else
				return 0;
		}
	}

}
