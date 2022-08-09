package com.josh.java.collection.comparebleandcomprator;

import java.util.Comparator;

public class SortByFavsub implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {

		return o1.getFavSub().compareTo(o2.getFavSub());

	}
}
