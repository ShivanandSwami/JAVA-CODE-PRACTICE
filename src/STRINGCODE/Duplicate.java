package STRINGCODE;

import java.util.ArrayList;
import java.util.HashSet;

public class Duplicate {
	public static void main(String[]  args) {
		
		String name="SHIVANANDSWAMI";
		ArrayList DUb= new ArrayList();
		
//		for (char C: name.toCharArray()) {
//			if (!DUb.contains(C)) {
//				DUb.add(C);
//				System.out.print(C);}
//		}
//	
		
		
		 HashSet<Character> exists = new HashSet<>();
	        StringBuilder ans = new StringBuilder();

	       
	        for (char c : name.toCharArray()) {
	            
	         
	            if (!exists.contains(c)) {
	                ans.append(c);
	                exists.add(c);
	            }
	        }
	        System.out.println(ans.toString());
	}
	

}
