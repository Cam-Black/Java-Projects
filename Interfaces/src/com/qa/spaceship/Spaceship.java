package com.qa.spaceship;

import com.qa.interfaces.InterfaceOne;
import com.qa.interfaces.InterfaceThree;

public class Spaceship implements InterfaceOne, InterfaceThree {

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
		System.out.println("Self Destrcut Initiated");
	}

	@Override
	public void takeOff() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void land() {
		// TODO Auto-generated method stub
		
	}
	
}
