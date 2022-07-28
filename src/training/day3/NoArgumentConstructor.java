package training.day3;

// NoArgument class contains no-argument constructor 
class NoArgument {
	String trip;

	NoArgument() {
		trip = "GOA";
	}
}

public class NoArgumentConstructor {

	// in main method, creating objects of NoArgument class
	public static void main(String[] args) {
		NoArgument n1 = new NoArgument();
		System.out.println(n1.trip);
		NoArgument n2 = new NoArgument();
		System.out.println(n2.trip);
	}
}
