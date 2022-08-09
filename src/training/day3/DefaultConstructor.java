package training.day3;

//this class contains no constructor, but at the time of compiling java will add default constructor
public class DefaultConstructor {
	String s1 = "Bharat";

	// inside main method, created two objects of DefaultConstructor
	public static void main(String[] args) {

		DefaultConstructor d1 = new DefaultConstructor();
		DefaultConstructor d2 = new DefaultConstructor();
		System.out.println(d1.s1);
		System.out.println(d2.s1);

	}

}
