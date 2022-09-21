package com.qa.cloudacademy.sectioneight.rectangle;

import java.util.List;

public class Runner {
	public static void main(String[] args) {
		RectangleFromFile rff = new RectangleFromFile("rectangle_data.txt");
		List<Rectangle> recs = rff.createRectangles();
		rff.printRectangles(recs);
	}
}
