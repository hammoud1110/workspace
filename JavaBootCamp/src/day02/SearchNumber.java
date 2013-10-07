package day02;

public class SearchNumber {
	public static void main(String[] args) {
		int counter= 0;
		int [][] s= {{33,245,222,999},{134,857,948,999},{287,434,565,667}};
		 search:
		for (int i=0; i <3;i++){
			for (int j = 0; j < 4; j++) {
				if (s[i][j] == 999){
					System.out.println("found");
					break search;
				}else
					
					System.out.println("nach "+counter+" Schritten");
				    counter++;
					continue;
				
			}
		}

	}


}
