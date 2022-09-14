package com.qa.cloudacademy.sectionfour;

import java.util.ArrayList;
import java.util.List;

public class ArrayListFun {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		
		names.add("John");
		names.add("Kyle");
		names.add("Matthew");
		names.add("Amanda");
		names.add("Wendy");
		
		for (String name : names) {
			System.out.println(name);
		}
	}
}
