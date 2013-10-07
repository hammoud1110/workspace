
public class Arrays {
	public static void main(String[] args) {
		
		//Task2.2
		String str="HH   HH        lll lll         WW      WW               lll      ddHH   HH   eee  lll lll  oooo   WW      WW  oooo  rr rr  lll      ddHHHHHHH ee   e lll lll oo  oo  WW   W  WW oo  oo rrr  r lll  ddddddHH   HH eeeee  lll lll oo  oo   WW WWW WW oo  oo rr     lll dd   ddHH   HH  eeeee lll lll  oooo     WW   WW   oooo  rr     lll  dddddd";
		char[][] cMatrix=new char[5][str.length()/5];
		for(int i=0;i<5;i++){
			for(int j=0;j<str.length()/5;j++){
				cMatrix[i][j]=str.charAt(i*str.length()/5+j);
				System.out.print(cMatrix[i][j]);
			}
			System.out.println();
		}
		
		//Task 1.a)
		int[][] array1={{1,2},{3,4},{5,6}};
		
		//Task 1.b)
		int[][] array2=new int[3][2];
		for(int i=0;i<array2.length;i++){
			for(int j=0;j<array2[i].length;j++){
				array2[i][j]=i+j;
			}
		}
		printArray(array2);
		
		//Task 1.c)
		Person[] array3=new Person[3];
		array3[0]=new Person("Joshua");
		array3[1]=new Student("Dan", "298704");
		array3[2]=new Professor("Klein","Software Engineering");
		
		//Task 1.d)
		int[][] myArray = new int[3][];
		myArray[0]=new int[2];
		myArray[0][0]=6;
		myArray[0][1]=7;
		myArray[1]=myArray[0];
//		myArray[1]=new int[2];
//		myArray[1][0]=6;
//		myArray[1][1]=7;
		myArray[2]=new int[3];
		myArray[2][0]=9;
		myArray[2][1]=8;
		myArray[2][2]=5;
		
		if(myArray[0]==myArray[1]){
			System.out.println("the first two lines are equal");
		}
		else
			System.out.println("the first two lines are not equal");

		printArray(myArray);
		
	}
	
	public static void printArray(int[][] array){
		System.out.println("The array has the following form:");
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array[i].length;j++){
				System.out.print(array[i][j]);
			}
			System.out.println();
				
		}
	}
}
