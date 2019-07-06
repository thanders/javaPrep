package com.javaPrep.backend.beans.exam;

public class Exam {

    private int id;
    private String examTitle;
    private String examNumber;
    private String examFormat;
    private int examDuration;
    private int examQuestions;
    private Double examPassingScore;
    private String examValidatedAgainst;
    private String examURL;

    public Exam(int id, String examTitle, String examNumber, String examFormat, int examDuration, int examQuestions, double examPassingScore, String examValidatedAgainst, String examURL){
        this.id = id;
        this.examTitle = examTitle;
        this.examNumber = examNumber;
        this.examFormat = examFormat;
        this.examDuration = examDuration;
        this.examQuestions = examQuestions;
        this.examPassingScore = examPassingScore;
        this.examValidatedAgainst = examValidatedAgainst;
        this.examURL = examURL;
    }

    // standard getters and setters
    public int getId(){
        return this.id;
    }

    public String getExamTitle(){
        return this.examTitle;
    }

    public void setExamTitle(String examTitle){
        this.examTitle = examTitle;
    }

}