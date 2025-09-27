package anonymousExample;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamApi {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12,4,57,89,0);
		//Predicate <Integer>  evenPredicate=(e)-->e%2==0;
	List <Integer>	evens = list.stream().filter(ele->ele%2==0).toList();
	System.out.println(evens);
	
	}
}
// wap to to print even numbers from givrn list using usring stream 
//api  java 8 feature 
/*
 * wrap to print sum of all integer from given list 
 * WAP to print square fo all integer from given list
 * wap to print the city name which start from charcter "p"
 * ["Patan","Muymbai"]
 *WAP to print the countory name  whoes lenght of grater than 3*/

 