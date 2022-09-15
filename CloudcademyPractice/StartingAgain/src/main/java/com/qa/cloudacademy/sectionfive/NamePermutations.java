package com.qa.cloudacademy.sectionfive;

import com.qa.cloudacademy.sectionthree.learningpackage.PackageLevels;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Prompt user for 5 full names.
 * Separate first and last name, storing them in separate ArrayLists.
 * Print out each first name with each last name for 25 possible combinations.
 */

public class NamePermutations {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		List<String> forenames = new ArrayList<>();
		List<String> surnames = new ArrayList<>();
		String name;
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter a person's name: ");
			name = s.nextLine();
			forenames.add(name.substring(0, name.indexOf(" ")));
			surnames.add(name.substring(name.indexOf(" ") + 1));
		}

		forenames.stream().forEach((el) -> surnames.forEach((el2) -> System.out.println(el + " " + el2)));
	}
}
