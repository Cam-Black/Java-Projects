package com.qa.cloudacademy.sectionthree;

import java.util.Random;

public class DiceRoller {
	/**
	 * Rolls a die, using an {@code int} value for its upper bound.
	 * @param dieBound upper bound for value of the die.
	 * @return {@code int} value between 1 and the value passed in {@code dieBound}.
	 */
	static int rollDice(int dieBound) {
		int dieRoll;
		Random rand = new Random();
		
		dieRoll = rand.nextInt(dieBound) + 1;
		return dieRoll;
	}
	
	/**
	 * Using the {@code rollDice(int dieBound)} method, passes two ints, {@code dieBound timesToRoll},
	 * to roll a die with a value of 1 to x, where x is the {@code dieBound}, y times, where y is {@code timesToRoll}.
	 * @param dieBound upper bound for value of the die.
	 * @param timesToRoll number of times the dice is to be rolled.
	 */
	static void rollMultipleTimes(int dieBound, int timesToRoll) {
		for (int i = 0; i < timesToRoll; i++) {
			System.out.println(rollDice(dieBound));
		}
	}
	public static void main(String[] args) {
		rollMultipleTimes(20, 3);
		
	}
}
