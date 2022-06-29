package com.qa.collection.hashing;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {
	Map<Integer, String> driverRanking = new HashMap<>();
	
	public Map<Integer, String> addDriver(Integer rank, String driver) {
		driverRanking.put(rank, driver);
		return driverRanking;
	}
	
	@Override
	public String toString() {
		return "Driver Rankings: " + driverRanking;
	}
}
