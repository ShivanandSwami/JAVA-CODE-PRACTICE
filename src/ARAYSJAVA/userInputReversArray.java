package ARAYSJAVA;

import java.util.Scanner;

public class userInputReversArray {
	//merger 
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.print("Kindly provide the reversal Number");
		
		String  no=Sc.nextLine();
		int s =no.length();
	
	for(int  i= s-1;  i>=0 ; i--) {
		char Re=no.charAt(i)	;
		System.out.print(Re);
	}
	 		
	}

}

