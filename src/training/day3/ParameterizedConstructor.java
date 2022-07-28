package training.day3;

// Parameterized class contains Parameterized constructor 
class Parameterized {

	String empName;
	int empID;

	Parameterized(String s, int n) {
		empName = s;
		empID = n;
	}

	// display method shows the values of Parameterized class properties
	public void display() {
		System.out.println("[empName=" + empName + ", empID=" + empID + "]");
	}
}

public class ParameterizedConstructor {

	// main method creates objects of Parameterized class
	public static void main(String[] args) {
		Parameterized p1 = new Parameterized("Bharat", 641);
		Parameterized p2 = new Parameterized("Girish", 649);
		p1.display();
		p2.display();
	}
}
