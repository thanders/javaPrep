package com.javaPrep.backend.beans.topic;

import java.util.ArrayList;

public class Topic {

    private int id;
    private String exam;
    private String topic;
    public ArrayList<String> subtopics;

    public Topic(int id, String exam, String topic, ArrayList<String> subtopics) {
        this.id = id;
        this.exam = exam;
        this.topic = topic;
        this.subtopics = subtopics;
    }


    // standard getters and setters
}