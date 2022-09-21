package com.qa.cloudacademy.sectioneight.rectangle;

public class Rectangle {
	private double length;
	private double width;
	
	public Rectangle() {
		super();
	}
	
	public Rectangle(double length, double width) {
		this();
		this.length = length;
		this.width = width;
	}
	
	public double getLength() {
		return length;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double area() {
		return length * width;
	}
	
	public double perimeter() {
		return (length + width) * 2;
	}
	
	@Override
	public String toString() {
		return "Length = " + this.getLength() + "\nWidth = " + this.getWidth() + "\nArea = " + this.area() +
				"\nPerimeter = " + perimeter();
	}
}
