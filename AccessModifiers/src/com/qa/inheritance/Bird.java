package com.qa.inheritance;

public class Bird extends Animal {
	
	private boolean hasWings = true;
	
	public void setWings(boolean hasWings) {
		this.hasWings = hasWings;
	}
	
	@Override
	public String toString() {
		return "Birds [hasWings = " + this.hasWings + ", Animal Attributes = " + super.toString() + "]";
	}
	
}
