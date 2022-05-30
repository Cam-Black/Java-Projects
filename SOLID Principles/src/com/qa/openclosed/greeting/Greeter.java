package com.qa.openclosed.greeting;

public class Greeter {
	
	private Greeting myGreeting;
	
	public Greeter() {}
	
	public Greeter(Greeting myGreeting) {
		this.myGreeting = myGreeting;
	}
	
	public void setGreeting(Greeting myGreeting) {
		this.myGreeting = myGreeting;
	}
	
	public Greeting getGreeting() {
		return this.myGreeting;
	}
	
	public String greetMessage() {
		return this.myGreeting.message() == null || this.myGreeting.message().equals("") ?  "Hello" : this.myGreeting.message();
	}
}