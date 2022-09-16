package com.qa.cloudacademy.sectionsix;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SumOfElements {
	public static void main(String[] args) {
		SumOfElements soe = new SumOfElements();
		List<Integer> numList = soe.createAndFillList(5);
		soe.printList(numList);
		System.out.println();
		System.out.println(soe.sumElements(numList));
	}
	
	public int sumElements(List<Integer> numList) {
		return numList.stream().reduce(Integer::sum).get();
	}
	
	public List<Integer> createAndFillList(int listSize) {
		List<Integer> nums = new ArrayList<>();
		Random rand = new Random();
		for (int i = 0; i < listSize; i++) {
			nums.add(rand.nextInt(100));
		}
		return nums;
	}
	
	public void printList(List<Integer> numList) {
		numList.forEach(System.out::println);
	}
}
