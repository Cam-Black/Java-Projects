package com.qa.cloudacademy.sectionseven.icecream;

public class Runner {
	public static void main(String[] args) {
		IceCream vanilla = new IceCream("Vanilla Sprinkles", 1, 2);
		vanilla.addTopping("Sprinkles");
		vanilla.addTopping("Chocolate Sauce");
		System.out.println(vanilla);
	}
}
