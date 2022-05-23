package com.qa.results;

public class CalculateResults {
    
    private String name;
    private int physicsExamScore;
    private int chemistryExamScore;
    private int biologyExamScore;
    private int physicsExamTotalMarks = 150;
    private int chemistryExamTotalMarks = 150;
    private int biologyExamTotalMarks = 150;
    private int total;
    private int percentage;
    
    public CalculateResults(String name, int physicsScore, int chemistryScore, int biologyScore) {
        this.name = name;
        this.physicsExamScore = physicsScore;
        this.chemistryExamScore = chemistryScore;
        this.biologyExamScore = biologyScore;
    }
    private String addApostrophe() {
        String apostropheName = this.name += "'s";
        return apostropheName;
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

    public String displayResults() {
        return this.addApostrophe() + " results:\n" + this.biologyResults() + "\n" + this.chemistryResults() + "\n" + this.physicsResults();
    }
}