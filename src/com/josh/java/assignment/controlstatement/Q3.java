package com.josh.java.assignment.controlstatement;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the lowerbound value: ");
		int lowerBound=sc.nextInt();
		int temp=lowerBound;
		System.out.print("Enter the upperbound value: ");
		int upperBound=sc.nextInt();
		
		if(lowerBound > upperBound) {
			System.out.println("Error: upperbound less than lowerbound!");
			return;
		}
		
		long count=0;
		long sum=0;
		while( lowerBound <= upperBound ) {
			sum+=lowerBound++;
			count++;
		}
		
		System.out.println("The sum of "+temp+" to "+upperBound+" is "+sum);
		System.out.println("The average is "+((double)sum/count));
	}

}
