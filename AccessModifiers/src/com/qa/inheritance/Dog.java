package com.qa.inheritance;

public class Dog extends Animal {
	// Attributes unique to Dog class
	private String noise = "woof";
	private String myFavouriteThing = "Chase Cats";
	private String breed = "dog";

	// Default Constructor
	public Dog() {}
	
	//Constructor to create a dog using super attributes along with dog breed
	public Dog (boolean canFly, int numOfLegs, String breed) {
		super(canFly, numOfLegs);
		this.breed = breed;
	}
	
	public String makeNoise() {
		return this.noise;
	}
	
	@Override
	public String toString() {
		return "Dog [noise = " + this.noise + ", myFavouriteThing = " + this.myFavouriteThing + ", breed = " + breed + ", canFly = " + super.getCanFly() + ", numOfLegs = " + super.getNumOfLegs() + "]";
	}
}