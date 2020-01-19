package com.epam.second_stage.errors_exceptions.faculties;

import com.epam.second_stage.errors_exceptions.groups.Group;

import java.util.ArrayList;

public class Faculty {
    private int facultyID;
    private String nameOfRector;
    private double quantityOfGroups;
    private double quantityOfStudents;
    private ArrayList<Group> listOfGroups = new ArrayList<Group>();

    public Faculty(int facultyID, String nameOfRector, double quantityOfGroups, double quantityOfStudents) {
        this.facultyID = facultyID;
        this.nameOfRector = nameOfRector;
        this.quantityOfGroups = quantityOfGroups;
        this.quantityOfStudents = quantityOfStudents;
    }

    public int getFacultyID() {
        return facultyID;
    }

    public void setFacultyID(int facultyID) {
        this.facultyID = facultyID;
    }

    public String getNameOfRector() {
        return nameOfRector;
    }

    public void setNameOfRector(String nameOfRector) {
        this.nameOfRector = nameOfRector;
    }

    public double getQuantityOfGroups() {
        return quantityOfGroups;
    }

    public void setQuantityOfGroups(double quantityOfGroups) {
        this.quantityOfGroups = quantityOfGroups;
    }

    public double getQuantityOfStudents() {
        return quantityOfStudents;
    }

    public void setQuantityOfStudents(double quantityOfStudents) {
        this.quantityOfStudents = quantityOfStudents;
    }

    public ArrayList<Group> getListOfGroups() {
        return listOfGroups;
    }

    public void setListOfGroups(ArrayList<Group> listOfGroups) {
        this.listOfGroups = listOfGroups;
    }
}
