package training.day4;

//Student class contains both static and non-static properties
class Student {
	String name;

	// static variable creates only location for all the objects
	static int count = 1;
	int rollno;
	String Class = "Standard one";

	Student(String n) {
		name = n;
		rollno = count++;
	}

	public String display() {
		return "Student [name= " + name + ", rollno= " + rollno + ", Class= " + Class + "]";
	}

	public static int noOfStudents() {
		return count - 1;
	}
}

public class StaticKeyword {

	public static void main(String[] args) {
		Student s1 = new Student("Bharat");
		Student s2 = new Student("Girish");
		Student s3 = new Student("Sharda");
		Student s4 = new Student("Subhra");
		System.out.println(s1.display());
		System.out.println(s2.display());
		System.out.println(s3.display());
		System.out.println(s4.display());
		System.out.println("Total No. Of Students are " + Student.noOfStudents());
	}

}
