package anonymousExample;

import java.util.Arrays;
import java.util.List;

public class CountryName {
	public static void main(String[] args) {
		List<String> Countries = Arrays.asList("India","ASDFG","PK");
	
	List <String>	countryname = Countries.stream().filter(Count->Count.length()>3).toList();
	System.out.println(countryname);
	
	}

}
