package com.qa.cloudacademy.sectiontwo;

import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		String name;
		String city;
		double myNum;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What is your name?");
		name = scan.nextLine();
		
		System.out.println("Enter a number: ");
		myNum = scan.nextDouble();
//		scan.nextLine();
		myNum *= 2;
		System.out.println("Your number doubled: " + myNum);
		
		System.out.println("What city are you from?");
		city = scan.nextLine();
		
		System.out.println("Hello " + name);
		System.out.println("You are from: " + city);
	}
}