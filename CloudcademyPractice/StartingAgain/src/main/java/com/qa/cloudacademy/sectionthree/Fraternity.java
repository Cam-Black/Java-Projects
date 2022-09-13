package com.qa.cloudacademy.sectionthree;

import java.util.Scanner;

public class Fraternity {
	public static void main(String[] args) {
		String gender;
		int age;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter your gender: M/F");
		gender = s.next().toUpperCase();
		s.nextLine();
		System.out.println("Enter your age: ");
		age = s.nextInt();
		
		if (age >= 19 && gender.equals("M")) {
			System.out.println("Welcome to the fraternity");
		} else {
			System.out.println("You are not eligible to join, good day!");
		}
	}
}
