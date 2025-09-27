package JAVABASIC;

import java.util.Scanner;

public class Calculator {

	public static void main(String args[]) {
		
Scanner Number=new Scanner(System.in);
		
System.out.print("Enter 1st number:");
		int Firstnumber=Number.nextInt();
		
		 System.out.print("select  the claculater process  +,-,*,/=");
		 char process=Number.next().charAt(0);
		 System.out.print("Enter 2nd number: ");   
		int SendNumber=Number.nextInt();
		int processOutput;
		if (process=='+') {
			processOutput= Firstnumber+SendNumber;
		System.out.println("addition of number is: " +processOutput );
		
			
		}
		else if(process=='-') {
			processOutput= Firstnumber-SendNumber;
			System.out.println("subtraction of number is: " +processOutput );
			
		} 
		else if(process=='*') {
			processOutput= Firstnumber*SendNumber;
			
			System.out.println("multiplication of number is: " +processOutput );
		} 
		else if(process=='/') {
			processOutput= Firstnumber/SendNumber;
			System.out.println("division  of number is: " +processOutput );
			
		} 
		else {
			System.out.print("Ivalid process");
		}
	
		
	}
		
		
		
	}

