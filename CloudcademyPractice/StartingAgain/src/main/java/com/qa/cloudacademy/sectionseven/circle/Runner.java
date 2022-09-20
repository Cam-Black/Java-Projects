package com.qa.cloudacademy.sectionseven.circle;

public class Runner {
	public static void main(String[] args) {
		Circle myCircle = new Circle();
		Circle yourCircle = new Circle(3);
		
		System.out.println(myCircle);
		System.out.println();
		System.out.println(yourCircle);
	}
}
