package com.josh.java.assignment.controlstatement;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of pattern: ");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		System.out.println("*-------------------*");
		
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		System.out.println("*-------------------*");
		
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=n;j++) {
				if(j<=n-i) System.out.print(" ");	
				else System.out.print("#");
			}
			System.out.println();
		}
		System.out.println("*-------------------*");
		
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=1;j--) {
				if(j<=i) System.out.print("#");
				else System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println("*-------------------*");
	}

}
