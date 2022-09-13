package com.qa.cloudacademy.sectionthree;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int userGuess;
		int guesses = 0;
		Random rand = new Random();
		int target = rand.nextInt(100) + 1;
		
		do {
			System.out.print("Enter a number between 1 and 100: ");
			guesses++;
			userGuess = s.nextInt();
			
			if (userGuess <= 0 || userGuess > 100) {
				System.out.println("Please enter a number between 1 and 100");
			} else if (userGuess < target) {
				System.out.println("Your guess was too low!");
			} else if (userGuess > target){
				System.out.println("Your guess was too high");
			}
		} while (userGuess != target);
		System.out.println("Congratulations, you guessed the number in " + guesses + " guesses! Thanks for playing");
	}
}
