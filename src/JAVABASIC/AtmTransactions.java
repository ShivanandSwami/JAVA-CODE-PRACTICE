package JAVABASIC;

import java.util.Scanner;

public class AtmTransactions {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String choice = "";
		int  balance=10000;
		int withdraw;
		int deposit;
		int Process;
		
		

		do {
			System.out.println("Welcome Maharashatra Bank");
			System.out.println("1. Balance enquiry");
			System.out.println("2. Deposit  Money");
			System.out.println("3. Withdraw  Money");
			System.out.println("Please select the process");
			
			Process = sc.nextInt();

			switch (Process) {

			case 1:
				System.out.println("Your account balance is: " +balance);
				break;
			case 2:
				System.out.println("Enter deposit amount:");
				deposit=sc.nextInt();
				balance=balance+deposit;
				System.out.println("Your money is deposited to account");
			
				break;
			case 3:
				System.out.println("Enter withdraw amount:");
				withdraw= sc.nextInt();
				if(balance >=withdraw) {
					balance=balance-withdraw;
					System.out.println("Withdraw  process of "+withdraw+ " RS. is completed");
					}
				
				else {
					System.out.println("Insufficient balance whithdraw failed");
				}
				break;
			
			
			default:
				System.out.println("Something went wrong, please try again");
			}

			System.out.println("Do you want to continue the process ?(yes/no)");
			choice = sc.next();
		} while (choice.equals("yes"));

		System.out.println("Thank you ! visit Again !");

	}

}
