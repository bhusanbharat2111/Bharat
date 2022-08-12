package training.java8features;

import java.util.StringJoiner;

public class StringJoin {
	public static void main(String[] args) {

		StringJoiner input = new StringJoiner(", ", "[ ", " ]");

		input.add("Monday");
		input.add("Tuesday");
		input.add("Wednessday");
		input.add("Thursday");
		input.add("Friday");
		input.add("Saturday");
		input.add("Sunday");

		// Displaying the output String
		System.out.println("Days in a week : " + input);
	}

}