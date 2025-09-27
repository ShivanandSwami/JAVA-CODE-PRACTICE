package STRINGCODE;

public class Countwordsinasentence {

	public static void main(String [] args) {
		
		String s1="Count words in a sentence";
		String rezx= "[\\s]";
	//	s1= s1.replaceAll("[^0-9.]", "");
		String[] arr= s1.split(rezx);
	int count=0;
	for (String o:arr) {
		if(o.length()>1) {
		count++;
		}
	}
	System.out.println(count);
	}
}
