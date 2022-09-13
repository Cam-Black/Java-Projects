package com.qa.cloudacademy.sectionthree.learningpackage;

public enum PackageLevels {
	PACKAGE_ONE(2, 10.00, 6.00),
	PACKAGE_TWO(4, 12.00, 4),
	PACKAGE_THREE(6, 15.00, 3.00);
	
	private final int numOfIncludedCourses;
	private final double coursePrice;
	private final double additionalCourseCost;
	
	PackageLevels(int numOfIncludedCourses, double coursePrice, double additionalCourseCost) {
		this.numOfIncludedCourses = numOfIncludedCourses;
		this.coursePrice = coursePrice;
		this.additionalCourseCost = additionalCourseCost;
	}
}
