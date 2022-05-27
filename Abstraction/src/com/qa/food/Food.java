package com.qa.food;

public abstract class Food {
	protected boolean spicy = false;
	protected String dish = "Food";
	protected double cost = 10;
	
	protected Food() {}
	protected Food(boolean spicy, String dish, double cost) {
		this.spicy = spicy;
		this.dish = dish;
		this.cost = cost;
	}
	
	
	public Food(boolean spicy, double cost) {
		this.spicy = spicy;
		this.cost = cost;
	}
	public abstract boolean isSpicy();
	public abstract void meal();
	public abstract void price();
}
