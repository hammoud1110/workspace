package day03;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class WrapperClasses {
	
	
	public double modify(){
		String s ="5319";
	
		double d = Double.parseDouble(s.trim());
		return d;
	}
	
	
	public void integerMethods(){
		String i = "§§§";
		Double f = 33.33;
		try {
			
			//double j = Double.parseDouble(i);
			String h = f.toString();
			System.out.println(h);
			//System.out.println(j);
		} catch (Exception e) {
			// TODO: handle exception
		e.printStackTrace();
		}
		
		
	}
	
	
	/*
	 * Task 5.3 part 3
	 */
	public short shortMinMax(){
		System.out.println("min " + Short.MIN_VALUE);
		System.out.println("min " + Short.MAX_VALUE);
		return 0;
	}
	
	
	/*
	 * Task 5.3 part 4
	 */
	public void convertString(){
		String[] liste = {"11101", "10001", "00111", "110", "1101"};
		int[] decimalNumbers=new int[liste.length];
		for (int i=0;i<liste.length;i++){
			int decimalNumber = Integer.parseInt(liste[i],2);
			System.out.print(decimalNumber + " ");
		}
	}
	
	
	/*
	 * Task 5.3 part 5
	 */
	public void convertBinaryHaxadecimal(){
		int x = 28;
		String y = Integer.toBinaryString(x);
		System.out.println(y);
		String z = Integer.toHexString(x);
		System.out.println(z);
	}
	
	/*
	 * Task 5.3.6
	 */
	public void checkEqual(){
		Integer objekt1 = new Integer(2011);
		Integer objekt2 = new Integer(2011);
		
		if (objekt1.intValue() == objekt2.intValue()){
			System.out.println("==");
		}else{
			System.out.println("unmöglich");
		}
		if (objekt1.equals(objekt2)){
			System.out.println("equal");
		}
	}
	
	
	
	
	public static void main(String[] args) {

		WrapperClasses w = new WrapperClasses();
		//System.out.println(w.modify());
		
		//w.integerMethods();
		//w.shortMinMax();
		//w.convertString();
		//w.convertBinaryHaxadecimal();
		w.checkEqual();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
