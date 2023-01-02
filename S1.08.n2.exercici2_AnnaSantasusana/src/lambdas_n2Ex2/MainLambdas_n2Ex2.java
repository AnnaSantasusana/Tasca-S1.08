package lambdas_n2Ex2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainLambdas_n2Ex2 {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(125, 4, 99, 888, 63, 11, 26);
		
		System.out.println(filterNumbers(numbers));
		

	}
	
	public static String filterNumbers(List<Integer> numbers){
		
		String numberWithLetter = numbers.stream()
					.map(number -> number % 2 == 0 ? "e" + number : "o" + number)
					.collect(Collectors.joining(", "));
		
		//joining(): Devuelve un Collector que concatena los elementos de
		//entrada en un String, en orden de encuentro
		
		return numberWithLetter;
		

	}

}
