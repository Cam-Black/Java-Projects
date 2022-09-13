package com.qa.cloudacademy.sectionthree.learningpackage;

public class Runner {
	public static void main(String[] args) {
		LearningPackage myPackage = new LearningPackage();
		PackageLevels.printPackages();
		System.out.println();
		myPackage.createPackage();
		System.out.println(myPackage);
	}
}
