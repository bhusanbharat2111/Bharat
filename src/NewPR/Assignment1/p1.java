package NewPR.Assignment1;

import java.util.Scanner;

public class p1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		if(n%2!=0 || (n>=11 & n<=20)) System.out.println("Weird");
		else System.out.println("Not Weird");
		sc.close();
	}
	
}
