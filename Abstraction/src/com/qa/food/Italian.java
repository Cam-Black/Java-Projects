package com.qa.food;

public class Italian extends Food {
	
	public String dish = "Spaghetti";
	
	
	public Italian() {
		super();
	}

	public Italian(boolean spicy, String dish, double cost) {
		super(spicy, cost);
		this.dish = dish;
	}
	
	public Italian(boolean spicy, double cost, String dish) {
		super(spicy, dish, cost);
	}

	@Override
	public boolean isSpicy() {
		return this.spicy;
	}

	@Override
	public void meal() {
		System.out.println("Tonight's Italian dish is " + this.dish);
	}

	@Override
	public void price() {
		System.out.println("The cost is: " + this.cost);
	}
}