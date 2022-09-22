package com.qa.handonlabs.advancedjavachallenges;

public class ChallengeOne {
	public static String[] fruitColors(Fruit[] fruits) {
		/**
		 * Return an array of the colors of each Fruit in the fruits array
		 * Arguments
		 * fruits - array of Fruit
		 * Examples
		 * Fruit[] fruits = new Fruit[2];
		 * fruits[0] = new Banana();
		 * fruits[1] = new Orange();
		 * String[] colors = fruitColors(fruits); // Outputs {"Yellow", "Orange"}
		 */
		
		// ====================================
		// Do not change the code before this
		
		// CODE1: Write code that will return an array of the colors
		//        of each Fruit in the fruits array
		
		String[] colours = new String[fruits.length];
		for (int i = 0; i < colours.length; i++) {
			colours[i] = fruits[i].getColor();
		}
		return colours;
		// ====================================
		// Do not change the code after this
	}
	
	public static void main(final String[] args) {
		Fruit[] fruits = new Fruit[3];
		fruits[0] = new Banana();
		fruits[1] = new Orange();
		String[] colors = fruitColors(fruits);
		// Expected output is
		// Yellow
		// Orange
		for (int i = 0; i < fruits.length; i++) {
			System.out.println(colors[i]);
		}
	}
}

abstract class Fruit {
	protected String color;
	
	public Fruit(String theColor) {
		color = theColor;
	}
	
	public String getColor() {
		return color;
	}
}

// ====================================
// Do not change the code before this

// CODE2: Complete implementations of classes Banana and Orange
//        that are subclasses of Fruit. Banana has "Yellow" color and
//        Orange has "Orange" color.

class Banana extends Fruit {
	public Banana() {
		super("Yellow");
	}
}

class Orange extends Fruit {
	public Orange() {
		super("Orange");
	}
}

// ====================================
// Do not change the code after this
