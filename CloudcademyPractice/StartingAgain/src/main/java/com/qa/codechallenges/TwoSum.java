package com.qa.codechallenges;

import java.util.*;

public class TwoSum {
	//Given an array of integers nums and an integer target,
	// return indices of the two numbers such that they add up to target.
	//You may assume that each input would have exactly one solution, and you may not use the same element twice.
	//You can return the answer in any order.
	
	
	static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> numsMapped = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			
			if (numsMapped.containsKey(complement)) {
				return new int[] {numsMapped.get(complement), i};
			}
			numsMapped.put(nums[i], i);
		} throw new IllegalArgumentException("No matches found");
	}
	
	public static void main(String[] args) {
		int[] numArr = {2, 2, 3, 3};
		int[] solutionArr = twoSum(numArr,6);
		
		for (int num : solutionArr) {
			System.out.println(solutionArr[num]);
		}
	}
}
