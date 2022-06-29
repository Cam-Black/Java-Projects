package com.qa.collection.enums;

public enum Pizza {
	PEPPERONI(8.99), BBQCHICKEN(7.99), HAWAIIAN(6.99), MEATFEAST(9.99);

	public final double COST;

	Pizza(double cost) {
		this.COST = cost;
	}

	public static String orderPizza(String choice) {
		switch (choice) {
		case "Pepperoni":
			return "You ordered Pepperoni Pizza, that will cost: " + PEPPERONI.COST;
		default:
			return "Invalid Selection.\nChoices are:\nPepperoni\nBBQ Chicken\nHawaiian\nMeat Feast";
		}
	}
}