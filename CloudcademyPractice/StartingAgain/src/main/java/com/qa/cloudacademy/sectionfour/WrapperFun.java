package com.qa.cloudacademy.sectionfour;

import java.util.ArrayList;
import java.util.List;

public class WrapperFun {
	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<>();
		myList.add(10);
		myList.add(20);
		
		for (int i = 0; i < myList.size(); i++) {
			System.out.println(myList.get(i)); //Autoboxing, converting int primitives to Integer Objects
		}
		
		String someValue = "450";
		int numericVal = Integer.parseInt(someValue);
		System.out.println(numericVal);
		
		String pi = "3.14159";
		double piAsNumeric = Double.parseDouble(pi); //Using Wrapper class static method to convert String to a
		                                             //double primitive
		System.out.println(piAsNumeric);
		
		Integer number = 10; //Auto-Boxing, turning primitive value to Object
		int unboxedNumber = number; //Auto-Unboxing, converting the Object of number into its primitive.
		System.out.println(number.getClass());
		System.out.println(unboxedNumber);
	}
}
