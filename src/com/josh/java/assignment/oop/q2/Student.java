package com.josh.java.assignment.oop.q2;

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

	/*
	 * created Getter and Setter methods to access the private properties of this
	 * class from outside this class
	 */
	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	@Override
	public String toString() {
		return "Student [name=" + getName() + ", address=" + getAddress() + "program=" + program + ", year=" + year
				+ ", fee=" + fee + "]";
	}
}
