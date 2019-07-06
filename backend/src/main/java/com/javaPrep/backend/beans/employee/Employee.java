package com.javaPrep.backend.beans.employee;

public class Employee {

    private String id;
    private String name;

    public Employee(String id, String name){
        this.id = id;
        this.name = name;
    }

    // standard getters and setters


    public String getId() {
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){

    }
}