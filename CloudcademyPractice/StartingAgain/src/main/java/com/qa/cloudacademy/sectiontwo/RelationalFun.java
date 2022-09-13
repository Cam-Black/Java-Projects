package com.qa.cloudacademy.sectiontwo;

public class RelationalFun {
	public static void main(String[] args) {
		boolean myBool = true;
		boolean yourBool = false;
		int myAge = 37;
		int yourAge = 20;
		int bobsAge = 20;
		int currentAge = 24;
		
		System.out.println("myBool = " + myBool);
		System.out.println("yourBool = " + yourBool);
		
		System.out.println("myAge > yourAge?: " + (myAge > yourAge));
		System.out.println("yourAge > bobsAge>: " + (yourAge > bobsAge));
		System.out.println("yourAge == bobsAge?: " + (yourAge == bobsAge));
		System.out.println("myAge >= 21?: " + (myAge >= 21));
	}
}