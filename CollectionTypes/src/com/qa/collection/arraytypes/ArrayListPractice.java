package com.qa.collection.arraytypes;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

public class ArrayListPractice {
	ArrayList<Integer> nums = new ArrayList<Integer>();

	public ArrayList<Integer> addNums(Integer numToAdd) {
		nums.add(numToAdd);
		return nums;
	}

	@Override
	public String toString() {
		return "Numbers: " + nums;
	}
}