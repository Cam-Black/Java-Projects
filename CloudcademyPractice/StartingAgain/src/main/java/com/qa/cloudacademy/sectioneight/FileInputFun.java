package com.qa.cloudacademy.sectioneight;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileInputFun {
	public static void main(String[] args) {
		Scanner s;
		
		try {
			s = new Scanner(new File("./src/main/resources/file.txt"));
			int input;
			
			while (s.hasNext()) {
				input = s.nextInt();
				System.out.println(input);
			}
		} catch (FileNotFoundException fnfe) {
			System.err.println("Can't find file:");
			System.err.println(fnfe.getMessage());
		}
	}
}
