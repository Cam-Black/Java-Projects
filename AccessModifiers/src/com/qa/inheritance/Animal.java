package com.qa.inheritance;

public class Animal {
	//Attributes
	private boolean canFly = false;
	private int numOfLegs = 0;
	private String noise = null;
	
	//Default Constructor
	public Animal() {}
	
	//Constructor to set all attributes of an Animal
	public Animal(boolean canFly, int numOfLegs, String noise) {
		this.canFly = canFly;
		this.numOfLegs = numOfLegs;
		this.noise = noise;
	}
	
	//Setters and Getters
	public void setCanFly(boolean newCanFly) {
		this.canFly = newCanFly;
	}
	public boolean getCanFly() {
		return this.canFly;
	}
	
	public void setNumOfLegs(int newNumOfLegs) {
		this.numOfLegs = newNumOfLegs;
	}
	
	public int getNumOfLegs() {
		return this.numOfLegs;
	}
	
	public String makeNoise() {
		return this.noise;
	}
	
	@Override
	public String toString() {
		return "Animal [canFly = " + this.canFly + ", numOfLegs = " + this.numOfLegs + ", noise = " + this.noise + "]";
	}
}