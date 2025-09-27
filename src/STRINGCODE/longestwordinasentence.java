package STRINGCODE;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class longestwordinasentence  {
	public static void main(String[] args) {
		
		String s1= "Swami ShivanadSHiav Rajendra";
		
		String rezx="[\\s]";
		String [] arr= s1.split(rezx);
		
	//---------------- 1st approch	
	int lengthWord=0;
	String longWord="";
	for (String o: arr) {
		
		if(lengthWord<o.length()) {
			lengthWord= o.length();
			longWord= o.toString();
		}
	}
	System.out.println(longWord);
	
	//--- 2nd approch
	
//		ArrayList<String> rev= new ArrayList();
//		TreeSet t= new TreeSet (new MyComparator());
//		for (String o: arr) {
//			
//			t.add(o.toString());
//			
//		}
//		
//		System.out.println(t.getLast());
//	
//}
//}
//	class MyComparator implements Comparator{
//		public int compare(Object obj1, Object obj2) {
//			String s1= obj1.toString();
//			String s2=  obj2.toString();
//			int i1= s1.length();
//			int i2= s2.length();
//			if (i1<i2)
//				return-1;
//			else if (i1>i2)
//				return 1;
//			else s1.compareTo(s2);
//			
//			return 0;
			
		}

	private static void longWord(String o) {
		// TODO Auto-generated method stub
		
	}
		}
	
	
