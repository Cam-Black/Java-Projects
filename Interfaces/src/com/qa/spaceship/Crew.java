package com.qa.spaceship;

import com.qa.interfaces.InterfaceThree;
import com.qa.interfaces.InterfaceTwo;

public class Crew implements InterfaceTwo, InterfaceThree {
	private String name = "Crew Member";
	private String landingVehicle = "Epsilon 8";
	
	public Crew() {}
	
	public Crew(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}

	@Override
	public void oxygenWarning() {
		System.out.println("Oxygen tank low! Plese swap or refill tank!");
	}

	@Override
	public void impactWarning() {
		System.out.println("You are moving on a collision path");
		System.out.println("I suggest you alter course before impact!");
	}

	@Override
	public void selfDestruct() {
		System.out.println("Crew member " + this.name + " initiated self destruct! Only " + this.name + "or Captain can disable self destruct!");
	}

	@Override
	public void spaceWalk() {
		System.out.println("Enjoy your walk " + this.name);
	}

	@Override
	public void deployLandingVehicle() {
		System.out.println("Crew Member " + this.name + " has deployed " + this.landingVehicle);
	}

	@Override
	public void decompress() {
		System.out.println("Welcome back " + this.name + "! Decompression will now commence!");
	}
}