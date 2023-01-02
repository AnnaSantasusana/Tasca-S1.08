package lambdas_n2Ex3;

public class MainLambdas_n2Ex3 {

	public static void main(String[] args) {
		
		MathOperator addition = (n1, n2) -> { return n1 + n2; };
		MathOperator subtraction = (n1, n2) -> { return n1 - n2; };
		MathOperator multiplication = (n1, n2) -> { return n1 * n2; };
		MathOperator division = (n1, n2) -> { return n1 / n2; };
		
		System.out.println(addition.operation(5, 3));
		System.out.println(subtraction.operation(22, 17));
		System.out.println(multiplication.operation(9, 8));
		System.out.println(division.operation(32, 6));
	}

}
