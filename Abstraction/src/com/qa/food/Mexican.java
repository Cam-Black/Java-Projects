package com.qa.food;

public class Mexican extends Food {
	
	public Mexican() {}
	
	public Mexican(boolean spicy, String dish, double cost) {
		super(spicy, dish, cost);
	}

	@Override
	public boolean isSpicy() {
		return this.spicy;
	}

	@Override
	public void meal() {
		System.out.println("Tonight's meal is " + dish);
	}

	@Override
	public void price() {
		System.out.println("The meal will cost you: " + cost);
	}
}