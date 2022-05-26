package com.qa.inheritance;

public class Cat extends Animal {
	private String noise = "meow";
	private String favouriteFood = "Tuna";

	// Default Constructor
	public Cat() {}

	public Cat(boolean canFly, int numOfLegs, String noise, String favouriteFood) {
		super(canFly, numOfLegs);
		this.noise = noise;
		this.favouriteFood = favouriteFood;
	}
	
	public String iAmCat() {
		return "I am a Cat, bow before me!";
	}
	
	public String makeNoise() {
		return this.noise;
	}
	
//	@Override
//	public String meal() {
//		return "I only eat my favourite food: " + favouriteFood;
//	}

	@Override
	public String toString() {
		return "Cat [noise=" + noise + ", favouriteFood=" + favouriteFood + "]";
	}
	
	
}
