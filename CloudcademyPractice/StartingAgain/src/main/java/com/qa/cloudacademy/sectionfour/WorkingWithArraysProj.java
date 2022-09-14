package com.qa.cloudacademy.sectionfour;

import java.util.Scanner;

//Prompt User for input for 5 integers
//Store each integer in a regular, built in array
//print each element multiplied by 2

public class WorkingWithArraysProj {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); //Create new scanner obj for user input
		Integer[] nums = new Integer[5];

		for(int i = 0; i < nums.length; i++) {
			System.out.print("Enter an integer:\t");
			nums[i] = s.nextInt();
			s.nextLine();
		}
		for (int num : nums) {
			System.out.println(num + " * 2" + " = " + (num * 2));
		}
		
	}
}
