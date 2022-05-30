package com.qa.runner;

import com.qa.person.Person;

public class Runner {

	public static void main(String[] args) {
		Person personOne = new Person();
		personOne.createPerson();
		System.out.println(personOne);
	}
}