package STRINGCODE;

public class Removealloccurrencesofacharacter {
	public static void main(String[] args) {
		
		String s1= "shiva124s";
		 char ch='s';
		System.out.println(s1.replaceAll("[^a-z, A-Z.]", ""));// to get only charcter
		System.out.println(s1.replaceAll("[^0-9.]", ""));// to get number 
		System.out.println(s1.replace(String.valueOf(ch), ""));// to remove specific char
	}

}
