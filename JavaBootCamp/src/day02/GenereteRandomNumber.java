package day02;

import java.util.Random;

public class GenereteRandomNumber {
	public static void main(String[] args) {


		double random = Math.random();
		for(int i = 4; i > 0; i--) {
			if (random <= 0.7) {
				System.out.println(random);
				random = Math.random();
				i = 4;
			} else {
				System.out.println("Finishing: " + i);
			}
		}

		System.out.println();







		/*
	public static void main(String[] args) {
		double random = Math.random();

		for(int i = 4; i > 0; i--) {

			if (random <= 0.7){
		     System.out.println(random);
			random = Math.random();
			i=4;
			}
			else {

				System.exit(0);
			}

		}
	}
		 */
	}
}