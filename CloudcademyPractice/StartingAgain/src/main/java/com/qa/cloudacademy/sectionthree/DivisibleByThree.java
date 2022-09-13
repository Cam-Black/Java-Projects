package com.qa.cloudacademy.sectionthree;

import java.util.Scanner;

public class DivisibleByThree {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int userNum;
		
		System.out.print("Enter a number to see if it is divisible by 3: ");
		userNum = s.nextInt();
		
		if (userNum % 3 == 0) {
			System.out.println(userNum + " is divisible by 3");
		} else {
			System.out.println(userNum + " is not divisible by 3");
		}
	}
}
