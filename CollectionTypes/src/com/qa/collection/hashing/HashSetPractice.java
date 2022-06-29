package com.qa.collection.hashing;

import java.util.HashSet;
import java.util.Set;

public class HashSetPractice {
	Set<String> cars = new HashSet<>();
	
	public Set<String> addCars(String car) {
		cars.add(car);
		System.out.println(cars);
		return cars;
	}

	@Override
	public String toString() {
		return "cars = " + cars;
	}
	
}
