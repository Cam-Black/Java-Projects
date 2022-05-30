package com.qa.openclosed.runner;

import com.qa.openclosed.greeting.*;
public class GreetRunner {

	public static void main(String[] args) {
		FormalGreeting fg = new FormalGreeting();
		CasualGreeting cg = new CasualGreeting();
		
		Greeter myGreeterOne = new Greeter(fg);
		Greeter myGreeterTwo = new Greeter(cg);
		
		fg.setGreet("Welcome, Sir!");
		System.out.println(myGreeterOne.greetMessage());
		System.out.println(myGreeterTwo.greetMessage());
		fg.setGreet("Good day, Sir");
		System.out.println(myGreeterOne.greetMessage());
	}
}