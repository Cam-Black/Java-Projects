package com.qa.lyskov.roomadder;

import com.qa.lyskov.building.Penthouse;

public class BedroomAdder {
	
	public void addBedroom(Penthouse penthouse) {
		penthouse.setNumberOfBedrooms(penthouse.getNumberOfBedrooms() + 1);
	}
}