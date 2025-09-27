package JAVABASIC;

public class perfectNumber {
	public static void main(String args[]) {
	int  number =11;
	
	int sumOfNumber = 0;
	
	for  (int i=1; i<=(number/2); i++) {
		
		if(number%i==0) {
			sumOfNumber=sumOfNumber+i;
			
		}
		
		
	}
	if (sumOfNumber==number) {
		System.out.println( number +" is perfect no");
	}
	else {
		System.out.println( number +" is not perfect no");
	}
	
	}
	
}
