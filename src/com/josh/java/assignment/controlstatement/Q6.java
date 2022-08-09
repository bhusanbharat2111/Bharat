package com.josh.java.assignment.controlstatement;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double price=0.0;
		double totalActualPrice=0.0;
		double totalSalesPrice=0.0;
		
		while(true) {
			System.out.print("Enter the tax-inclusive price in dollars (or -1 to end): ");
			Double n=sc.nextDouble();
			if(n==-1) break;
			price+=n;
			System.out.println("Actual Price is: $"+ (n/107)*100 +",");
			totalActualPrice+=(n/107)*100;
			System.out.println("Sales Tax is: $ "+(n-(n/107)*100));
			totalSalesPrice+=(n-(n/107)*100);
			System.out.println();
		}
		System.out.println("Total Price is: $"+ price );
		System.out.println("Total Actual Price is: $"+ totalActualPrice);
		System.out.println("Total Sales Tax is: $"+ totalSalesPrice );
	}

}
