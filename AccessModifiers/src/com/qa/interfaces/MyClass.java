package com.qa.interfaces;

public class MyClass implements InterfaceOne, InterfaceTwo {
	public String name() {
		return "My Name is John Smith";
	}
	public void makeItRain() {
		System.out.println("It is now raining!");
	}
}
