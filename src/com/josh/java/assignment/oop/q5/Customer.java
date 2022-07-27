package com.josh.java.assignment.oop.q5;

//Customer class contains customer name and details(about if the person has membership)
public class Customer {
	private String name;
	private boolean member;
	private String memberType;

	// Customer class Constructor
	public Customer(String name) {
		this.name = name;
	}

	/*
	 * created Getter and Setter methods to access the private properties of this
	 * class from outside this class
	 */
	public String getName() {
		return name;
	}

	public boolean isMember() {
		return member;
	}

	public void setMember(boolean member) {
		this.member = member;
	}

	public String getMemberType() {
		return memberType;
	}

	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", member=" + member + ", memberType=" + memberType + "]";
	}
}
