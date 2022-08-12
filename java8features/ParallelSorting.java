package training.java8features;

import java.util.Arrays;

public class ParallelSorting {

	public static void main(String[] args) {
		// Creating an array
		int[] numbers = { 22, 89, 1, 32, 19, 5 };

		// Printing unsorted Array
		System.out.print("Unsorted array: ");
		// Iterating the Elements using stream
		Arrays.stream(numbers).forEach(n -> System.out.print(n + " "));
		System.out.println();

		// Using Arrays.parallelSort()
		Arrays.parallelSort(numbers);

		// Printing sorted Array
		System.out.print("Sorted array: ");
		// Iterating the Elements using stream
		Arrays.stream(numbers).forEach(n -> System.out.print(n + " "));
		System.out.println("\n" + "Unsorted array");

		// Creating an array
		int[] number = { 9, 5, 7, 8, 3, 2, 1, 0 };
		Arrays.stream(number).forEach(n -> System.out.print(n + " "));
		System.out.println();
		// Printing according to index which are passed
		Arrays.parallelSort(number, 1, 5);
		System.out.println("According to index sorting the array:");
		// converting the array to stream and displaying using forEach
		Arrays.stream(number).forEach(n -> System.out.print(n + " "));
	}

}
