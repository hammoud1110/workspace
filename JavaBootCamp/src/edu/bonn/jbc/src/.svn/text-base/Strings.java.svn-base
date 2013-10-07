import java.util.StringTokenizer;


public class Strings {
	public static void getInitials(String name){
		
		//Task 1.1 - computes initials from your full name
		StringTokenizer st=new StringTokenizer(name);
		System.out.println("The initials are:");
		while(st.hasMoreTokens()){
			String n=st.nextToken();
			String result=n.substring(0, 1);
			System.out.println(result);
		}
		
	}
	
	//Task 1.2.2
	// Much more efficient version using StringBuffer.
	public static String dupl(String s, int times) {
	    StringBuffer result = new StringBuffer(s.length() * times);
	    for (int i=0; i<times; i++) {
	        result.append(s);
	    }
	    return result.toString();
	}
	
	public static void main(String[] args) {
		getInitials("Cristina Maria Balasoiu");
		System.out.println(dupl("c",100));
	}
}
