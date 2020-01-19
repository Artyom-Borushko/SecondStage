package com.epam.second_stage.errors_exceptions.universities;

import com.epam.second_stage.errors_exceptions.faculties.Faculty;

import java.util.ArrayList;
import java.util.List;

public class University {

    private double quantityOfFaculties;
    private double quantityOfStudents;
    private ArrayList<Faculty> listOfFaculties = new ArrayList<Faculty>();

    public University(double quantityOfFaculties, double quantityOfStudents) {
        this.quantityOfFaculties = quantityOfFaculties;
        this.quantityOfStudents = quantityOfStudents;
    }

    public double getQuantityOfFaculties() {
        return quantityOfFaculties;
    }

    public void setQuantityOfFaculties(double quantityOfFaculties) {
        this.quantityOfFaculties = quantityOfFaculties;
    }

    public double getQuantityOfStudents() {
        return quantityOfStudents;
    }

    public void setQuantityOfStudents(double quantityOfStudents) {
        this.quantityOfStudents = quantityOfStudents;
    }

    public ArrayList<Faculty> getListOfFaculties() {
        return listOfFaculties;
    }

    public void setListOfFaculties(ArrayList<Faculty> listOfFaculties) {
        this.listOfFaculties = listOfFaculties;
    }
}
