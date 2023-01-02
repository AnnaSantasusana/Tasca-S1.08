package lambdas_n3Ex1;

public class Student {

	private String name;
	private int age;
	private String course;
	private float note;
	
	public Student(String name, int age, String course, float note) {
		this.name = name;
		this.age = age;
		this.course = course;
		this.note = note;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getCourse() {
		return course;
	}

	public float getNote() {
		return note;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public void setNote(float note) {
		this.note = note;
	}

	@Override
	public String toString() {
		return "Student name: " + name + ", age: " + age + ", course: " + course + ", note: " + note;
	}
	
	
	
}
