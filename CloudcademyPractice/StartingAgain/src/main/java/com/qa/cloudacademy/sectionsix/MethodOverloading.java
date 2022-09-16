package com.qa.cloudacademy.sectionsix;

import java.util.Scanner;

public class MethodOverloading {
	public static final Scanner SCAN = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println(getResult(2, "d"));
	}
	
	
	static int getResult(int num) {
		return num + num;
	}
	
	static int getResult(int num, int numTwo) {
		return num * numTwo;
	}
	
	static int getResult(int num, String numTwo) {
		int numFromString = 0;
		boolean yOrN = true;
		while (yOrN) {
			try {
				numFromString = Integer.parseInt(numTwo);
				yOrN = false;
			} catch (NumberFormatException nfe) {
				System.err.println("Unable to convert String " + numTwo + " to integer.");
				System.out.println("Try entering a new value:");
				numTwo = SCAN.nextLine();
			}
		}
		return num + numFromString;
	}
}
