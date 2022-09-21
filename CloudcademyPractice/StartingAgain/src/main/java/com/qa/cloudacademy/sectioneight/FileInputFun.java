package com.qa.cloudacademy.sectioneight;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileInputFun {
	public static void main(String[] args) {
		Scanner s;
		int i = 1;
		
		try {
			s = new Scanner(new File("./src/main/resources/file.txt"));
			int input = 0;
			while (s.hasNext()) {
				input += s.nextInt();
			}
			System.out.println("Sum of all numbers in file = " + input);
			
		} catch (FileNotFoundException fnfe) {
			System.err.println("Can't find file:");
			System.err.println(fnfe.getMessage());
		} catch (InputMismatchException ime) {
			System.err.println("Not a valid Integer!");
		}
	}
}
