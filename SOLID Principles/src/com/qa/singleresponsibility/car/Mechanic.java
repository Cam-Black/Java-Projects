package com.qa.singleresponsibility.car;

public class Mechanic {
	
	public String serviceCar(Car myCar) {
		return "Car was serviced at " + myCar.getMileage() + ". Car needs next service at " + (myCar.getMileage() + 5000);
	}
}
