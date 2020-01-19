package com.epam.second_stage.errors_exceptions.faculties;

public class GeoFaculty extends Faculty {
    private String nameOfInternshipManager;

    public GeoFaculty(int facultyID, String nameOfRector, double quantityOfGroups, double quantityOfStudents, String nameOfInternshipManager) {
        super(facultyID, nameOfRector, quantityOfGroups, quantityOfStudents);
        this.nameOfInternshipManager = nameOfInternshipManager;
    }

    public String getNameOfInternshipManager() {
        return nameOfInternshipManager;
    }

    public void setNameOfInternshipManager(String nameOfInternshipManager) {
        this.nameOfInternshipManager = nameOfInternshipManager;
    }
}
