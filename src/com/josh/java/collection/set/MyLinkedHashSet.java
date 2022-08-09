package com.josh.java.collection.set;

import java.util.LinkedHashSet;

public class MyLinkedHashSet {

	public static void main(String[] args) {

		// Creating an empty object of LinkedHashSet
		LinkedHashSet<String> animal = new LinkedHashSet<>();
		animal.add("Dog");
		animal.add("Cat");
		animal.add("Tiger");
		animal.add("Wolf");
		animal.add("Elephant");
		// Printing animal data
		for (String animaltype : animal) {
			System.out.println(animaltype);
		}
	}
}
