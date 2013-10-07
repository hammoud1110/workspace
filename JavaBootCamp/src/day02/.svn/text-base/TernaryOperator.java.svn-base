package day02;

public class TernaryOperator {

	// String[] month = {"January","February","March","April","May","Jun","July","August","September","October","November", "December"};



	public String findMonth(int alpha){


		int[] numbers = {1,2,3,4,5,6,7,8,9,10,11,12};
		String monthName = null;
		for(int i=0; i<numbers.length; i++){
			if  (numbers[alpha-1] == 1) {

				System.out.println("January" );
				break;

			}else
				if (numbers[alpha-1] == 2){
					System.out.println("February");
					break;
				}else
					if (numbers[alpha-1] == 3){
						System.out.println("March");
						 break;
					}else
						if (numbers[alpha-1] == 4){
							System.out.println("April");
							break;
						}else
							if (numbers[alpha-1] == 5){
								System.out.println("May");
								break;
							}else
								if (numbers[alpha-1] == 6){

									System.out.println( "Jun" );
									break;
								}else
									if	(numbers[alpha-1] == 7){
										System.out.println("July" );
										break;
									}else
										if(numbers[alpha-1] == 8){
											System.out.println("August");
											break;
										}else
											if (numbers[alpha-1] == 9){
												System.out.println( "September");
												break;
											}else
												if(numbers[alpha-1] == 10){
													System.out.println("October");
													break;
												}else
													if(numbers[alpha-1] == 11){
														System.out.println("November");
														break;
													}else
														if (numbers[alpha-1] == 12){
															System.out.println("December");
															break;
														}
		


		}
		return monthName;


	}








	public static void main(String [] args) {

		/*
		int i=2;
		String result = ( (i % 2)==1 )? "odd" : "even";

		System.out.println("The integer is " + result);
	}
		 */

		TernaryOperator f = new TernaryOperator();
		try{
			
			f.findMonth(4);
		}catch(ArrayIndexOutOfBoundsException e){				
			System.out.println("Doesn't exist");

		}




	}	


}