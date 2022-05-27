package com.qa.abstracts;

public class Mexican extends Food {
	private boolean spicy = false;
	private String dish = "Food";
	private double cost = 10;
	
	public Mexican() {}
	
	public Mexican(boolean spicy, String dish, double cost) {
		super();
		this.spicy = spicy;
		this.dish = dish;
		this.cost = cost;
	}


	@Override
	public boolean isSpicy() {
		return spicy;
	}

	@Override
	public void meal() {
		System.out.println("Tonights meal is " + dish);
	}

	@Override
	public void price() {
		System.out.println("The meal will cost you: " + cost);
		
	}
}