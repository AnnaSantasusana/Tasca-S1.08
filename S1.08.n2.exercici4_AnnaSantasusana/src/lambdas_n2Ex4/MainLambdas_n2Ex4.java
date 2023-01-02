package lambdas_n2Ex4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MainLambdas_n2Ex4 {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("taula", "24", "1", "casa", "vehicle", "33", "9", "pisos", "festa");
		
		System.out.println(sortAlphabetically(list));
		System.out.println(StringsWithEFirst(list));
		System.out.println(changeLetterA(list));
		System.out.println(numberElements(list));

	}

	public static String sortAlphabetically(List<String> list) {
		
		return list.stream().sorted(Comparator.comparing(str -> str.charAt(0)))
							.collect(Collectors.joining(", "));
		
	}
	
	public static String StringsWithEFirst(List<String> list) {
		
		return list.stream().sorted((s1, s2) -> {
						if (s1.contains("e") && !s2.contains("e")) {
							return -1;
						} else if (s2.contains("e") && !s1.contains("e")) {
							return 1;
						} else {
							return s1.compareTo(s2);
						}
	    			})
					.collect(Collectors.joining(", "));
	   			
	}
	
	public static String changeLetterA(List<String> list) {
		
		 return list.stream().map(str -> str.replace('a', '4'))
				             .collect(Collectors.joining(", "));
				 
	}
	
	public static String numberElements(List<String> list) {
		
		return list.stream().filter(str -> str.chars().allMatch(Character::isDigit))
				 			.collect(Collectors.joining(", "));
	}
}
