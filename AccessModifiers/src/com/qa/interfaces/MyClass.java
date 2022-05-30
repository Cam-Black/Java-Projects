package com.qa.interfaces;
import com.qa.inheritance.BetterAnimal;

public class MyClass extends MyAbstractClass implements BetterAnimal, InterfaceTwo {
	public String forename() {
		return "John";
	}
	
	public String surname() {
		return "Smith";
	}
	public void makeItRain() {
		System.out.println("It is now raining!");
	}
	
	public void makeItSunny() {
		System.out.println("It is now Sunny");
	}
	public String animal() {
		return "I am Human";
	}
}
