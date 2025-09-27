package STRINGCODE;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class frequencyOfEachCharacter {
	
	public static void main(String [] args) {
		
		String s1= "Shivanad" ;
		
		
//		for (int i=0; i<s1.length();i++) {
//			
//			System.out.print(s1.charAt(i));
//			int count=1;
//			ArrayList<Character> clean= new ArrayList();
//			
//			if(!clean.contains(s1.charAt(i))) {
//			clean.add(s1.charAt(i));
//		
//			for (int j=0 ; j<s1.length();j++  ) {
//				
//				if(j!=i && s1.charAt(i)==s1.charAt(j)) {
//					count++;
//					
//				}
//				
//			}
//			System.out.println(count);
//			
//		}
//			
//		}
		
		 Map<Character, Integer> d
         = new HashMap<Character, Integer>();
		 for (int i=0; i<s1.length();i++) {
			 if(d.containsKey(s1.charAt(i))) {
				   d.put(s1.charAt(i), d.get(s1.charAt(i)) + 1);
			 }
			 else{
				 d.put(s1.charAt(i), 1);
			 }
		 }
		 for (int i = 0; i < s1.length(); i++) {
		 
			 if(d.get(s1.charAt(i))!=0) {
			 System.out.print(s1.charAt(i));
			 System.out.print(d.get(s1.charAt(i)) + " ");
//          
			 d.put(s1.charAt(i), 0);
			 }
		 }
	}

}
