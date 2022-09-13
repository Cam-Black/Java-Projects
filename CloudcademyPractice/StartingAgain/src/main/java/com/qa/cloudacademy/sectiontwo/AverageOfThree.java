package com.qa.cloudacademy.sectiontwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AverageOfThree {
	public static void main(String[] args) {
		List<Double> numbers = new ArrayList<>();
		Double avg;
		System.out.println("This app will calculate the average of all numbers passed!");
		System.out.println("Separate all numbers with a space");
		
		System.out.println("Enter numbers:");
		Scanner scan = new Scanner(System.in);
		
		String numbersAsString = scan.nextLine();
		
		avg = Arrays.stream(numbersAsString.split(" ")).mapToDouble(Double::parseDouble).average()
				.getAsDouble();
		System.out.println(avg);

//		double numOne;
//		double numTwo;
//		double numThree;
//		double avg;

//		numOne = scan.nextDouble();
//		numTwo = scan.nextDouble();
//		numThree = scan.nextDouble();
//		scan.nextLine();
//
//		avg = (numOne + numTwo + numThree) / 3;
//		System.out.println(avg);
	
	}
}
