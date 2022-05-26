package com.qa.inheritance;

public class Birds extends Animals {
	
	private boolean hasWings = true;
	
	public void setWings(boolean hasWings) {
		this.hasWings = hasWings;
	}
	public static void makeNoise() {
		System.out.println("Tweet");
	}
	
	@Override
	public String toString() {
		return "Birds [hasWings = " + this.hasWings + ", canFly = " + super.getCanFly() + "]";
	}
	
}
