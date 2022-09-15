package com.qa.cloudacademy.sectionfive;

public class StringMethodsOne {
	public static void main(String[] args) {
		String name = "Cam Black";
		String nameTwo = "Cam Black";
		String nameThree = "Nicola Tang";
		
		for (int i = 0; i < name.length(); i++) {
			System.out.print(name.charAt(i) + " ");
		}
		System.out.println();
		
		if (name.compareTo(nameThree) > 0) {
			System.out.println("name > nameThree");
		} else {
			System.out.println("name <= nameThree");
		}
	}
}
