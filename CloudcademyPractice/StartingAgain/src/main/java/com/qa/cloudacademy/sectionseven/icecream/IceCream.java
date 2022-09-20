package com.qa.cloudacademy.sectionseven.icecream;

import java.util.ArrayList;
import java.util.List;

public class IceCream {
	private String name;
	private int cost;
	private int numScoops;
	private List<String> toppings;
	
	public IceCream() {
		super();
		toppings = new ArrayList<>();
	}
	
	public IceCream(String name, int cost, int numScoops) {
		this();
		this.name = name;
		this.cost = cost;
		this.numScoops = numScoops;
	}
	
	public void addTopping(String topping) {
		this.toppings.add(topping);
	}
	
	public String getToppings() {
		StringBuilder sb = new StringBuilder();
		toppings.forEach((el) -> sb.append("\n\t").append(el));
		return new String(sb);
	}
	
	public String getName() {
		return name;
	}
	
	public int getCost() {
		return cost * numScoops;
	}
	
	public int getNumScoops() {
		return numScoops;
	}
	
	@Override
	public String toString() {
		return this.getName() +"\nCost: £" + this.getCost() + "\nTopped with: " + this.getToppings();
	}
}