package JAVABASIC;

import java.util.Scanner;

public class PalindromeNumber {
	

		public static void main (String arg[]) {
		
			Scanner Number = new Scanner(System.in);
			int no=Number.nextInt();
			int rev=0;
			int temp=no;
			while (no>0) {
				int digit=no%10;
				rev=rev*10+digit;
				no=no/10;
			}
			if (temp == rev) {
				System.out.println(temp+ " is  Palindrome number");
			}
			else {
				System.out.println(temp+ " not Palindrome number");
			}
			
			
		}
}
