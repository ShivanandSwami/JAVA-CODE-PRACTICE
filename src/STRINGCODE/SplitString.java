package STRINGCODE;

import java.util.ArrayList;

public class SplitString {
	
	public static void main(String[]  args) {
		String str="Shivanand SWAMI RAJENDRA";
		String regx= "[.\\@\\s]";
		String[] arr = str.split(regx);
		ArrayList rev=  new ArrayList();


		

		for (String s1 : arr) {
			rev.add(s1.toString());
			
        }
		
			
		System.out.println(rev.toString());
		System.out.println(rev.size());
		int j= rev.size();
		for (int i=j-1;i>=0 ;--i) {
			System.out.println (rev.get(i));
		}
		
		//int j= rev.;
		for (Object s2 : rev.reversed()) {
			System.out.print(s2+" " );
		}	
			
		
	}

}
