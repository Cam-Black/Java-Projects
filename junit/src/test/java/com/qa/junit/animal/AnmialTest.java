package com.qa.junit.animal;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AnmialTest {
	final Animal ANIMAL = new Animal();
	
	@Test
	public void makeNoise() {
		Animal created = new Animal();
		assertEquals(created, ANIMAL.makeNoise());
	}
}
