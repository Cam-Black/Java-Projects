package com.qa.handonlabs;

import java.util.ArrayList;
import java.util.List;

public class Diamond {
	public List<String> printToList(char a) {
		List<String> diamondArr = new ArrayList<>();
		int counter;
		switch (a) {
			case 'A':
				counter = 1;
				break;
			case 'B':
				counter = 2;
				break;
			case 'Z':
				counter = 26;
				break;
			default:
				counter = 0;
		}
		for (Integer i = 0; i < counter; i++) {
			String space = " ";
			diamondArr.add(space + "A");
		}
		return diamondArr;
	}
}
