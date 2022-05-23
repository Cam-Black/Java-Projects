package com.qa.results;

public class FormatData {
     private String physicsExamScore = "Physics";
     private String chemistryExamScore = "Chemistry";
     private String biologyExamScore = "Biology";
     private int physicsExamTotalMarks = 150;
     private int chemistryExamTotalMarks = 150;
     private int biologyExamTotalMarks = 150;
     private int total;
     private int percentage;
    
    public FormatData(String physicsScore, String chemistryScore, String biologyScore) {
        this.physicsExamScore = physicsScore;
        this.chemistryExamScore = chemistryScore;
        this.biologyExamScore = biologyScore;
    }
}