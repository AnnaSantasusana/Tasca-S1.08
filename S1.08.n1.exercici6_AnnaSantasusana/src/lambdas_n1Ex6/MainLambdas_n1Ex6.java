package lambdas_n1Ex6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MainLambdas_n1Ex6 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>(Arrays.asList("Natalia", "Rosa", "53", "Max", "13", "Carlota", "Teresa", "2"));

		sort(list);
	}
	
	public static void sort(List<String> list) {
		
		list.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
	}

}
