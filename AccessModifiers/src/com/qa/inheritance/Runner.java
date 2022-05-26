package com.qa.inheritance;

public class Runner {

	public static void main(String[] args) {

		//Animal is now an abstract class, cannot instantiate Object from Animal
		//Animal myAnimal = new Animal(false, 4);
		Bird myBird = new Bird();
		Animal myBetterBird = new Bird(true, 2, true, "Blue");
		Dog myDog = new Dog(false, 4, "Cocker Spaniel");
		Object newCat = new Cat();
		
		System.out.println(myBird.makeNoise());
		System.out.println(myBetterBird.makeNoise());
		System.out.println(myDog.makeNoise());
		System.out.println(((Cat)newCat).makeNoise());
	}
}