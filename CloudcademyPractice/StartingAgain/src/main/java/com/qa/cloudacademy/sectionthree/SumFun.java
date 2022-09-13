package com.qa.cloudacademy.sectionthree;

import java.util.Scanner;

public class SumFun {
	public static void main(String[] args) {
		int sum = 0;
		Scanner s = new Scanner(System.in);
		int input;
		System.out.println("Enter a positive integer number to add to the sum");
		System.out.println("or enter a negative integer number to print the sum and exit the app.");
		input = s.nextInt();
		while (input >= 0) {
			sum += input;
			System.out.println("Enter next number: ");
			input = s.nextInt();
		}
		System.out.println("Sum is: " + sum);
		System.out.println("Goodbye!");
	}
}
