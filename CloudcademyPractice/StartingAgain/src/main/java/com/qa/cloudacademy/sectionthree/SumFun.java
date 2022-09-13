package com.qa.cloudacademy.sectionthree;

import java.util.Scanner;

public class SumFun {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int sum = 0;
		int input;
		
		System.out.println("Enter a positive integer number to add to the sum");
		System.out.println("Enter a negative integer number to print the sum and exit the app.");
		input = s.nextInt();
		
		while (input >= 0) {
			sum += input;
			System.out.println("sum = " + sum);
			System.out.println();
			System.out.println("Enter a positive integer number to add to the sum");
			System.out.println("Enter a negative integer number to print the sum and exit the app.");
			input = s.nextInt();
		}
		
		System.out.println("Final sum = " + sum);
		System.out.println("Goodbye!");
	}
}
