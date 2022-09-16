package com.qa.cloudacademy.sectionsix;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SumOfElements {
	public static void main(String[] args) {
		List numList = new ArrayList<>();
		fillList(numList, 5);
		printList(numList);
		System.out.println();
		System.out.println(sumElements(numList));
	}
	
	public static int sumElements(List<Integer> numList) {
		return numList.stream().reduce((acc, next) -> acc + next).get();
	}
	
	public static List<Integer> fillList(List<Integer> numList, int listSize) {
		Random rand = new Random();
		for (int i = 0; i < listSize; i++) {
			numList.add(rand.nextInt(100));
		}
		return numList;
	}
	
	public static void printList(List<Integer> numList) {
		numList.forEach(System.out::println);
	}
}
