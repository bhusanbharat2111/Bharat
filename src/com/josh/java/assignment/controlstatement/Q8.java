package com.josh.java.assignment.controlstatement;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of time Table:");
		int n=sc.nextInt();
		for(int i=0;i<=n;i++) {
			if(i==0)System.out.print("*\t | \t");
			else System.out.print(i+"\t");
		}
		System.out.println();
		for(int j=0;j<=n;j++)	System.out.print("--------");
		System.out.print("--\n");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j==1) System.out.print(i+"\t | \t"+i*j +"\t");
				else System.out.print(i*j +"\t");
			}
			System.out.println();
		}

	}

}