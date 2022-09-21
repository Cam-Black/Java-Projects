package com.qa.cloudacademy.sectioneight;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileOutputFun {
	public static void main(String[] args) {
		Scanner s;
		String output;
		try {
			PrintWriter pw = new PrintWriter("./src/main/resources/output.txt");
			
			pw.println("Hello There!");
			pw.println("General Kenobi!");
			pw.close();
			
			s = new Scanner(new File("./src/main/resources/output.txt"));
			while (s.hasNext()) {
				output = s.nextLine();
				System.out.println(output);
			}
		} catch (FileNotFoundException fnfe) {
			System.err.println("File not found:");
			System.err.println(fnfe.getMessage());
		}
	}
}
