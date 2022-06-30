package com.qa.lyskov.building;

public class Penthouse {
	private int numberOfBedrooms;
	private int squareFootage;
	
	public Penthouse() {}
	
	public Penthouse(int numberOfBedrooms) {
		this.numberOfBedrooms = numberOfBedrooms;
	}

	public void setSquareFootage(int sqft) {
		this.squareFootage = sqft;
	}
	
	public int getSquareFootage() {
		return squareFootage;
	}
	
	public void setNumberOfBedrooms(int numberOfBedrooms) {
		this.numberOfBedrooms = numberOfBedrooms;
	}
	
	public int getNumberOfBedrooms() {
		return numberOfBedrooms;
	}
}