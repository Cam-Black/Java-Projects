package com.qa.cloudacademy.sectionthree.learningpackage;

public class LearningPackage {
	private int learningPackageLevel;
	private int numOfCourses;
	private int costPerCourse;
	private final Utils UTILS;
	
	public LearningPackage() {
		super();
		UTILS = new Utils();
	}
	
	public void setLearningPackageLevelUserInput(int learningPackageLevel) {
		this.learningPackageLevel = UTILS.getInt();
	}
	
}