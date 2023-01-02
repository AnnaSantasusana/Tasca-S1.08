package lambdas_n1Ex1;

import java.util.*;
import java.util.stream.Collectors;

public class MainLambdas_n1Ex1 {

	public static void main(String[] args) {
	
		List<String> names = new ArrayList<String>(Arrays.asList("Oliver", "Olga", "Anna", "Marc", "Oscar", "Robert", "Marta", "Pol", "Helena", "Montse"));
		
	
		List<String> newNames = filterStringsWithO(names);
		System.out.println(newNames);

	}
	
	public static List<String> filterStringsWithO(List<String> names){
		
		List<String> newNames = names.stream().filter(name -> name.toLowerCase().contains("o")).collect(Collectors.toList());
	
		return newNames;
		
	}

}
