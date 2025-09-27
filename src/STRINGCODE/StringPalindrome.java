package STRINGCODE;

public class StringPalindrome {
	
	public static void main(String[]args) {
	String s1= "OMO";
	StringBuffer s2= new StringBuffer(s1);
/*	if(s1.equals(s2.reverse().toString())) {
		System.out.println("STring is palindrome");
	}
	else {
		System.out.println("STring is not  palindrome");
	}*/
	String rev= "";
	for (int i =s1.length()-1; i>= 0 ;i--) {
		rev= rev+ s1.charAt(i);
		
	}
	if (s1.equals(rev)) {
		System.out.println("STring is palindrome");
	}
	else {
		System.out.println("STring is not  palindrome");
	}
	
	}
}
