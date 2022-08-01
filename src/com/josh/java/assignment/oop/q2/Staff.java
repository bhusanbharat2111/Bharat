package com.josh.java.assignment.oop.q2;

//import lombok.Data;

//imported data class to implement getter and setter method  
//@Data

//this class have name and address properties as it is a sub class of person
public class Staff extends Person {
	private String school;
	private double pay;

	/*
	 * making this constructor public as the driver class is present in different
	 * package and that driver class creates the object
	 */
	public Staff(String name, String address, String school, double pay) {
		super(name, address);
		this.school = school;
		this.pay = pay;
	}

	@Override
	public String toString() {
		return "Staff [ name=" + getName() + ", address=" + getAddress() + ", school=" + school + ", pay=" + pay + " ]";
	}
}
