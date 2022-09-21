package com.qa.cloudacademy.sectioneight.circle;

import java.util.List;

public class Runner {
	public static void main(String[] args) {
		CircleFromFile cff = new CircleFromFile("circle_data.txt", "circle_output.txt");
		List<Circle> circles = cff.createCircles();
		cff.printCircles(circles);
	}
}
