package com.qa.lyskov.building;

public class Studio {
	private int numberOfBedrooms = 1;
	private int squareFootage;
	
	public Studio() {}

	public void setSquareFootage(int length, int width) {
		this.squareFootage = length * width;
	}
	
	public int getSquareFootage() {
		return this.squareFootage;
	}
	
	public int getNumberOfBedrooms() {
		return numberOfBedrooms;
	}
}