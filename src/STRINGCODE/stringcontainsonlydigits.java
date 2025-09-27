package STRINGCODE;

public class stringcontainsonlydigits {
	public static void main(String[] args) {
		String S1= "Shivanand123";
		System.out.println(S1.replaceAll("[^0-9.]", ""));
			if(!S1.replaceAll("[^0-9.]", "").isEmpty()) {
				
				System.out.println("String contain degit value");
			}
			else {
				System.out.println("String contain non degit value");
			}
		
	}

}
