package com.example.alex.listviewdemo;

/**
 * Created by Alex on 2/15/2018.
 */

public class Course {

    private String name;
    private String number;
    private String professor;

    public Course() {}

    public void setCourseName(String name) {this.name = name;}
    public void setCourseNumber(String number)
    {
        this.number = number;
    }
    public void setProfessor(String profName)
    {
        professor = profName;
    }

    public String getCourseName()
    {
        return name;
    }
    public String getCourseNumber()
    {
        return number;
    }
    public String getProfessorName()
    {
        return professor;
    }
}