package Day3Project;
class Student{
	public String name="Raj"; //public
	private int age = 20;     //private
	protected String grade = "A"; //Protected
	String school = "ABC School"; //default
	
	public void displayInfo() {
		System.out.println("Name: "+name);
		System.out.println("age: "+age);
		System.out.println("grade: "+grade);
		System.out.println("school: "+school);
	}
}
public class Accessspecifier {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.displayInfo(); // Accesing all types of specifiers
		System.out.println("Public Name:" + s1.name);
		System.out.println("Protected Grade:" + s1.school);
		/*System.out.println("Private age: " + student.age);
		System.out.println("Protected Grade: " + student.grade);*/
	}

}
