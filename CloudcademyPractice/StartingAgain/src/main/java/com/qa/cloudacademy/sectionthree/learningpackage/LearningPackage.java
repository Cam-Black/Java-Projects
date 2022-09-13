package com.qa.cloudacademy.sectionthree.learningpackage;

public class LearningPackage {
	private int learningPackageLevel;
	private double packageCost;
	private int numOfCourses;
	private double costPerAdditionalCourse;
	private int additionalCourses;
	private double totalCost;
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
	
	public double getCostPerAdditionalCourse() {
		return costPerAdditionalCourse;
	}
	
	public void setCostPerAdditionalCourse(double costPerAdditionalCourse) {
		this.costPerAdditionalCourse = costPerAdditionalCourse;
	}
	
	public int getAdditionalCourses() {
		return additionalCourses;
	}
	
	public void setAdditionalCourses(int additionalCourses) {
		this.additionalCourses = additionalCourses;
	}
	
	public double getTotalCost() {
		return totalCost;
	}
	
	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}
	
	public LearningPackage createPackage() {
		System.out.println("Please enter the number of the package you would like to select");
		setLearningPackageLevel(UTILS.getInt());
		switch (this.learningPackageLevel) {
			case 1 -> {
				this.setPackageCost(PackageLevels.PACKAGE_ONE.getPackagePrice());
				this.setNumOfCourses(PackageLevels.PACKAGE_ONE.getNumOfIncludedCourses());
				this.setCostPerAdditionalCourse(PackageLevels.PACKAGE_ONE.getAdditionalCourseCost());
				this.addAdditionalCourses();
			}
			case 2 -> {
				this.setPackageCost(PackageLevels.PACKAGE_TWO.getPackagePrice());
				this.setNumOfCourses(PackageLevels.PACKAGE_TWO.getNumOfIncludedCourses());
				this.setCostPerAdditionalCourse(PackageLevels.PACKAGE_TWO.getAdditionalCourseCost());
				this.addAdditionalCourses();
			}
			case 3 -> {
				this.setPackageCost(PackageLevels.PACKAGE_THREE.getPackagePrice());
				this.setNumOfCourses(PackageLevels.PACKAGE_THREE.getNumOfIncludedCourses());
				this.setCostPerAdditionalCourse(PackageLevels.PACKAGE_THREE.getAdditionalCourseCost());
				this.addAdditionalCourses();
			}
			default -> System.out.println("This is not a valid package level!");
		}
		return this;
	}
	
	public void addAdditionalCourses() {
		String input;
		System.out.println("Would you like to add any additional courses? Y/N");
		input = UTILS.getString();
		if (input.equalsIgnoreCase("y")) {
			System.out.println("How many more courses would you like to add?");
			this.setAdditionalCourses(UTILS.getInt());
			this.setTotalCost(this.getPackageCost() + (getAdditionalCourses() * this.getCostPerAdditionalCourse()));
		} else {
			this.setTotalCost(this.getPackageCost());
		}
	}
	
	@Override
	public String toString() {
		return "Package Level: " + this.getLearningPackageLevel() + "\nPackage Cost: $" + String.format("%.2f",
				this.getPackageCost()) + "\nNumber of " + "included courses: " + this.getNumOfCourses() + "\nCost per" +
				" additional course: $" + String.format("%.2f", this.getCostPerAdditionalCourse()) + "\nNumber of " +
				"additional courses added: " + this.getAdditionalCourses() + "\nTotal " +
				"Cost " +
				"for package and courses: $" + String.format("%.2f", this.getTotalCost());
	}
}