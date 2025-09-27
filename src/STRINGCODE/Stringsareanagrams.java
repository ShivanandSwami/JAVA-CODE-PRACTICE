package STRINGCODE;

import java.util.Arrays;

public class Stringsareanagrams {
	public static void main(String[] args ) {
		
		String s1= "SHIVANAND";
		String s2= "DNANAVIHSS";
		char[] c1= s1.toCharArray();
		char [] c2 =s1.toCharArray();
		
		   Arrays.sort(c1);
	        Arrays.sort(c2);
		if(s1.length() == s2.length()) {
			if ( Arrays.equals(c1, c2)) {
				System.out.print("String are areagreams");
			}
			else {System.out.print("String are not areagreams");
			}
		}
		else  {System.out.print("String are not areagreams");
		}
	}

}
