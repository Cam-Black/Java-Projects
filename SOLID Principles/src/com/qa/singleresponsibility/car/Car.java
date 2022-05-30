package com.qa.singleresponsibility.car;

public class Car {
	private String colour;
	private int doors;
	private int mileage;
	private double engineSize;
	
	public Car() {}
	
	public Car(String colour, int doors, int mileage, double engineSize) {
		this.colour = colour;
		this.doors = doors;
		this.mileage = mileage;
		this.engineSize = engineSize;
	}
	
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	public int getMileage() {
		return this.mileage;
	}
	
	public String getColour() {
		return this.colour;
	}
}