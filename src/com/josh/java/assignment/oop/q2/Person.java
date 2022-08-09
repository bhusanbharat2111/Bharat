package com.josh.java.assignment.oop.q2;

//this is the super class of Staff class and Student class
public class Person {
	private String name;
	private String address;

	/*
	 * making this constructor protected to block the visibility from outside
	 * package classes except the classes who inherits
	 */
	protected Person(String name, String address) {
		this.name = name;
		this.address = address;
	}

	/*
	 * created Getter and Setter methods to access the private properties of this
	 * class from outside this class
	 */
	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + "]";
	}
}
