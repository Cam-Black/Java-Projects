package com.qa.runner;

import com.qa.spaceship.Crew;
import com.qa.spaceship.Spaceship;

public class Runner {

	public static void main(String[] args) {
		//Create objects from my classes
		Spaceship mySpaceship = new Spaceship("Nostromo");
		Crew crewmateOne = new Crew("Ellen Ripley");
		
		//Output name of spaceship and cremember
		System.out.println(mySpaceship.getName());
		System.out.println(crewmateOne.getName());
		
		//Calling all methods from classes
		mySpaceship.land();
		mySpaceship.impactWarning();
		mySpaceship.oxygenWarning();
		mySpaceship.land();
		System.out.println("");
		crewmateOne.decompress();
		crewmateOne.deployLandingVehicle();
	}

}
