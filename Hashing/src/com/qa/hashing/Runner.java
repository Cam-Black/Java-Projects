package com.qa.hashing;

import java.util.HashMap;
import java.util.Map;

public class Runner {

	public static void main(String[] args) {

		Map<String, String> capitalCities = new HashMap<>();
		capitalCities.put("Abb", "1");
		capitalCities.put("London", "England");
		capitalCities.put("Birmingham", "England");
		capitalCities.put("london", "England");
		System.out.println(capitalCities);
	}

}
