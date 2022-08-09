package training.day4;

// Triangle class has 2 overloaded constructors
class Triangle {
	int length;

	Triangle() {
		length = 10;
	}

	/*
	 * we can call this as a copy constructor because it takes a object reference as
	 * parameter and assigns the the value to another object properties
	 */
	Triangle(Triangle t) {
		length = t.length;
	}

}

public class CopyConstructor {

	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		System.out.println(t1.length);
		Triangle t2 = new Triangle(t1);
		System.out.println(t2.length);

	}

}
