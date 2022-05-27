package com.qa.inheritance;

public class Runner {

	public static void main(String[] args) {

		Animal myAnimal = new Animal(false, 4);
		Bird myBird = new Bird();
		Animal myBetterBird = new Bird(true, 2, true, "Blue");
		Dog myDog = new Dog(false, 4, "Cocker Spaniel");
		Object newCat = new Cat();
		
		System.out.println(myAnimal);
		System.out.println(myBird);
		System.out.println(myBetterBird);
		System.out.println(myDog);
		
		System.out.println(((Animal)newCat).makeNoise());
		System.out.println(((Cat) newCat).animal());
		System.out.println(((Cat)newCat).makeNoise());
	}
}