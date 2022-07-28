package com.josh.java.assignment.oop.q2;

import lombok.Data;

//imported data class to implement getter and setter method  
@Data

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
}
