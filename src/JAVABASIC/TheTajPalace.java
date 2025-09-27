package JAVABASIC;


	import java.util.Scanner;

	public class TheTajPalace {
		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			String choice = "";
			int orderNo = 0;

			do {
				System.out.println("Welcome to The Taj Palace");
				System.out.println("#######The Taj Palace #################");
				System.out.println("#########Menu Card ###################");

				System.out.println("1. Tea");
				System.out.println("2. Starter");
				System.out.println("3. Main Course");
				System.out.println("4. Dessert");
				System.out.println("5. Cold Beverages");
				System.out.println("6.Exit");

				System.out.println("Please order from above menu");
				orderNo = sc.nextInt();

				switch (orderNo) {

				case 1:
					System.out.println("your order for Tea is placed successfully !");
					break;
				case 2:
					System.out.println("your order for Starter is placed successfully !");
					break;
				case 3:
					System.out.println("your order for Main Course is placed successfully !");
					break;
				case 4:
					System.out.println("your order for Dessert is placed successfully !");
					break;
				case 5:
					System.out.println("your order for Cold Beverages is placed successfully !");
					break;
				
				case 6:
					System.out.println("Thank you ! visit Again !");
						System.exit(0); // forcefully termination of the program
				default:
					System.out.println("Please enter a valid order number");
				}

				System.out.println("do you want to order more food ?(yes/no)");
				choice = sc.next();
			} while (choice.equals("yes"));

			System.out.println("Thank you ! visit Again !");

		}
	}
	


