package com.qa.cloudacademy.sectionthree.learningpackage;

public class LearningPackage {
	private int learningPackageLevel;
	private double packageCost;
	private int numOfCourses;
	private double costPerCourse;
	private final Utils UTILS;
	
	public LearningPackage() {
		super();
		UTILS = new Utils();
	}
	
	public int getLearningPackageLevel() {
		return learningPackageLevel;
	}
	
	public void setLearningPackageLevel(int learningPackageLevel) {
		this.learningPackageLevel = learningPackageLevel;
	}
	
	public double getPackageCost() {
		return packageCost;
	}
	
	public void setPackageCost(double packageCost) {
		this.packageCost = packageCost;
	}
	
	public int getNumOfCourses() {
		return numOfCourses;
	}
	
	public void setNumOfCourses(int numOfCourses) {
		this.numOfCourses = numOfCourses;
	}
	
	public double getCostPerCourse() {
		return costPerCourse;
	}
	
	public void setCostPerCourse(double costPerCourse) {
		this.costPerCourse = costPerCourse;
	}
	
	public void setLearningPackageLevelUserInput() {
		System.out.println("Please enter the number of the package you would like to select");
		setLearningPackageLevel(UTILS.getInt());
		switch (this.learningPackageLevel) {
			case 1:
				this.setPackageCost(PackageLevels.PACKAGE_ONE.getPackagePrice());
				this.setNumOfCourses(PackageLevels.PACKAGE_ONE.getNumOfIncludedCourses());
				this.setCostPerCourse(PackageLevels.PACKAGE_ONE.getAdditionalCourseCost());
				break;
				
			case 2:
				this.setPackageCost(PackageLevels.PACKAGE_TWO.getPackagePrice());
				this.setNumOfCourses(PackageLevels.PACKAGE_TWO.getNumOfIncludedCourses());
				this.setCostPerCourse(PackageLevels.PACKAGE_TWO.getAdditionalCourseCost());
				break;
				
			case 3:
				this.setPackageCost(PackageLevels.PACKAGE_THREE.getPackagePrice());
				this.setNumOfCourses(PackageLevels.PACKAGE_THREE.getNumOfIncludedCourses());
				this.setCostPerCourse(PackageLevels.PACKAGE_THREE.getAdditionalCourseCost());
				break;
				
			default:
				System.out.println("This is not a valid package level!");
				break;
		}
	}
	
	@Override
	public String toString() {
		return "Package Level: " + this.getLearningPackageLevel() + "\nPackage Cost: " + this.getPackageCost() +
				"\nNumber of " + "included courses: " + this.getNumOfCourses() + "\nCost per additional cours: " +
				this.getCostPerCourse() + "]";
	}
}