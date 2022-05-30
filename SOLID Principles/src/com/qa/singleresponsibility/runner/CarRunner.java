package com.qa.singleresponsibility.runner;

import com.qa.singleresponsibility.car.*;

public class CarRunner {

	public static void main(String[] args) {
		Car myCar = new Car("Red", 2, 1500, 3.5);
		Mechanic myMechanic = new Mechanic();
		Driver myDriver = new Driver();
		
		System.out.println(myCar.getMileage());
		System.out.println(myMechanic.serviceCar(myCar));
		System.out.println(myDriver.drive(myCar, 100));
		
	}
}