package edu.bonn.jbc.ooc.task2;
//Task 5.2
public class Circle {
	private int x;
	private int y;
	private int radius;
	
	
	public Circle(int x, int y, int radius) {
		super();
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	static int generateRadius(int x, int y){
		double random=Math.random();
		int randomResult=(int)(random*(y-x)+x);
		return randomResult;
	}
	
	public void isInside(int x, int y){
		double value=Math.pow((x-this.x),2)+Math.pow((y-this.x), 2)-Math.pow(radius,2);
		if(value>0){
			System.out.println("The point is outside the circle");
		}
		else if(value==0)
			System.out.println("The point is on the circle");
		else 
			System.out.println("The point is inside the circle");
	}
	public double circleArea(){
		return Math.PI*Math.pow(this.radius, 2);
	}
	
	public static void main(String[] args) {
		int radius=generateRadius(10, 20);
		System.out.println("Radius "+radius);
		Circle c=new Circle(0, 0 , radius);
		c.isInside(22, 3);
		double circleArea=c.circleArea();
		System.out.println("The circle area is "+circleArea);
		
		
	}
	
}
