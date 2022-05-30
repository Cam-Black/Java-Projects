package com.qa.spaceship;

import com.qa.interfaces.InterfaceOne;
import com.qa.interfaces.InterfaceThree;

public class Spaceship implements InterfaceOne, InterfaceThree {
	
	private String name;
	
	public Spaceship() {}
	
	public Spaceship(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	@Override
	public void oxygenWarning() {
		System.out.println("Oxygen Low! Oxygen Low! System will shut down!");
	}

	@Override
	public void impactWarning() {
		System.out.println("Warning: Ship is on a Collision Course! Impact Warning! Please Evacuate Immediately!");		
	}

	@Override
	public void selfDestruct() {
		System.out.println("Self Destrcut Initiated!");
	}

	@Override
	public void takeOff() {
		System.out.println("Take off sequence initiated! Prepare for Take Off!");
		System.out.println("BOOM!");
		System.out.println("Blastoff!");
	}

	@Override
	public void land() {
		System.out.println("Landing Sequence initiated! Strap in!");
		System.out.println("BANG");
		System.out.println("Landing Successful!");
	}
	
}
