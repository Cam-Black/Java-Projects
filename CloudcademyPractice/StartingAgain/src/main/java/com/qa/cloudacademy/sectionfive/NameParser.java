package com.qa.cloudacademy.sectionfive;

import java.util.Scanner;

public class NameParser {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String name;
		String firstName;
		String lastName;
		
		System.out.println("What is your name?");
		name = s.nextLine();
		
		firstName = name.substring(0, name.indexOf(" "));
		lastName = name.substring(name.indexOf(" "));
		
		System.out.println("First name: " + firstName.toUpperCase());
		System.out.println("Last name: " + lastName.toLowerCase());
	}
	
	
}
