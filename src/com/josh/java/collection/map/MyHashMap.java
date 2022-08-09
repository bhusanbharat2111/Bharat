package com.josh.java.collection.map;

import java.util.Collection;
import java.util.HashMap;

public class MyHashMap {
	public static void main(String[] args) {
		// Creating HashMap object
		HashMap<String, String> MyMap = new HashMap<String, String>();

		MyMap.put("Day-1", "Monday");
		MyMap.put("Day-2", "Tuesday");
		MyMap.put("Day-3", "Wednesday");
		MyMap.put("Day-4", "Thursday");
		MyMap.put("Day-5", "Friday");

		// Size of the map
		System.out.println("\nTotal Workday : " + MyMap.size());

		// Get value of key using get function
		System.out.println("\nWeekday-2 is " + MyMap.get("Day-2"));

		MyMap.putIfAbsent("Day-3", "Saturday");

		//checking existence of a key
		if (MyMap.containsKey("Day-3") == true) {
			System.out.println("\nDay-3 value is " + MyMap.get("Day-2"));
		} else {
			System.out.println("\nDay-3 doesn't exist");
		}
		
		// All values of the map
		System.out.println("\nAll Values :");
		Collection valueCollection = MyMap.values();
		System.out.println(valueCollection);

		// All Keys of the map
		System.out.println("\nAll Keys :");
		Collection keys = MyMap.keySet();
		System.out.println(keys);

	}
}
