package STRINGCODE;

import java.util.ArrayList;

public class Capitalizethefirstletterofeachword {
	public static void main(String[] args) {
	String s1= "shivanand rajendra swami";
	String regx= "[.\\@\\s]";
	String[] arr = s1.split(regx);
	
	StringBuilder result = new StringBuilder();
	
	for (String o: arr) {
		
		result.append(Character.toUpperCase(o.charAt(0)))
		 .append(o.substring(1))
         .append(" ");
		System.out.println(o.substring(1));
	}
	System.out.print(result.toString());
	}

}
