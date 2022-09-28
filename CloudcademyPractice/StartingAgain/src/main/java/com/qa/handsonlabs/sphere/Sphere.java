package com.qa.handsonlabs.sphere;

import java.text.DecimalFormat;

public class Sphere {
	private static DecimalFormat f = new DecimalFormat("##.00");
	
	public static double getVolume(double radius) {
		double volume;
		double fourThirds = 1.33;
		double pi = 3.14;
		
		//Note: you must reuse the provided partial implementation above without changing it
		//Hint 1: volume of a sphere is: 4/3*pi*radius^3
		//Hint 2: open the integrated terminal and run the command "gradle test" to execute all tests
		
		//your implementation goes here
		if (radius > 1000) {
			return 0;
		} else if (radius < 0) {
			throw new IllegalArgumentException("Radius cannot be smaller than 0");
		}
		volume = Double.parseDouble(f.format(Math.pow(radius, 3) * pi * fourThirds));
		return volume;
	}
}