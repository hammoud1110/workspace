package proxyPattern;

public class RealImage implements Image {

	public String fileName;
	
	public RealImage(String fileName){
		this.fileName = fileName;
		loadFromDisc(fileName);
		
	}
	public void loadFromDisc(String fileName){
		System.out.println("loading: "+ fileName);
	}
	@Override
	public void display() {
		System.out.println("displaying: "+ fileName);
	}

}
