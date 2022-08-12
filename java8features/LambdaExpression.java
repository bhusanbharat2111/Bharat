package training.java8features;

import java.util.ArrayList;

public class LambdaExpression {
	public static void main(String args[]) {

		// Creating an ArrayList with elements
		ArrayList<Integer> arrL = new ArrayList<Integer>();
		arrL.add(1);
		arrL.add(2);
		arrL.add(3);
		arrL.add(4);

		// Using lambda expression printing all elements
		arrL.forEach(n -> System.out.print(n + " "));
		System.out.println();
		// Using lambda expression printing even elements
		arrL.forEach(n -> {
			if (n % 2 == 0)
				System.out.print(n + " ");
		});
	}
}
