package day06;

import java.io.File;
import java.io.IOException;

public class FileExistsException extends IOException{


	private String message;
	public FileExistsException() {
		super();
	}

	public FileExistsException(String message){
		super(message);
		this.message = message;
	}
	public String getMessage(){
		return message;
	}

	public void setMessage(String message){
		this.message = message;
	}



	public File createFile(String f) throws FileExistsException, IOException{
		File file = new File(f);
		if (file.exists()) throw new FileExistsException(f + "file already exists");
		else
			try{
				file.createNewFile();
			}catch (IOException e) { 
				e.printStackTrace(); 

			}
		return file;
	}



	public static void main(String[] args) throws FileExistsException, IOException {

		FileExistsException f = new FileExistsException();
		try{
			f.createFile(System.getProperty("user.dir") + "/src/test");
		}catch(FileExistsException except){
			System.out.println(f.getMessage());

		}
	}
}





