package com.qa.accessmods;

public class Runner {
	public static void main(String[] args) {
		Person personOne = new Person();
		personOne.setAge(23);
		System.out.println(personOne);
		
		Person personTwo = new Person("Jeff", "Something", 25, "Builder", 'M');
		System.out.println(personTwo);
		
		personOne.setFirstName("Steven");
		System.out.println(personOne.getFirstName());
	}
}