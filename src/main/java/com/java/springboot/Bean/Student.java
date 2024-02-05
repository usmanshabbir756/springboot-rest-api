package com.java.springboot.Bean;

public class Student {
    private int id;
    private  String fisrName;
    private  String lastName;

    public Student(int id, String fisrName, String lastName) {
        this.id = id;
        this.fisrName = fisrName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFisrName() {
        return fisrName;
    }

    public void setFisrName(String fisrName) {
        this.fisrName = fisrName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
