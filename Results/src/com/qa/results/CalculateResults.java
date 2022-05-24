package com.qa.results;

public class CalculateResults {
    
    //Private variables to be used for calculations
    private String name;
    private int physicsExamScore;
    private int chemistryExamScore;
    private int biologyExamScore;
    private int physicsExamTotalMarks = 150;
    private int chemistryExamTotalMarks = 150;
    private int biologyExamTotalMarks = 150;
    private double total;
    private double percentage;
    
    //Constructor to create a pool of a result for a user
    public CalculateResults(String name, int physicsScore, int chemistryScore, int biologyScore) {
        this.name = name;
        this.physicsExamScore = physicsScore;
        this.chemistryExamScore = chemistryScore;
        this.biologyExamScore = biologyScore;
    }
    
    //Add an 's to the end of a user's name if they don't already have one
    private String addApostrophe() {
        String apostropheName = this.name;

        if (!apostropheName.substring(apostropheName.length() - 1 ).equals("'"))  {
            return apostropheName += "'s";
        }
        
        return apostropheName += "s";
    }   

    //Return the marks out of x for each Science Exam
    private String biologyResults() {
        return "Biology: " + this.biologyExamScore + " out of " + this.biologyExamTotalMarks;
    }

    private String chemistryResults() {
        return "Chemistry: " + this.chemistryExamScore + " out of " + this.chemistryExamTotalMarks;
    }
    
    private String physicsResults() {
        return "Physics: " + this.physicsExamScore + " out of " + this.physicsExamTotalMarks;
    }
    
    //Round results to 2 Decimal Places
    private double roundToTwoDecimalPlaces(double num) {
        return num = Math.floor(num * 100) / 100;
    }

    //Calculates the overall percentage of the results
    private double totalPercentage() {
        this.total = biologyExamScore + chemistryExamScore + physicsExamScore;
        double totalMarks = biologyExamTotalMarks + chemistryExamTotalMarks + physicsExamTotalMarks;
        this.percentage = (total * 100) / totalMarks;
        return this.roundToTwoDecimalPlaces(this.percentage);
    }

    //Calculate percentage of the exam results for each Science exam
    private double calculateBiologyPercentage() {
        double bioPercentage = (biologyExamScore * 100.0) / biologyExamTotalMarks;
        return roundToTwoDecimalPlaces(bioPercentage);
    }

    private double calculateChemistryPercentage() {
        double chemPercentage = (chemistryExamScore * 100.0) / chemistryExamTotalMarks;
        return this.roundToTwoDecimalPlaces(chemPercentage);
    }

    private double calculatePhysicsPercentage() {
        double physicsPercentage = (physicsExamScore * 100.0) / physicsExamTotalMarks;
        return this.roundToTwoDecimalPlaces(physicsPercentage);
    }

    //Check if user failed any of the exams
    private boolean checkExamPassOrFail() {
        return calculateBiologyPercentage() < 60 || calculateChemistryPercentage() < 60 || calculatePhysicsPercentage() < 60;
    }
    
    //Check if the user passed their exams overall
    private boolean checkOverallPassOrFail() {
        if(totalPercentage() < 60 || !this.checkExamPassOrFail()) {
            return false;
        }
        return true;
    }

    //Return number of exams user failed
    private String failedExams() {
        if (calculateBiologyPercentage() < 60 && calculateChemistryPercentage() >= 60 && calculatePhysicsPercentage() >= 60 || calculateChemistryPercentage() < 60 && calculateBiologyPercentage() >= 60 && calculatePhysicsPercentage() >= 60 || calculatePhysicsPercentage() < 60 && calculateBiologyPercentage() >= 60 && calculateChemistryPercentage() >= 60) {
            return "You failed 1 Exam!";
        }
        else if(calculateBiologyPercentage() < 60 && calculateChemistryPercentage() < 60 && calculatePhysicsPercentage() < 60) {
            return "You failed all of your exams!";
        }
        else {
            return "You failed 2 exams!";
        }
    }

    //Method to display the output in a neat and concise format for good readability
    public String displayResults() {
        if (!checkOverallPassOrFail()) {
            return this.addApostrophe() + " results:\n" + this.biologyResults() + "\n" + this.chemistryResults() + "\n" + this.physicsResults() + "\n" + "Overall Percentage: " + this.totalPercentage() + "% = Fail\n" + this.failedExams();
        }
        else {
            return this.addApostrophe() + " results:\n" + this.biologyResults() + "\n" + this.chemistryResults() + "\n" + this.physicsResults() + "\n" + "Overall Percentage: " + this.totalPercentage() + "% = Pass";
        }
    }
}