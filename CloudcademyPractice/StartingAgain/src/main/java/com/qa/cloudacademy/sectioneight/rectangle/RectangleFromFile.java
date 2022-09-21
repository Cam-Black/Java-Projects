package com.qa.cloudacademy.sectioneight.rectangle;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class RectangleFromFile {
	private final String filePath;
	
	public RectangleFromFile(String filePath) {
		super();
		this.filePath = filePath;
	}
	
	public List<Rectangle> createRectangles() {
		List<Rectangle> rectangles = new ArrayList<>();
		try {
			Scanner s = new Scanner(new File(this.filePath));
			double tempLength;
			double tempWidth;
			while (s.hasNext()) {
				tempLength = s.nextDouble();
				tempWidth = s.nextDouble();
				Rectangle rec = new Rectangle(tempLength, tempWidth);
				rectangles.add(rec);
			}
		} catch (FileNotFoundException | InputMismatchException e) {
			System.err.println(e.getMessage());
		}
		return rectangles;
	}
	
	public void printRectangles(List<Rectangle> recs) {
		recs.forEach((el) -> System.out.println(el + "\n"));
	}
}
