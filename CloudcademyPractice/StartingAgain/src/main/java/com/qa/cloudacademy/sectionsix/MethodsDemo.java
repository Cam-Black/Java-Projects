package com.qa.cloudacademy.sectionsix;

public class MethodsDemo {
	static double squareADouble(double num) {
		return Math.pow(num, 2);
	}
	
	public static void main(String[] args) {
		System.out.println(MethodsDemo.squareADouble(10));
	}
}
