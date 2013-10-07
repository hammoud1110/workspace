package day02;

public class Reverse {
public static String reverseString(String s) {
		
	    if (s.length() <= 1) {
	        return s;
	    } else {
	        char c = s.charAt(0);
	        return reverseString(s.substring(1)) + c;
	    }
	}

public static String reverse(String s) {
	if (s.length() <= 1 ) {
		return s;
	}
	return s.charAt(s.length() -1) + reverse(s.substring(1, s.length() -1 )) + s.charAt(0);
}
	public static void main(String[] args) {
		System.out.println(reverse("His"));	
		System.out.println("abcd".substring(0,2));
	}
}
