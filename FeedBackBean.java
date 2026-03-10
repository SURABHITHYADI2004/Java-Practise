package com.demo.bean;

public class FeedBackBean {

    private String name;
    private String roll;
    private String department;
    private String gender;
    private String teaching;
    private String comments;

    public FeedBackBean(){}

    public void setName(String name){ this.name = name; }
    public String getName(){ return name; }

    public void setRoll(String roll){ this.roll = roll; }
    public String getRoll(){ return roll; }

    public void setDepartment(String department){ this.department = department; }
    public String getDepartment(){ return department; }

    public void setGender(String gender){ this.gender = gender; }
    public String getGender(){ return gender; }

    public void setTeaching(String teaching){ this.teaching = teaching; }
    public String getTeaching(){ return teaching; }

    public void setComments(String comments){ this.comments = comments; }
    public String getComments(){ return comments; }
}