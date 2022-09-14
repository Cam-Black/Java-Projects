package com.qa.cloudacademy.sectionfour;

public class ArrayFun {
	public static void main(String[] args) {
		int[] numArr = new int[10];
		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = i+1;
		}
		for (int nums : numArr) {
			System.out.println(nums);
		}
	}
}
