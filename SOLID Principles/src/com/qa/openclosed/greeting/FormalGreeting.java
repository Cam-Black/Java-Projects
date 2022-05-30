package com.qa.openclosed.greeting;

public class FormalGreeting implements Greeting{
	
	private String greeting = null;
	
	public void setGreet(String greeting) {
		this.greeting = greeting;
	}
	
	public String getGreeting() {
		return this.greeting;
	}
	
	@Override
	public String message() {
		return this.getGreeting() != null ? this.getGreeting() : "Hello";
	}
}