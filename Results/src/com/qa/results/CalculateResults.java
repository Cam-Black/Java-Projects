package com.qa.results;

public class CalculateResults {
    
    private String name;
    private int physicsExamScore;
    private int chemistryExamScore;
    private int biologyExamScore;
    private int physicsExamTotalMarks = 150;
    private int chemistryExamTotalMarks = 150;
    private int biologyExamTotalMarks = 150;
    private double total;
    private double percentage;
    
    public CalculateResults(String name, int physicsScore, int chemistryScore, int biologyScore) {
        this.name = name;
        this.physicsExamScore = physicsScore;
        this.chemistryExamScore = chemistryScore;
        this.biologyExamScore = biologyScore;
    }
    
    private String addApostrophe() {
        String apostropheName = this.name;

        if (apostropheName.substring(apostropheName.length() - 1 ).equals("'"))  {
            return apostropheName += "s";
        }
        else {
            return apostropheName += "'s";
        }
    }   
        
    private String biologyResults() {
        return "Biology: " + this.biologyExamScore + " out of " + this.biologyExamTotalMarks;
    }

    private String chemistryResults() {
        return "Chemistry: " + this.chemistryExamScore + " out of " + this.chemistryExamTotalMarks;
    }
    
    private String physicsResults() {
        return "Physics: " + this.physicsExamScore + " out of " + this.physicsExamTotalMarks;
    }
    
    private double totalPercentage() {
        this.total = biologyExamScore + chemistryExamScore + physicsExamScore;
        double totalMarks = biologyExamTotalMarks + chemistryExamTotalMarks + physicsExamTotalMarks;
        this.percentage = (total * 100) / totalMarks;
        double twoDecimalPlaces = Math.floor(this.percentage * 100) / 100;
        return twoDecimalPlaces;
    }
    public String displayResults() {
        return this.addApostrophe() + " results:\n" + this.biologyResults() + "\n" + this.chemistryResults() + "\n" + this.physicsResults() + "\n" + "Overall Percentage: " + this.totalPercentage() + "%";
    } 
}