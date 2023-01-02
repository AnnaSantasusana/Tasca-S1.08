package lambdas_n1Ex5;

public class MainLambdas_n1Ex5 {

	public static void main(String[] args) {
		
		/*
		PiValue numberPi = new PiValue() {

			@Override
			public double getPiValue() {
				return 3.1415;
				
			}
		};
		*/
		
		PiValue numberPi = () -> 3.1415;
		System.out.println(numberPi.getPiValue());

	}

}
