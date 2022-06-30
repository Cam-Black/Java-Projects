package com.qa.interfacesegregation;

public class Runner {

	public static void main(String[] args) {
		Dodo myDodo = new Dodo();
		Falcon myFalcon = new Falcon();
		
		myDodo.layEggs();
		System.out.println(myDodo.getNumberOfEggs());
		myDodo.goExtinct();
		System.out.println(myDodo.getCurrentLocation());
		
		myFalcon.fly();
		System.out.println(myFalcon.getCurrentLocation());
	}
}