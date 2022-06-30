package com.qa.tddpractice.greeting;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class GreetingTest {
	public final Greeting GREETING = new Greeting();
	
	@Test
	public void testGreet() {
		assertEquals(GREETING.greet(), "Hello");
	}
}