package JAVABASIC;

public class ArmStrongNumber {

	public static void main (String arg[]) {
		
		int no=153;
		int rev=0;
		int temp=no;
		while (no>0) {
			int digit=no%10;
			rev=rev+(digit*digit*digit);
			no=no/10;
		}
		if (temp == rev) {
			System.out.println(temp+ " is armstrong number");
		}
		else {
			System.out.println(temp+ " not armstrong number");
		}
		
	}
}
