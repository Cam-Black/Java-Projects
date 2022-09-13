package com.qa;

import java.util.Scanner;

public class Utils {
	private final Scanner SCAN;
	
	public Utils() {
		super();
		SCAN = new Scanner(System.in);
	}
	
	public String getString() {
		return this.SCAN.nextLine();
	}
}
