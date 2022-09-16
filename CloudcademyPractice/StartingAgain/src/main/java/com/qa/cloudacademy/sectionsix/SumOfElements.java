package com.qa.cloudacademy.sectionsix;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SumOfElements {
	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<>();
		createAndFillList(5);
		printList(numList);
		System.out.println();
		System.out.println(sumElements(numList));
	}
	
	public static int sumElements(List<Integer> numList) {
		return numList.stream().reduce(Integer::sum).get();
	}
	
	public static List<Integer> createAndFillList(int listSize) {
		List<Integer> nums = new ArrayList<>();
		Random rand = new Random();
		for (int i = 0; i < listSize; i++) {
			nums.add(rand.nextInt(100));
		}
		return nums;
	}
	
	public static void printList(List<Integer> numList) {
		numList.forEach(System.out::println);
	}
}
