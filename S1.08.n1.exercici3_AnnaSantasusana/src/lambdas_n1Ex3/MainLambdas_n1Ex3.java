package lambdas_n1Ex3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainLambdas_n1Ex3 {

	public static void main(String[] args) {
		
		List<String> months = new ArrayList<String>(Arrays.asList("January", "February", "March", "April", "May", "June",
														"July", "August", "September", "October", "November", "December"));

		printMonths(months);
	
	}
	
	public static void printMonths(List<String> months){
				
		months.stream().forEach(month -> System.out.println(month));
				
	
	}

}
