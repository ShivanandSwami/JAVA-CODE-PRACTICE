package JAVABASIC;

import java.util.Scanner;

public class SumOfNumberDoWhileLoop {
	
	public static void main(String  args[]) {
		
		Scanner Number=new Scanner(System.in);
		
		int no ;
		int sum=0;
		
		do {
			 System.out.print("Enter a number: ");
			 no = Number.nextInt();
			 sum +=no;
		} while (no != 0);
		
		
		System.out.println("Sum of  number is: "+sum);
		
		
	}
}
