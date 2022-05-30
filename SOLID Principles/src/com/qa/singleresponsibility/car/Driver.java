package com.qa.singleresponsibility.car;

public class Driver {
	
	public int drive(Car myCar, int mileageDriven) {
		System.out.println("Going for a drive " + mileageDriven + " miles long!");
		myCar.setMileage(mileageDriven + myCar.getMileage());
		return myCar.getMileage();
	}
	
	public void pumpUpTyres() {
		System.out.println("Pump the tyres up to their correct pressure!");
	}
}
