package STRINGCODE;

import java.util.ArrayList;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		String S1= "ShiIaa";
		ArrayList arr= new ArrayList();
		
		for(int i=0; i<S1.length(); i++) {
			boolean  found= false;
			for (int j=0; j<S1.length(); j ++) {
				
				if(i!=j && S1.charAt(i)==S1.charAt(j)) {
					found= true;
					 break;
				}
				
				
				
			}
			if(!found) 
				System.out.println(S1.charAt(i));
			
		}
	}
}
