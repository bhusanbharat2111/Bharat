package Assignment1;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number to extract: ");
		long input=sc.nextInt();
		String output="";
		
		while(input>0) {
			output+=(input%10);
			if(input>9) output+=" ";
			input/=10;
		}
		System.out.println(output);
	}

}
