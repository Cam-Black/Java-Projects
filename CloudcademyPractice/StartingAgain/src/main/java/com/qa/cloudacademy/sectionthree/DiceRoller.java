package com.qa.cloudacademy.sectionthree;

import java.util.Random;

public class DiceRoller {
	public static void main(String[] args) {
		int dieRoll;
		Random rand = new Random();
		
		dieRoll = rand.nextInt(6) + 1;
		System.out.println(dieRoll);
	}
}
