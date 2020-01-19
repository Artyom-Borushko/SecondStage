package com.epam.second_stage.errors_exceptions.faculties;

public class LawFaculty extends Faculty {
    private int numberOfMeetingsOfSeniorOfficials;

    public LawFaculty(int facultyID, String nameOfRector, double quantityOfGroups, double quantityOfStudents, int numberOfMeetingsOfSeniorOfficials) {
        super(facultyID, nameOfRector, quantityOfGroups, quantityOfStudents);
        this.numberOfMeetingsOfSeniorOfficials = numberOfMeetingsOfSeniorOfficials;
    }

    public int getNumberOfMeetingsOfSeniorOfficials() {
        return numberOfMeetingsOfSeniorOfficials;
    }

    public void setNumberOfMeetingsOfSeniorOfficials(int numberOfMeetingsOfSeniorOfficials) {
        this.numberOfMeetingsOfSeniorOfficials = numberOfMeetingsOfSeniorOfficials;
    }
}
