package com.josh.java.collection.comparebleandcomprator;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Person p1 = new Person(60, "James");
		Person p2 = new Person(55, "Bryan");

		if (p1.compareTo(p2) > 0) {
			System.out.println(p1.getName() + " is older.");
		} else {
			System.out.println(p2.getName() + " is older.");
		}

		// Sorted by age
		List<Person> l = new ArrayList<>();
		l.add(p1);
		l.add(p2);

	}

}
