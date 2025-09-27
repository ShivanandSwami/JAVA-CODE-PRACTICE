package anonymousExample;

import java.util.Arrays;
import java.util.List;

public class Square {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5);
	
	List <Integer>	Squ = list.stream().map(n-> n*n ).toList();
	System.out.println(Squ); 
	}
	

}
