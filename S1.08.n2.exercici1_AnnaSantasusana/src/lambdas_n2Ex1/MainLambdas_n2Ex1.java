package lambdas_n2Ex1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainLambdas_n2Ex1 {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Ali", "Olga", "Anna", "Marc", "Ani", "Robert", "Ale", "Pol");
		
		List<String> newNames = filterNames(names);
		System.out.println(newNames);

	}
	
	public static List<String> filterNames(List<String> names){
		
		List<String> newNames = names.stream().filter(name -> name.contains("A"))
											  .filter(name -> name.length() == 3)
											  .collect(Collectors.toList());
	
		return newNames;
		
	}

}
