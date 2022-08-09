package com.josh.java.assignment.oop.driver;

import java.util.Date;
import java.util.Scanner;
import com.josh.java.assignment.oop.q2.Person;
import com.josh.java.assignment.oop.q2.Staff;
import com.josh.java.assignment.oop.q5.Customer;
import com.josh.java.assignment.oop.q5.Visit;

/*
 * Driver class executes the program which the client wants to run
 */
public class Driver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*
		 * created one menu card so that client can enter the program he wants to
		 * execute
		 */
		System.out.println("Menu Card");
		System.out.println("2. Q2");
		System.out.println("5. Q5");
		System.out.print("Enter program no. to execute:");
		int input = sc.nextInt();

		switch (input) {
		case 2:
			Person person = new Staff("Bharat", "Odisha", "dth", 543638);
			System.out.println(person);
			break;
		case 5:
			Customer customer1 = new Customer("Sharda");
			customer1.setMember(true);
			customer1.setMemberType("Premium");
			Visit visit1 = new Visit(customer1, new Date());
			visit1.setProductExpense(85.5);
			visit1.setServiceExpense(18.5);
			visit1.setProductExpense(63.5);
			System.out.println(visit1.toString());
			System.out.println("Total expense made by " + visit1.getCustomerName() + " = $" + visit1.getTotalExpense());
			break;
		default:
			System.out.println("Enter valid program number //");
		}
		sc.close();

	}

}
