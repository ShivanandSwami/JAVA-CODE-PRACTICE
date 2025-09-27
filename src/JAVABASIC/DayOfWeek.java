package JAVABASIC;

import java.util.ArrayList;
import java.util.Scanner;

public class DayOfWeek {

	public static void main (String args[]) {
		
		Scanner day= new Scanner(System.in);
	
		System.out.print("Enter day in capital letter:");
		
		String Chars=day.nextLine().toUpperCase();
		
		 ArrayList<String> dayname = new ArrayList<String>();
		dayname.add("AA");
		dayname .add("MONDAY");
		dayname .add("TUESDAY");
		dayname .add("WEDNESDAY");
		dayname .add("THURSDAY");
		dayname .add("FRIDAY");
		dayname .add("SATURDAY");
		dayname .add("SUNDAY");
		
	   char temp = 0;
		if(dayname.contains(Chars)) {
			
			temp= (char) dayname.indexOf( Chars);
			
			
		}
		else {
			System.out.print( "Invlid input");
		}

		if( temp>=1 &&temp<=5) {
			System.out.print( Chars+ " is weekday");
		}
		else if( temp>=6 &&temp<=7) {
			System.out.print( Chars+ " is weekend");
			
		}
		}

	private static char findIndex(ArrayList<String> dayname, String c) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
