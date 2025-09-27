package JAVABASIC;

public class AverageOfNumber {
	public static void main(String args[]){
float sum=0;
	float numberOfIteration =0;

	for (int i=1; i<=10; i++) {
		
		sum=sum+i;
		numberOfIteration=i;
		
	}
	
	System.out.println(sum);
	System.out.println(sum/numberOfIteration);
	
	
}
}
