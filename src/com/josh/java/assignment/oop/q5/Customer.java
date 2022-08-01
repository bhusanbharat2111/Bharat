package com.josh.java.assignment.oop.q5;

import lombok.Data;

@Data

//Customer class contains customer name and details(about if the person has membership)
public class Customer {
	private String name;
	private boolean member;
	private String memberType;

	// Customer class Constructor
	public Customer(String name) {
		this.name = name;
	}

	
//	@Override
//	public String toString() {
//		return "Customer [name=" + name + ", member=" + member + ", memberType=" + memberType + "]";
//	}
}
