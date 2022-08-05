package com.josh.java.collection.map;

import java.util.Map;
import java.util.TreeMap;

public class MyTreeMap {
	public static void main(String args[]) {
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(106, "Subhra");
		map.put(102, "Gireesh");
		map.put(101, "Anirudh");
		map.put(103, "Sharda");
		map.put(108, "Jeevan");
		map.put(107, "Harshita");
		map.put(105, "Kartik");
		map.put(104, "Lohit");
		map.put(109, "Ravi");
		map.put(110, "Sahil");

		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}
