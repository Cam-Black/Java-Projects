package com.qa.openclosed.runner;

import com.qa.openclosed.greeting.FormalGreeting;
import com.qa.openclosed.greeting.Greeter;

public class GreetRunner {

	public static void main(String[] args) {
		FormalGreeting myFormalGreeting = new FormalGreeting();
		CasualGreeting myCasualGreeting = new CasualGreeting();
		Greeter myGreeter = new Greeter();
//		myCasualGreeting = null;
		System.out.println(myGreeter.greetMessage(myFormalGreeting));
		System.out.println(myGreeter.greetMessage(myCasualGreeting));
	}
}