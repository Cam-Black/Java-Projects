package com.qa.person;

import java.util.Scanner;

public class Person {
	private String forename;
	private String surname;
	int age;
	
	Scanner scan = new Scanner(System.in);

	public void createPerson() {

		System.out.println("Enter your age: ");
		this.age = scan.nextInt();

		scan.nextLine();

		System.out.println("Enter your forename:");
		this.forename = scan.next();

		System.out.println("Enter your surname:");
		this.surname = scan.next();
	}
	
	public String toString() {
		return "First Name: " + this.forename + ", Surname: " + this.surname + ", age: " + this.age + " years old!";
	}
}
