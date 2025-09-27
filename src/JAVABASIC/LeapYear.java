package JAVABASIC;

import java.util.Scanner;

public class LeapYear {

	public static void main(String args[]) {
		
		Scanner Year = new Scanner(System.in);
		System.out.print("Enter the year :");
		int no=Year.nextInt();
		
		if (no%4==0 && no%100!=0 ) {
			System.out.println(no+ " Is leap year");
	
		}
		else
		{
			System.out.println(no+ " Is not leap year");
	
		}
		
	}
}
