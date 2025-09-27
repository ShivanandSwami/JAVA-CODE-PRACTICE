package STRINGCODE;

import java.util.Arrays;

public class StreingDemo {
	
	public static void main(String[] args) {
	String s1= "shiva";
	
	String S2= "shiva";
	String S3 = new String("SHIVA");
	String S4= new String ("SHIVA");
	System.out.println(s1==S2);
	
	System.out.println(s1.equals(S2));
	
	System.out.println(S3==S4);
	System.out.println(S3.equals(S4));
	System.out.println(S3.length());
	System.out.println(S2.toUpperCase());
	System.out.println(S2.isEmpty());
	System.out.println(S3.charAt(3));
	
	int vovalcount=0;
	int consonants =0;
	for (int i=0 ; i<S3.length() ;i++) {
		char STR= S3.charAt(i);
		
		if(STR=='A' ||STR=='E' ||STR=='I'||STR=='O'||STR=='U') {
			
			vovalcount++;
		}
		else {
			consonants++;
		}
			
		}
	System.out.println("Voval count is:" +vovalcount);
	System.out.println("Consoants count is :" + consonants);
	
StringBuffer S5= new StringBuffer(S3);
System.out.println("Reversered string is :" +S5.reverse());
String S7= "IV";
int COunt= S3.indexOf(S7);
 if (COunt != -1) {
	 System.out.println("String contrain substring");
 }
 else {
	 System.out.println("String  not contrain substring");
 }
 
	
 String S8=" SHiva Bharati";
 System.out.println(S8.replace(' ', '-'));
 System.out.println(S8.replaceAll("Bharati", "SWAMI"));
 
 System.out.println(S8.trim());

 char[] c = S3.toCharArray();
 System.out.println(Arrays.toString(c));
 
 for (int i=0 ; i<S3.length() ;i++) {
	 System.out.println(S3.charAt(i));
	 
 }
 
 
	}			

}
