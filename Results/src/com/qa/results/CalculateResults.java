package com.qa.results;

public class CalculateResults {
     private String physicsExamScore = "Physics";
     private String chemistryExamScore = "Chemistry";
     private String biologyExamScore = "Biology";
     private int physicsExamTotalMarks = 150;
     private int chemistryExamTotalMarks = 150;
     private int biologyExamTotalMarks = 150;
     private int total;
     private int percentage;
    
    public CalculateResults(String physicsScore, String chemistryScore, String biologyScore) {
        this.physicsExamScore = physicsScore;
        this.chemistryExamScore = chemistryScore;
        this.biologyExamScore = biologyScore;
    }
}