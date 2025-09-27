package JAVABASIC;

import java.util.Scanner;

public class TrafficLightTimer {
	public static void main(String args[]) {
	Scanner time = new Scanner(System.in);
	System.out.print("Please enter the time in sec (1-60 ):" );
	int timeInSec=time.nextInt();
	int Signal= 0 ;
	if(timeInSec>=1 && timeInSec<=20) {
		Signal=1;
	}
	else if(timeInSec>=21 && timeInSec<=40) {
		Signal=2;
	}else if(timeInSec>=41 && timeInSec<=60) {
		Signal=3;	
	}
	else {
		System.out.println("Invalid input" );
	}
	switch(Signal) {
	case 1:
		System.out.println("Signal is RED - Please stop!" );
		break;
	case 2:
		System.out.println("Signal is Yellow - Please be ready!" );
		break;	
	case 3:
		System.out.println("Signal is Green You can go" );	
	}
	}
	
}
