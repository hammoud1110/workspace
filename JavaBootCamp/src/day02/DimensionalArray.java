package day02;

public class DimensionalArray {




	public int[][] multArray(int[][] m, int[][] n){

		int[][] result = new int[3][3];

		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				for(int k = 0; k < 3; k++){
					//TODO implement the 3x3 multiplication
					result[i][j] += m[i][k] * n[k][j];
				}
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				
			System.out.print(result[i][j] +" ");
			}
			System.out.println("");

		}

		return null;

	}






	public void show(int [][] array){
		//array =new int[3][3];
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				//for(int k = 0; k < 3; k++){
				try{
					System.out.print(array[i][j] +" ");
				}catch(ArrayIndexOutOfBoundsException e){
					System.out.println();
					//e.setStackTrace(null);
				}
			}
			System.out.println("");

		}
		System.out.println("");
		//}
	}
	public static void main(String[] args)  {

		DimensionalArray ins = new DimensionalArray();
		int [][] m = {{1,2,3},{4,5,6},{7,8,9}};
		int [][] n = {{9,8,7},{6,5,4},{3,2,1}};





		ins.show(m);
		ins.show(n);
		
		ins.multArray(m, n);
	}


	/*
public static void main(String[] args) {
	int[][] x = {{1,2,3},{4,5,6},{7,8,9}}, y = {{9,8,7},{6,5,4},{3,2,1}}, z = new int[3][3];

	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; j++) {
			for (int k = 0; k < 3; k++) {
				z[i][j] += x[i][k]*y[k][j];
			}
		}
	}

	for(int i = 0; i < 3; i++) {
		for(int j = 0; j < 3; j++) {
	        System.out.print(" " + z[i][j]);
		}
		System.out.println();
	}


	System.out.println();

}
	 */
}

