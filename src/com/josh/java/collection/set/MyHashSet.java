package com.josh.java.collection.set;

import java.util.HashSet;

public class MyHashSet {

	public static void main(String[] args) {

		// Creating a HashSet
		HashSet<String> daysOfWeek = new HashSet<>();

		// Adding new elements to the HashSet
		daysOfWeek.add("Monday");
		daysOfWeek.add("Tuesday");
		daysOfWeek.add("Wednesday");
		daysOfWeek.add("Thursday");
		daysOfWeek.add("Friday");
		daysOfWeek.add("Saturday");
		daysOfWeek.add("Sunday");
		System.out.println("Before modification : " + daysOfWeek);

		// removing one element from HashSet
		daysOfWeek.remove("Sunday");
		// Adding duplicate elements will be ignored
		daysOfWeek.add("Monday");

		System.out.println("After modification : " + daysOfWeek);
	}
}
