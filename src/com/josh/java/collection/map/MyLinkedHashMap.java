package com.josh.java.collection.map;

import java.util.LinkedHashMap;

public class MyLinkedHashMap {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> details = new LinkedHashMap<>();

		details.put(1001, "Bharat");
		details.put(1002, "Sharda");
		details.put(1003, "Subhra");
		details.put(1004, "Gireesh");
		details.put(1005, "Ravi");
		System.out.println("customerIdNameMapping :\n" + details);

		// Checking a key exists in the LinkedHashMap
		Integer id = 1005;
		if (details.containsKey(id)) {
			System.out.println("Found the customer with id " + id + " : " + details.get(id));
		} else {
			System.out.println("Customer with id " + id + " does not exist");
		}

		// Checking a value exists in the LinkedHashMap
		String name = "Anirudh";
		if (details.containsValue(name)) {
			System.out.println("A customer named " + name + " exist in the map");
		} else {
			System.out.println("No customer found with name " + name + " in the map");
		}

		// Changing the value of a key
		id = 1004;
		details.put(id, "Sahil");
		System.out.println("Changed the name of customer with id " + id);
		System.out.println("Details after updation : \n" + details);

		// Removing a key from the LinkedHashMap
		String person = details.remove(1005);
		System.out.println("Removed one costumer : " + person);

	}
}
