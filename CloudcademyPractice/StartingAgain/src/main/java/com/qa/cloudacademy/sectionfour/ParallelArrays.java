package com.qa.cloudacademy.sectionfour;

import com.qa.cloudacademy.sectionthree.learningpackage.Utils;

import java.util.*;

/**
 * Obtain the name and ages of 5 people,
 * storing each in a separate array.
 * The same index of both arrays corresponds to the same person.
 * Print the names and ages to the console to in the format of NAME is AGE years old
 */

public class ParallelArrays {
	public static void main(String[] args) {
		List<String> names = new LinkedList<>();
		List<Integer> age = new ArrayList<>();
		Scanner s = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			System.out.print("Enter a name:\t");
			names.add(s.nextLine());
			System.out.print("Enter an age:\t");
			age.add(s.nextInt());
			s.nextLine();
			System.out.println();
		}
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i) + " is " + age.get(i) + " years old.");
		}
	}
}
