package edu.bonn.jbc.ooc.task2;

import java.util.ArrayList;
import java.util.List;

public class WrapperClasses {
	public static void main(String[] args) {
		
		//task 5.3.1
		//int to String 
		int a=10;
		String aa=Integer.toString(a);
		System.out.println(aa);
		
		//String to int
		String b="10";
		Integer bb=Integer.parseInt(b);
		int bbb= bb.intValue();
		System.out.println(bbb);
		
		//double to String 
		double c=2.3;
		String cc=Double.toString(c);
		System.out.println(cc);
		
		//String to double
		String d="2.3";
		Double dd=Double.parseDouble(d);
		double ddd=dd.doubleValue();
		System.out.println(ddd);
		
		//char to String 
		char e='A';
		String ee=Character.toString(e);
		System.out.println(ee);
		
		//String to char
		String f="A";
		Character ff=Character.valueOf(f.charAt(0));
		char fff=ff.charValue();
		System.out.println(fff);
		
		//boolean to String
		boolean g=true;
		String gg=Boolean.toString(g);
		System.out.println(gg);
		
		//String to boolean
		String h="true";
		Boolean hh=Boolean.valueOf(h);
		boolean hhh=hh.booleanValue();
		System.out.println(hhh);
		
		//task 5.3.2
		String text="  53.19  ";
		double number= Double.parseDouble(text.trim());
		System.out.println("The number after removing blanks is "+number);
		
		//task 5.3.3
		Short max=Short.MAX_VALUE;
		Short min=Short.MIN_VALUE;
		System.out.println("The max short value is "+max + " and the min short value is "+min );
		
		//task 5.3.4
		int[] decimalNumbers=new int[args.length];
		for(int i=0;i<args.length;i++){
			int decimalNumber = Integer.parseInt(args[i],2);
			System.out.println("Decimal numbers "+decimalNumber);
		}
		
		for(int i=0;i<args.length;i++){
			Integer decimalNumber = Integer.valueOf(args[i],2);
			int decNumber=decimalNumber.intValue();
			System.out.println("Decimal numbers "+decNumber);
		}
		
		//task 5.3.5
		int nr = 56;
		String strBinaryNumber = Integer.toBinaryString(nr);
		System.out.println("Binary value of " + nr + " is " + strBinaryNumber);
		
		String strHexaNumber=Integer.toHexString(nr);
		System.out.println("Hexa value of " + nr + " is " + strHexaNumber);
		
		//task 5.3.6
		Integer ii1=new Integer(2011);
		Integer ii2=new Integer(2011);
		if(ii1==ii2)
			System.out.println("ii1 and ii2 are the same object");
		else
			System.out.println("ii1 and ii2 are not the same");
		
		
//		In order to save memory, two instances of the
//		following wrapper objects will always be == when their primitive values are the same:
//		n Boolean
//		n Byte
//		n Character from \u0000 to \u007f (7f is 127 in decimal)
//		n Short and Integer from -128 to 127
		
		Integer i1 = 1000;
		Integer i2 = 1000;
		if(i1 != i2) System.out.println("different objects");
		if(i1.equals(i2)) System.out.println("meaningfully equal");

		
		Integer i3 = 10;
        Integer i4 = 10;
        if(i3 == i4) System.out.println("same object");
        if(i3.equals(i4)) System.out.println("meaningfully equal");

		
		int[] ar={1,2,3,4,5,6,7,8,9,10};
		List list=new ArrayList<Integer>();
		for(int i=0;i<ar.length;i++){
			list.add(ar[i]);
		}
		
		
		
		
	}
}
