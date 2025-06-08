package com.example.registration.model;

public class Course {
    private String title;
    private int id;
    private String description;

    public Course(){}

    public Course(String title,String description,int id){
        this.title = title;
        this.id = id;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
