package com.qa.cloudacademy.sectionthree.learningpackage;

public enum PackageLevels {
	PACKAGE_ONE(2, 10.00, 6.00),
	PACKAGE_TWO(4, 12.00, 4),
	PACKAGE_THREE(6, 15.00, 3.00);
	
	private final int numOfIncludedCourses;
	private final double packagePrice;
	private final double additionalCourseCost;
	
	PackageLevels(int numOfIncludedCourses, double packagePrice, double additionalCourseCost) {
		this.numOfIncludedCourses = numOfIncludedCourses;
		this.packagePrice = packagePrice;
		this.additionalCourseCost = additionalCourseCost;
	}
	
	public String packageInfo() {
		return this.name() + "[Number of Courses included: " + this.numOfIncludedCourses + ", Package price: $" +
				String.format("%.2f", this.packagePrice) + ", Additional course cost: $" +
				String.format("%.2f", this.additionalCourseCost);
	}
	
	public static void printPackages() {
		for (PackageLevels packageLevels : PackageLevels.values()) {
			System.out.println(packageLevels.packageInfo());
		}
	}
	
	public int getNumOfIncludedCourses() {
		return this.numOfIncludedCourses;
	}
}
