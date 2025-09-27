package JAVABASIC;

import java.util.Scanner;

public class PrimeNumber {

public static void main(String args[]) {
		
		Scanner Number  = new Scanner(System.in);
		System.out.print("Enter the Number :");
		int no=Number.nextInt();
		if (no%4==0 ) {
			System.out.println(no+ " Is prime number ");
	
		}
		else
		{
			System.out.println(no+ " Is not  not prime number");
	
		}
}
}
