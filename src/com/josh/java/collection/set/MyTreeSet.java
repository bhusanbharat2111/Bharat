package com.josh.java.collection.set;

import java.util.Scanner;
import java.util.TreeSet;

public class MyTreeSet {

	public static void main(String[] args) {
		TreeSet<Integer> array = new TreeSet<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the details to sort an array...\n//Remeber if you enter duplicate value, "
				+ "then also you will get the value one time//");
		System.out.println("Enter the array size :");
		int size = sc.nextInt();
		System.out.println("Enter the values : ");

		// the values will be stored in ascending order
		for (int i = 0; i < size; i++) {
			array.add(sc.nextInt());
		}

		// Displaying the TreeSet
		System.out.println("Here is the sorted array : ");
		for (int x : array) {
			System.out.print(x + " ");
		}

	}

}
