package com.josh.java.assignment.oop.q5;

//DiscountRate class returns the value of discount rate by checking the membership type of customer 
public class DiscountRate {

	/*
	 * making these variables private and final because the discount rate is
	 * constant for members according to their membership type
	 */
	private final static double SERVICEDISCOUNTPREMIUM = 0.2;
	private final static double SERVICEDISCOUNTGOLD = 0.15;
	private final static double SERVICEDISCOUNTSILVER = 0.1;
	private final static double PRODUCTDISCOUNTPREMIUM = 0.1;
	private final static double PRODUCTDISCOUNTGGOLD = 0.1;
	private final static double PRODUCTDISCOUNTSILVER = 0.1;

	// this method returns service discount rate value by checking the member type
	public static double getServiceDiscountRate(String type) {
		switch (type) {
		case "Premium":
			return SERVICEDISCOUNTPREMIUM;
		case "Gold":
			return SERVICEDISCOUNTGOLD;
		case "Silver":
			return SERVICEDISCOUNTSILVER;
		default:
			return 0.00;
		}
	}

	// this method returns product discount rate value by checking the member type
	public static double getProductDiscountRate(String type) {
		switch (type) {
		case "Premium":
			return PRODUCTDISCOUNTPREMIUM;
		case "Gold":
			return PRODUCTDISCOUNTGGOLD;
		case "Silver":
			return PRODUCTDISCOUNTSILVER;
		default:
			return 0.00;
		}
	}
}
