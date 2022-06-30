package com.qa.junit.animal;

public class Animal {
	String breed;
	
	public Animal() {}
	
	public Animal(String breed) {
		this.breed = breed;
	}
	
	public String makeNoise() {
		return "Noise";
	}
	
	@Override
	public String toString() {
		return "Animal: [" + this.breed + "]";
	}
}
