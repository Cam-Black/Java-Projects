package com.qa.lyskov.runner;

import com.qa.lyskov.building.*;
import com.qa.lyskov.roomadder.BedroomAdder;

public class BedroomAddRunner {

	public static void main(String[] args) {
		Penthouse myPHouse = new Penthouse();
		Studio myStudio = new Studio();
		BedroomAdder bedPlus = new BedroomAdder();
		
		System.out.println(myPHouse.getNumberOfBedrooms());
		bedPlus.addBedroom(myPHouse);
		System.out.println(myPHouse.getNumberOfBedrooms());
		
	}
}