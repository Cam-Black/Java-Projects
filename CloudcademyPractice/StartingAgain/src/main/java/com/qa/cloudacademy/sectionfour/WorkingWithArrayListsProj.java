package com.qa.cloudacademy.sectionfour;

import java.util.*;

public class WorkingWithArrayListsProj {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		List<Double> nums = new ArrayList<>();
		double userNum;
		do {
			System.out.println("Enter a negative integer to exit");
			System.out.println("Enter a positive integer to add it to the list");
			userNum = s.nextDouble();
			if (userNum >= 0) {
				nums.add(userNum);
			}
		} while (userNum >= 0);
		
		//Using a for-loop to reverse the order of the array list and print to screen
//		for (int i = nums.size() - 1; i >= 0; i--) {
//			System.out.println(nums.get(i));
//		}
		//Reverse and print order using a stream.
		nums.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
	}
}
