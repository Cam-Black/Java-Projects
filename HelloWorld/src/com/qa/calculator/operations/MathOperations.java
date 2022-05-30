package com.qa.calculator.operations;

import java.util.Scanner;

public class MathOperations {
	private double numOne;
	private double numTwo;
	private Scanner s = new Scanner(System.in);
	
	private void setNumOne() {
		System.out.println("First Number:");
		numOne = s.nextDouble();
	}

	private void setNumTwo() {
		System.out.println("Second Number:");
		this.numTwo = s.nextDouble();
	}

	public void calculate() {
		setNumOne();
		setNumTwo();
		String operator;

		System.out.println("Choose operator: +, -, *, /");
		operator = s.next();

		switch (operator) {
		case "+":
			System.out.println(numOne + " + " + numTwo + " = " + (double) (Math.round((numOne + numTwo)*100))/100);
			break;
		case "-":
			System.out.println(numOne + " - " + numTwo + " = " + (double) (Math.round((numOne - numTwo)*100))/100);
			break;
		case "*" :
			System.out.println(numOne + " x " + numTwo + " = " + (double) (Math.round((numOne * numTwo)*100))/100);
			break;
		case "/" :
			System.out.println(numOne + " / " + numTwo + " = " + (double) (Math.round((numOne / numTwo)*100))/100);
			break;
		}
	}
}
