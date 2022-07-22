package Day1;

import java.util.Scanner;

public class Operators {
	public void arithmetic(int a,int b) {
		System.out.println("Add :"+(a+b));
		System.out.println("Sub :"+(a-b));
		System.out.println("Div :"+(a/b));
		System.out.println("Mod :"+(a%b));
	}
	public void comparison(int a,int b) {
		if(a>b)System.out.println("a is greater than b");
		else if(b>a) System.out.println("b is greater than a");
		else System.out.println("both are equals");
	}
	public void logical(int a) {
		if(a%400==0 || a%4==0 && a%100!=0) {
			System.out.println("Its a leap year");
		}
		else System.out.println("not a leap year");
	}
	public void bitwise(int a, int b) {
		int num1=a;
		int num2=b;
		int result=0;
		result=num1&num2;
		System.out.println("num1&num2="+result);
		
		result=num1|num2;
		System.out.println("num1|num1="+result);
		
		result=num1^num2;
		System.out.println("num1^num2="+result);
		 
		result=num1>>2;
		System.out.println("num1>>2="+result);
		
		result=num2<<2;
		System.out.println("num2<<2="+result);
	}
	public void ternary(int a, int b) {
		int c=a>b? a:b;
		int n=c;
		while(true) {
			if(c%a==0 && c%b==0) {
				System.out.println("LCM of "+a+","+b+"="+c);
				break;
			}
			c+=n;
		}
	}

	public static void main(String[] args) {
		Operators op=new Operators();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value to check Arithmetic and comparison operators");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		op.arithmetic(a,b);
		op.comparison(a, b);
		
		System.out.println("enter the year to check leap year or not");
		int year=sc.nextInt();
		op.logical(year);
		
		System.out.println("Enter the values to check bit wise operators");
		int c=sc.nextInt();
		int d=sc.nextInt();
		op.bitwise(c,d);
		
		System.out.println("Enter the values to find LCM");
		int e=sc.nextInt();
		int f=sc.nextInt();
		op.ternary(e,f);
		sc.close();
	}
}
