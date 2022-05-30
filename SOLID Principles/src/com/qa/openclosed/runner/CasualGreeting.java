package com.qa.openclosed.runner;

import com.qa.openclosed.greeting.Greeting;

public class CasualGreeting implements Greeting{
	
	@Override
	public String message() {
		return "Sup m8?";
	}
	
}
