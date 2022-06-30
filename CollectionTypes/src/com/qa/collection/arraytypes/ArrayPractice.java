package com.qa.collection.arraytypes;

public class ArrayPractice {
	String[] capitalCities = {"London", "Beijing", "Paris"};
	
	@Override
	public String toString() {
		String listOfCities = "List of Capital Cities: [";
		for (String capitalCity : capitalCities) {
			listOfCities += capitalCity + ", ";
		}
		return listOfCities + "]";
	}
}
