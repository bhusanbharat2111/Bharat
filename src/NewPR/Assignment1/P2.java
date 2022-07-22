package Assignment1;

import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a:");
		int a=sc.nextInt();
		System.out.println("Enter b:");
		int b=sc.nextInt();
		System.out.println("Enter n:");
		int n=sc.nextInt();
		int sum=a;
		int fact=1;
		for(int i=0;i<n;i++) {
			sum+=fact*b;
			System.out.print(sum+" ");
			fact*=2;
		}
		sc.close();
	}
	
}
