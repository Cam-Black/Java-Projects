package com.qa.accessmods;

public class Person {
	//Attributes
	private String firstName = null;
	private String lastName = null;
	private int age = 0;
	private String occupation = null;
	private char gender = '\u0000';
	
	//Constructors
	public Person() {}
	
	public Person(String firstName, String lastName, int age, String occupation, char gender) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.occupation = occupation;
		this.gender = gender;
	}
	
	public Person(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	//Setters
	public void  setFirstName(String newFirstName) {
		this.firstName = newFirstName;
	}
	
	public void setLastName(String newLastName) {
		this.lastName = newLastName;
	}

	public void setAge(int newAge) {
		this.age = newAge;
	}

	public void setOccupation(String newOccupation) {
		this.occupation = newOccupation;
	}

	public void setGender(char newGender) {
		this.gender = newGender;
	}
	
	//Getters
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public char getGender() {
		return this.gender;
	}
	
	public String getOccupation() {
		return this.occupation;
	}
	
	//Override toString Method
	@Override
	public String toString() {
		return "Person [firstName = " + firstName + ", lastName = " + lastName + ", age = " + age + ", occupation = "
				+ occupation + ", gender = " + gender + "]";
	}	
}