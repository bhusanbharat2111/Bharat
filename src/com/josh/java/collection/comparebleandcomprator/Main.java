package com.josh.java.collection.comparebleandcomprator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Comparable");
		System.out.println("2. Comparator");
		System.out.println("Choose a Program to execute: ");
		int getvalue = sc.nextInt();
		System.out.println("Here is the respected output you wanted for...");
		switch (getvalue) {
		case 1:
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
			break;

		case 2:
			ArrayList<Student> student = new ArrayList<>();
			// Storing the values of Student in student ArrayList
			student.add(new Student(23, "Bharat", "Math"));
			student.add(new Student(28, "Gireesh", "Science"));
			student.add(new Student(26, "Subhra", "Geology"));
			student.add(new Student(22, "Sharda", "Physics"));

			// Sorting the object by age
			Collections.sort(student, new SortByAge());
			System.out.println(".................Sorted by age : ");
			for (Student x : student) {
				System.out.print(x + "\t");
			}
			// Sorting the object by name
			System.out.println();
			Collections.sort(student, new SortByName());
			System.out.println(".................Sorted by name : ");
			for (Student x : student) {
				System.out.print(x + "\t");
			}
			// Sorting the object by subject
			System.out.println();
			Collections.sort(student, new SortByFavsub());
			System.out.println(".................Sorted by FavSub : ");
			for (Student x : student) {
				System.out.print(x + "\t");
			}

		}
		System.out.println("Thank You......");
		sc.close();
	}

}
