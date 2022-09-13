package com.qa.cloudacademy.sectionthree.learningpackage;

import java.util.Scanner;

public class Utils {
	private final Scanner SCAN;
	
	public Utils() {
		super();
		SCAN = new Scanner(System.in);
	}
	
	public String getString() {
		return SCAN.nextLine();
	}
	
	public int getInt() {
		String input = null;
		Integer intInput = null;
		do {
			try {
				input = getString();
				intInput = Integer.parseInt(input);
			} catch (NumberFormatException nfe) {
				System.err.println("Error - Please enter a number");
			}
		} while (intInput == null);
		return intInput;
	}
}
