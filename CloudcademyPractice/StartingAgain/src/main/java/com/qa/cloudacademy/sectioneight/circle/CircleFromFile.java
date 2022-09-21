package com.qa.cloudacademy.sectioneight.circle;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class CircleFromFile {
	private final String inputFilePath;
	private final String outputFilePath;
	
	public CircleFromFile(String filePath, String outputFilePath) {
		super();
		this.inputFilePath = filePath;
		this.outputFilePath = outputFilePath;
	}
	
	public List<Circle> createCircles() {
		List<Circle> circles = new ArrayList<>();
		try {
			Scanner s = new Scanner(new File(inputFilePath));
			double tempR;
			while (s.hasNext()) {
				tempR = s.nextDouble();
				Circle circ = new Circle(tempR);
				circles.add(circ);
			}
		} catch (FileNotFoundException fnfe) {
			System.err.println("File not found:");
			System.err.println(fnfe.getMessage());
		} catch (InputMismatchException ime) {
			System.err.println("Not a valid number!");
		}
		return circles;
	}
	
	public void printCircles(List<Circle> circles) {
		try (PrintWriter pw = new PrintWriter(outputFilePath)) {
			circles.forEach((el) -> {
				System.out.println(el);
				pw.println(el);
				pw.println();
				System.out.println();
			});
		} catch (FileNotFoundException fnfe) {
			System.err.println("File not found:");
			System.err.println(fnfe.getMessage());
		}
	}
}
