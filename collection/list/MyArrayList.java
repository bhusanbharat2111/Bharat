package com.josh.java.collection.list;

import java.util.ArrayList;

public class MyArrayList {

	public static void main(String[] args) {

		// creating object of ArrayList
		ArrayList<Integer> numbers = new ArrayList<Integer>();

		// Adding elements into the ArrayList
		numbers.add(10);
		numbers.add(100);
		numbers.add(40);

		// Retrieving one index value
		System.out.println(numbers.get(0));

		System.out.println("Iteration #1: ");
		// Indexed for loop iteration
		for (int i = 0; i < numbers.size(); i++) {
			System.out.print(numbers.get(i) + " ");
		}

		numbers.remove(0);

		System.out.println("\nIteration #2: ");
		for (Integer value : numbers) {
			System.out.print(value + " ");
		}
	}
}
