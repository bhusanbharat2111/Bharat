package com.josh.java.assignment.controlstatement;

public class Q4 {

	public static void main(String[] args) {
		int start=1;
		int end=110;
		
		while(start<=end) {
			String s1="";
			if(start%3==0) s1="Coza";
			if(start%5==0) s1+="Loza";
			if(start%7==0) s1+="Woza";
			if(s1.length()==0) System.out.print(start+" ");
			else System.out.print(s1+" ");
			if(start%11==0) System.out.println();
			start++;
			
		}

	}

}
