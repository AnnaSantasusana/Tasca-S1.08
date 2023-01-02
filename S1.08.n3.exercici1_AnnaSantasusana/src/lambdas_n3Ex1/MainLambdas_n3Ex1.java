package lambdas_n3Ex1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainLambdas_n3Ex1 {

	public static void main(String[] args) {
		
		Student student1 = new Student("Alba", 16, "PHP", 6.5f);
		Student student2 = new Student("David", 21, "JAVA", 4.75f);
		Student student3 = new Student("Júlia", 19, "NODEJS", 8f);
		Student student4 = new Student("Carme", 28, "JAVA", 9.25f);
		Student student5 = new Student("Martí", 15, "NODEJS", 7.5f);
		Student student6 = new Student("Roger", 33, "PHP", 6f);
		Student student7 = new Student("Esther", 17, "JAVA", 5.25f);
		Student student8 = new Student("Sílvia", 19, "PHP", 3.75f);
		Student student9 = new Student("Andreu", 20, "NODEJS", 4.5f);
		Student student10 = new Student("Paula", 18, "JAVA", 6.5f);
		List<Student> list = Arrays.asList(student1, student2, student3, student4, student5,
										   student6, student7, student8, student9, student10);
		
		//1. Mostra per pantalla el nom i l’edat de cada alumne/a. 
		nameAndAge(list);
		System.out.println();
		
		//2. Filtra la llista per tots els alumnes que el seu nom comença per ‘a’. 
		List<Student> newList = namesWithA(list);
		for (Student student : newList) {
			System.out.println(student);
		}
		System.out.println();
		
		//3. Filtra i mostra per pantalla els alumnes que tenen una nota de 5 o superior.
		approvedStudents(list);
		System.out.println();
		
		//4. Filtra i mostra per pantalla els alumnes que tenen un nota de 5 o més, i que no són de PHP.  
		noPhpApprovedStudents(list);
		System.out.println();
		
		//5. Mostra tots els alumnes que fan JAVA i són majors d’edat.
		legalAgeJavaStudents(list);
		
	}
	
	public static void nameAndAge(List<Student> list) {
		
		list.stream().forEach(stdn -> System.out.println(stdn.getName() + " - " + stdn.getAge()));
					 		
	}

	public static List<Student> namesWithA(List<Student> list) {
		
		List<Student> newList = list.stream().filter(name -> name.getName().startsWith("A")).collect(Collectors.toList());
		
		return newList;
	}
	
	public static void approvedStudents(List<Student> list) {
		
		list.stream().filter(stdn -> stdn.getNote() >= 5).forEach(System.out::println);
	}
	
	public static void noPhpApprovedStudents(List<Student> list) {
		
		list.stream().filter(stdn -> stdn.getNote() >= 5)
					 .filter(stdn -> !stdn.getCourse().equalsIgnoreCase("PHP"))
					 .forEach(System.out::println);
	}
	
	public static void legalAgeJavaStudents(List<Student> list) {
		
		list.stream().filter(stdn -> stdn.getCourse().equalsIgnoreCase("JAVA"))
					 .filter(stdn -> stdn.getAge() >= 18)
					 .forEach(System.out::println);
		
	}
}
