package com.qa.handonlabs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*

This exercise doesn't come with any starter implementation.
This is so that you get to practice creating classes and methods
which is an important part of programming in Java.

*/
public class Bob {
	public static String hey(String message) {
		String regex = "[0-9]";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(message);
		String numsReplaced = m.replaceAll("");

		String removeWhiteSpace = numsReplaced.trim();
		System.out.println(removeWhiteSpace);
		
		if (removeWhiteSpace.isEmpty()) {
			return "Fine. Be that way!";
		} else if (removeWhiteSpace.equals(removeWhiteSpace.toUpperCase()) && removeWhiteSpace.endsWith("?")) {
			return "Calm down, I know what I'm doing!";
		} else if (removeWhiteSpace.endsWith("?")) {
			return "Sure.";
		} else if (removeWhiteSpace.equals(removeWhiteSpace.toUpperCase())) {
			return "Whoa, chill out!";
		} else {
			return "Whatever.";
		}
	}
	
	public static void main(String[] args) {
		System.out.println(Bob.hey("   4?    "));
	}
}
