package com.josh.java.assignment.oop.q2;

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

	/*
	 * created Getter and Setter methods to access the private properties of this
	 * class from outside this class
	 */
	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public double getPay() {
		return pay;
	}

	public void setPay(double pay) {
		this.pay = pay;
	}

	@Override // overriding method of object class
	public String toString() {
		return "Staff [ name=" + getName() + ", address=" + getAddress() + ", school=" + school + ", pay=" + pay + " ]";
	}
}
