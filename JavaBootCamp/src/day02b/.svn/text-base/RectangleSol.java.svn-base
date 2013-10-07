package day02b;

import org.w3c.dom.css.Rect;

public class RectangleSol {
	private int x1,x2,y1,y2;


	public RectangleSol(int x1,int x2,int y1,int y2){
		this.x1= x1;
		this.x2= x2;
		this.y1= y1;
		this.y2= y2;
	}
	public RectangleSol(int width, int hight){
		this(0,0,width,hight);
	}

	public RectangleSol() {
		this(0,0,0,0);
	}

	public void move (int deltax, int deltay){
		x1+=deltax;  x2+=deltax;
		y1+=deltay;  y2+=deltay;
	}

	public Boolean isInside(int x1,int y1){

		return ((x1 >= this.x1) && (x1 <= this.x2)&& (y1 >= this.y1)&&(y1 <= this.x2));

	}
	/*
	 * Returns the smallest rectangle that includes them both.
	 * (this.x1 < r.x1) ? this.x1 : r.x1,
	                        (this.y1 < r.y1) ? this.y1 : r.y1,
	                        (this.x2 > r.x2) ? this.x2 : r.x2,
	                        (this.y2 > r.y2) ? this.y2 : r.y2);
	 */
	public RectangleSol union(RectangleSol r){
		return  new RectangleSol((r.x1 > this.x1) ? this.x1 : r.x1,
				(r.x2 < this.x2) ? this.x2: r.x2,
						(r.y1 > this.y1) ? this.y1 : r.y1,
								(r.y2 < this.y2) ? this.y2 : r.y2);

	}

	/*
	 * RectangleSol result =  new RectangleSol((this.x1 > r.x1) ? this.x1 : r.x1,
	                                (this.y1 > r.y1) ? this.y1 : r.y1,
	                                (this.x2 < r.x2) ? this.x2 : r.x2,
	                                (this.y2 < r.y2) ? this.y2 : r.y2);
	 */
	public RectangleSol intersection(RectangleSol r){
		//RectangleSol result= new RectangleSol( (this.x1 < r.x1) ? r.x1 : this.x1,
		//	                 (this.y1 > r.y1) ? r.y1 : this.y1,
		RectangleSol result =  new RectangleSol((this.x1 > r.x1) ? this.x1 : r.x1,
				(this.y1 > r.y1) ? this.y1 : r.y1,
						(this.x2 > r.x2) ? r.x2 : this.x2,
								(this.y2 > r.y2) ? r.y2 : this.y2);

		if (result.x1 > result.x2) { result.x1 = result.x2 = 0; }
		if (result.y1 > result.y2) { result.y1 = result.y2 = 0; }
		return result;
	}

	public static void main(String[] args) {
		RectangleSol rect=new RectangleSol(50,50);

		rect.move(10, 10);
		System.out.println("Rectangle "+rect.toString());


		if(rect.isInside(33, 30)==true){
			System.out.println("The point (30,30) is inside the rectangle");
		}
		else{
			System.out.println("The point (30,30) is not inside the rectangle");
		}

		RectangleSol rectIntersection=rect.intersection(new RectangleSol(20, 20, 80, 80));
		System.out.println("The intersection rectangle "+rectIntersection.toString());

		RectangleSol rectUnion=rect.union(new RectangleSol(20, 20, 80, 80));
		System.out.println("The union rectangle "+rectUnion.toString());
	}	





}
