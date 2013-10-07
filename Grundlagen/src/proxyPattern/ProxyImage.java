package proxyPattern;

public class ProxyImage implements Image {
	public RealImage realImage;
	public String fileName;

	public ProxyImage(String fileName){
		this.fileName= fileName;
		
	}
	
	
	
	public void display(){
		if (realImage == null){
			realImage =new RealImage(fileName);
		}
		realImage.display();
	}
	
	
	
}