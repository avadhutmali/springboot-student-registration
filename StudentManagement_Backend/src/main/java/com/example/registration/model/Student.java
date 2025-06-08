package com.example.registration.model;

public class Student {
    private String name;
    private int id;
    private String email;

    public Student(){};

    public Student(String name,int id,String emal){
        this.email = emal;
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
