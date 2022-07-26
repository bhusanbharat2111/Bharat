package com.josh.java.oopsassignment;

import java.util.Date;

class Customer {
	String name;
	boolean member = false;
	String memberType;

	Customer(String name) {
		this.name = name;
	}

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

class Visit {
	private Customer c;
	private Date date;
	private double serviceExpense;
	private double productExpense;

	public Visit(Customer c, Date date) {
		this.c = c;
		this.date = date;
	}

	public String getCustomerName() {
		return c.getName();
	}

	public double getServiceExpense() {
		return serviceExpense;
	}

	public void setServiceExpense(double serviceExpense) {
		this.serviceExpense = this.serviceExpense + serviceExpense;
	}

	public double getProductExpense() {
		return productExpense;
	}

	public void setProductExpense(double productExpense) {
		this.productExpense = this.productExpense + productExpense;
	}

	public double getTotalExpense() {
		return (serviceExpense - (serviceExpense * DiscountRate.getServiceDiscountRate(c.getMemberType())))
				+ (productExpense - (productExpense * DiscountRate.getProductDiscountRate(c.getMemberType())));

	}

	@Override
	public String toString() {
		return "{ " + "customer name=" + c.getName() + ", customer member=" + c.isMember()
				+ ", customer member type=" + c.getMemberType() + ", date=" + date + ", serviceExpense=$"
				+ serviceExpense + ", productExpense=$" + productExpense + " ]";
	}
}

class DiscountRate {

	static double serviceDiscountPremium = 0.2;
	static double serviceDiscountGold = 0.15;
	static double serviceDiscountSilver = 0.1;
	static double productDiscountPremium = 0.1;
	static double productDiscountGold = 0.1;
	static double productDiscountSilver = 0.1;

	public static double getServiceDiscountRate(String type) {
		switch (type) {
		case "Premium":
			return serviceDiscountPremium;
		case "Gold":
			return serviceDiscountGold;
		case "Silver":
			return serviceDiscountSilver;
		default:
			return 0.00;
		}
	}

	public static double getProductDiscountRate(String type) {
		switch (type) {
		case "Premium":
		case "Gold":
		case "Silver":
			return productDiscountSilver;
		default:
			return 0.00;
		}
	}  

}

//public class Q5 {
//	public static void main(String[] args) {
//		Customer c1 = new Customer("Bharat");
//		c1.member=true;
//		c1.memberType="Premium";
//		Visit v1 = new Visit(c1, new Date());
//		v1.setProductExpense(4.5);
//		v1.setServiceExpense(8.5);
//		v1.setProductExpense(1.5);
//		System.out.println(v1.toString());
//		System.out.println("Total expense made by " + v1.getCustomerName() + " = " + v1.getTotalExpense());
//
//	}
//}
