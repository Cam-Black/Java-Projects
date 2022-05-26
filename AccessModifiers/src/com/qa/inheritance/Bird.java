package com.qa.inheritance;

public class Bird extends Animal {
	
	private boolean hasWings = true;
	private String colour = "Black"; 
	
	public Bird() {}
	
	public Bird(boolean canFly, int numOfLegs, boolean hasWings, String colour) {
		super(canFly, numOfLegs);
		this.hasWings = hasWings;
		this.colour = colour;
		
	}
	
	public void setWings(boolean hasWings) {
		this.hasWings = hasWings;
	}
	
	public String myColour() {
		return "My Colour is: " + this.colour;
	}
	
	public String makeNoise() {
		return "Tweet";
	}
	@Override
	public String toString() {
		return "Bird [hasWings = " + this.hasWings + ", Animal Attributes = " + super.toString() + "]";
	}
	
}
