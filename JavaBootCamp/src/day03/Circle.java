package day03;

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
	public static int generateRandom(){
		//double number  = Math.random()*20+10;

		int randomNum =  10 + (int)(Math.random() * ((20 - 10) + 1));
		return randomNum;

	}
	public void checkInOut(int x,int y){
		double result = Math.pow(x, 2)+Math.pow(y, 2)-Math.pow(radius, 2);
		if (result > 0){
			System.out.println("the point is outside the circle");
		}else{
			if (result == 0){
				System.out.println("The point is on the circle");


			}else 
				System.out.println("The point is on the circle");
		}

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
	
	public int circleArea(){
		int value=  (int) (Math.PI*Math.pow(radius, 2));
		return value;
	}



	public static void main(String[] args) {

		int radius = generateRandom();
		System.out.println("The radius is "+radius);
		Circle c=new Circle(0, 0 , radius);
		c.checkInOut(22, 3);
		c.isInside(22, 3);
		int circleArea = c.circleArea();
		System.out.println("The circle area is "+circleArea);



	}


}
