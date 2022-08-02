package training.string;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// this is a menu that shows the list of programs
		System.out.println("Menu Card");
		System.out.println("1. Occurrence Of Character");
		System.out.println("2. Pallindrome");
		System.out.print("Enter program no. to execute:");

		switch (sc.nextInt()) {
		case 1:// Occurrence Of Character program execution
			System.out.println("Enter a string to print occurence:");
			System.out.println(OccurrenceOfCharacter.Display(sc.next()));
			break;
		case 2:// Pallindrome program execution
			System.out.println("Enter a string to check pallindrome:");
			System.out.println(Pallindrome.isPallindrome(sc.next()));
			break;
		default:
			System.out.println("Enter valid number !!");
		}
		sc.close();
	}
}