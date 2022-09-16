package com.qa.cloudacademy.sectionsix;

import java.util.Scanner;

public class MethodOverloading {
	public static final Scanner SCAN = new Scanner(System.in);
	
	public static void main(String[] args) {
//		System.out.println(getResult(2, "5"));
//		System.out.println(getResult("Hello", "World"));
		
		countUp(1, 1000);
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
	
	static String getResult(String arg1, String arg2) {
		return arg1 + " " + arg2;
	}
	
	static void countUp(int start, int end) {
		int swap;
		if (start > end) {
			swap = start;
			start = end;
			end = swap;
		}
		for (int i = start; i <= end; i++) {
			System.out.println(i);
		}
	}
}
