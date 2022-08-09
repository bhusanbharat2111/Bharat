package com.josh.java.assignment.oop.q2;

//import lombok.Data;

//imported data class to implement getter and setter method  
//@Data

//this class have name and address properties as it is a sub class of person
public class Student extends Person {
	private String program;
	private int year;
	private double fee;

	/*
	 * making this constructor public as the driver class is present in different
	 * package and that driver class creates the object
	 */
	public Student(String name, String address, String program, int year, double fee) {
		super(name, address);
		this.program = program;
		this.year = year;
	}

	@Override
	public String toString() {
		return "Student [name=" + getName() + ", address=" + getAddress() + "program=" + program + ", year=" + year
				+ ", fee=" + fee + "]";
	}
}
