package lambdas_n1Ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainLambdas_n1Ex2 {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<String>(Arrays.asList("Oliver", "Olga", "Anna", "Marc", "Oscar", "Robert", "Marta", "Pol", "Helena", "Montse"));
		
		
		List<String> newNames = filter1(names);
		System.out.println(newNames);

	}
	
	public static List<String> filter1(List<String> names){
		
		List<String> newNames = names.stream().filter(name -> name.toLowerCase().contains("o"))
											  .filter(name -> name.length() > 5)
											  .collect(Collectors.toList());
		
		return newNames;
		
	}

}
