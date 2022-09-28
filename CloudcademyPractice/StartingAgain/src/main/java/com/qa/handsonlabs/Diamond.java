package com.qa.handsonlabs;

import java.util.ArrayList;
import java.util.List;

public class Diamond {
	List<String> printToList(char a) {
		List<String> sb = new ArrayList<>();
		int valueOfChar = a;
		int valueOfA = Character.valueOf('A');
		
		if (valueOfA == valueOfChar) {
//			sb.add(Character.valueOf((char) valueOfChar));
			return sb;
		}
		
		for (int i = valueOfA; i <= valueOfChar; i++) {
			char letter = Character.valueOf((char) i);
			
			if (i == valueOfA) {
				sb.add(letter + "\n");
			} else {
				sb.add("" + letter + " " + letter + "\n");
			}
			
		}
		
		for (int i = valueOfChar - 1; i >= valueOfA; i--) {
			char letter = Character.valueOf((char) i);
			if (i == valueOfA) {
				sb.add(letter + "\n");
			} else {
				sb.add("" + letter + " " + letter + "\n");
			}
		}
		return sb;
	}
	
	public static void main(String[] args) {
		Diamond d = new Diamond();
		System.out.println(d.printToList('C'));
	}
}
