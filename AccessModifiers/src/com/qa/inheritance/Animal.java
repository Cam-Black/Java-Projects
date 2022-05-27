package com.qa.inheritance;

public class Animal {
	//Attributes
	private boolean canFly;
	private int numOfLegs;
	
	//Default Constructor
	public Animal() {}
	
	//Constructor to set all attributes of an Animal
	public Animal(boolean canFly, int numOfLegs) {
		this.canFly = canFly;
		this.numOfLegs = numOfLegs;
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
	
	
	//Methods for all Animal Objects
	public String makeNoise() {
		return "noise";
	}
	
	public String meal() {
		return "I eat food";
	}
	
	@Override
	public String toString() {
		return "Animal [canFly = " + this.canFly + ", numOfLegs = " + this.numOfLegs + "]";
	}
}