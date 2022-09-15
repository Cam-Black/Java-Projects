package com.qa.handonlabs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class PangramChecker {
	
	public boolean isPangram(String input) {
		List<String> chars = new ArrayList<>();
		String specialCharsRemoved = input.replaceAll("[^a-zA-Z]", "");
		for (int i = 0; i < specialCharsRemoved.length(); i++) {
			chars.add(specialCharsRemoved.substring(i, i + 1).toLowerCase());
		}
		Stream<String> distinctChars = chars.stream().distinct();
		return distinctChars.count() == 26;
	}
	
	
	public static void main(String[] args) {
		PangramChecker pc = new PangramChecker();
		System.out.println(pc.isPangram("\"Five quacking Zephyrs jolt my wax bed.\""));
	}
}