package training.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Division {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter two values fron division");
		try {
			System.out.println("Enter 1st number:");
			int a = kb.nextInt();
			if (a < 0) {
				throw new CustomException("ERROR!\nPlease, don't use negetive values!");
			}
			System.out.println("Enter 2nd number:");
			int b = kb.nextInt();
			if (a < b) {
				throw new CustomException("Error!\n1st number must be greater than 2nd!");
			}
			if (b < 0) {
				throw new CustomException("ERROR!\nPlease, don't use negetive values!");
			}
			if (a < b) {
				throw new CustomException("ERROR!\n1st number can't be smaller than 2nd number!");
			}
			System.out.println("Division of a/b is:" + ((double) a / b));

		} catch (CustomException nvx) {
			System.out.println(nvx.getMessage());
		} catch (InputMismatchException ime) {
			System.out.println("ERROR!\nUse only digits");
		} finally {
			kb.close();
			System.out.println("Thank You!\nBYE..");
		}
	}
}
