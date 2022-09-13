package com.qa.cloudacademy.sectionthree;

import java.util.Random;

public class DiceRoller {
	static int rollDice(int dieBound) {
		int dieRoll;
		Random rand = new Random();
		
		dieRoll = rand.nextInt(dieBound) + 1;
		return dieRoll;
	}
	
	static void rollTenTimes(int dieBound, int timesToRoll) {
		for (int i = 0; i < timesToRoll; i++) {
			System.out.println(rollDice(dieBound));
		}
	}
	public static void main(String[] args) {
		rollTenTimes(20, 3);
		
	}
}
