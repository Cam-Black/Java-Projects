package com.qa.interfaces;

public class Runner {

	public static void main(String[] args) {
		MyClass newObj = new MyClass();
		
		System.out.println(newObj.name());
		newObj.makeItRain();
	}

}
