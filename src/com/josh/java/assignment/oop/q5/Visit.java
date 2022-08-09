package com.josh.java.assignment.oop.q5;

import java.util.Date;
import lombok.Data;

@Data

//Visit class calculates the total expense of the customer by checking membership type of that customer and returns the bill
public class Visit {
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

	public void setServiceExpense(double serviceExpense) {
		this.serviceExpense = this.serviceExpense + serviceExpense;
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
		return "\n[\n" + " customer name=" + c.getName() + ",\n customer member=" + c.isMember()
				+ ",\n customer member type=" + c.getMemberType() + ",\n date=" + date + ",\n serviceExpense=$"
				+ serviceExpense + ",\n productExpense=$" + productExpense + " \n]";
	}
}