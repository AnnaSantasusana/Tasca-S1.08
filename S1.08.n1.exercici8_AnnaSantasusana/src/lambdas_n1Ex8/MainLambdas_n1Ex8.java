package lambdas_n1Ex8;

public class MainLambdas_n1Ex8 {

	public static void main(String[] args) {
		
		String localInput = "Aquest text es llegirà del revés";
		
		StringBackward reverseString = reversible(localInput);
		System.out.println(reverseString.reverse(localInput)); //El método reverse() es el de la Interfaz Funcional
	}
	
	public static StringBackward reversible(String localInput) {
		StringBuilder str = new StringBuilder(localInput);
		StringBackward reverseString = input -> str.reverse().toString(); //Este método reverse() es de la Clase StringBuilder
		
		return reverseString;
	}

}
