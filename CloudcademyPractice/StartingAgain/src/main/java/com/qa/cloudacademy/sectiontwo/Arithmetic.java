package com.qa.cloudacademy.sectiontwo;

public class Arithmetic {
	public static void main(String[] args) {
		int a = 10;
		int b = 15;
		
		int result = a + b;
		int difference = a - b;
		int product = a * b;
		double quotient = ((double)b) / ((double)a);
		int remainder = b % a;
		
		System.out.println("result = " + result);
		System.out.println("diff = " + difference);
		System.out.println("product = " + product);
		System.out.println("quotient = " + quotient);
		System.out.println("remainder = " + remainder);
		
		product *= 2;
		System.out.println("New product = " + product);
	}
}
