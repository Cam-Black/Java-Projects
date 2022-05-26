package com.qa.inheritance;

public class Runner {

	public static void main(String[] args) {
		Animals birdOne = new Animals();
		birdOne.setCanFly(false);
		System.out.println(birdOne.getCanFly());
		System.out.println(birdOne);
		Birds.makeNoise();
	}

}
