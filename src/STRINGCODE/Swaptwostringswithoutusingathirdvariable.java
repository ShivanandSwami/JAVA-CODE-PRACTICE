package STRINGCODE;

public class Swaptwostringswithoutusingathirdvariable {
	public static void main(String[] args) {
	String s1= new String("Shivanand");
	String s2= new String("Swami");
//	s1=s1.concat(s2).substring(s1.length());
//	s2=s2.concat(s1).substring(s2.length());
	System.out.println("s1:" + s1.concat(s2).substring(s1.length()));
	System.out.println("s2:" + s2.concat(s1).substring(s2.length()));
	}

}