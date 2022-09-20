package com.qa.cloudacademy.sectionseven.circle;

public class Circle {
	private double radius;
	
	public Circle() {
		super();
		this.radius = 1.0;
	}
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double circumference() {
		return (Math.PI * this.getRadius()) * 2;
	}
	
	public double area() {
		return Math.PI * Math.pow(this.getRadius(), 2);
	}
	
	public String formatResult(double result) {
		return String.format("%.2f", result);
	}
	@Override
	public String toString() {
		return "Radius = " + formatResult(this.getRadius()) + "\nCircumference = " + this.formatResult(circumference())
				+ "\nArea = " + formatResult(this.area());
	}
}
