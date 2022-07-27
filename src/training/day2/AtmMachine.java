package training.day2;

import java.util.Scanner;

//this class works as a atm machine where you can deposit, withdraw, and check balance 
//by default the balance will be zero 
public class AtmMachine {

	public static void main(String[] args) {
		Scanner sc;
		int Amount = 0;
		while (true) {
			System.out.println("1.Deposit");
			System.out.println("2.Withdrow");
			System.out.println("3.Check Balance");
			System.out.print("Enter your choice: ");
			sc = new Scanner(System.in);
			int n = sc.nextInt();

			switch (n) {
			case 1:
				System.out.print("Enter amount: ");
				int d = sc.nextInt();
				if (d % 100 != 0) {
					System.out.println("Enter multiple of 100, 200, 500, 2000");
					break;
				}
				Amount += d;
				System.out.println(d + " /- deposited successfully");
				break;
			case 2:
				System.out.print("Enter amount: ");
				int w = sc.nextInt();
				if (w % 100 != 0) {
					System.out.println("Enter multiple of 100, 200, 500, 2000");
					break;
				}
				if (w > Amount) {
					System.out.println("Insufficient balance");
					break;
				}
				Amount -= w;
				System.out.println(w + " /- withdrew successfully");
				break;
			case 3:
				System.out.println("Balance: " + Amount);
				break;
			default:
				System.out.println("You have enterd invalid choice");
			}

			System.out.print("Want to continue?? /Enter 1 for yes, any other for no/: ");
			int k = sc.nextInt();

			System.out.println();
			if (k != 1)
				break;
		}
		System.out.println("Thank you, visit again");
		sc.close();
	}
}
