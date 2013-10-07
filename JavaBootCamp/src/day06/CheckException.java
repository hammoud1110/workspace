package day06;

import java.io.File;
import java.io.IOException;


public class CheckException {
	
	
	
	

	

	

	public Integer[] reverse(Integer[] original){


		for(int i = 0; i < original.length/2; i++){
			Integer temp = original[i];
			original[i] = original[original.length - i - 1];
			original[original.length - i - 1] = temp;

		}
		return original;
	}
	public File createFile(String name) throws FileExistsException, IOException{
		File file = new File(name);

		if (file.exists()){
			throw new FileExistsException(name + "  File already exist");
		}
		file.createNewFile();
		return file;
	}

	public static void main(String[] args)  {
		CheckException p = new CheckException();
		String[] A;
		try{
			Integer[] integerArray = null  ;

			p.reverse(integerArray);
			for (int i = 0;i < integerArray.length;i++) {
				System.out.println(integerArray[i]);
			}
			//System.out.println();
		}catch (Exception e) {
			// TODO: handle exception

			System.out.println("Bitte Array richtig intiallisieren");
		}

		String s = System.getProperty("user.dir")+ "/src/test";
		System.out.println(s);
		try{
			p.createFile(s);
		}catch (FileExistsException e){
			System.out.println(e.getMessage());		
		}catch(IOException e){
			System.out.println("IOException");
			e.printStackTrace();

		}finally {
			File f = new File(s);
			System.out.println(f.getName());
		}





	}



}
