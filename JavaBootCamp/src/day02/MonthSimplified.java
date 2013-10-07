package day02;

public class MonthSimplified {
	public String findMonth(int alpha){
		while(alpha < 13){


			switch(alpha){
			case 1:
				System.out.println("January" + ": inside the lecture period");
				break;
			case 2:
				System.out.println("February"+ ": inside the lecture period");
				break;
			case 3:
				System.out.println("March"+ ": inside the lecture period");
				break;
			case 4:
				System.out.println("April"+ ": inside the lecture period");
				break;
			case 5:
				System.out.println("May"+ ": inside the lecture period");
				break;
			case 6:
				System.out.println( "Jun"+ ": inside the lecture period");
				break;
			case 7:
				System.out.println("July"+ ": inside the lecture period" );
				break;
			case 8:
				System.out.println("August");
				break;
			case 9:
				System.out.println( "September");
				break;
			case 10:
				System.out.println("October"+ ": inside the lecture period");
				break;
			case 11:
				System.out.println("November"+ ": inside the lecture period");
				break;
			case 12:
				System.out.println("December"+ ": inside the lecture period");
				break;
			default:
				System.out.println("There is no month for this number");

			}
			alpha++;

		}
		return null;
		


	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		MonthSimplified testing = new MonthSimplified();
		testing.findMonth(2);



	}

}
