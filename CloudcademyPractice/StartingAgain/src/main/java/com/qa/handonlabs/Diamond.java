package com.qa.handonlabs;

public class Diamond {
	String printToList(char a) {
		StringBuilder sb = new StringBuilder();
		int valueOfChar = a;
		int valueOfA = Character.valueOf('A');
		
		if (valueOfA == valueOfChar) {
			sb.append(Character.valueOf((char) valueOfChar));
			return sb.toString();
		}
		
		for (int i = valueOfA; i <= valueOfChar; i++) {
			char letter = Character.valueOf((char) i);
			
			if (i == valueOfA) {
				sb.append(letter + "\n");
			} else {
				sb.append("" + letter + " " + letter + "\n");
			}
			
		}
		
		for (int i = valueOfChar - 1; i >= valueOfA; i--) {
			char letter = Character.valueOf((char) i);
			if (i == valueOfA) {
				sb.append(letter + "\n");
			} else {
				sb.append("" + letter + " " + letter + "\n");
			}
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		Diamond d = new Diamond();
		System.out.println(d.printToList('C'));
	}
}
