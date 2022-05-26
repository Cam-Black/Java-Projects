package com.qa.inheritance;

public class Animals {
	
	private boolean canFly = false;
	private int numOfLegs = 0;
	
	
	public Animals() {}
	
	public void setCanFly(boolean newCanFly) {
		this.canFly = newCanFly;
	}
	public boolean getCanFly() {
		return this.canFly;
	}
}