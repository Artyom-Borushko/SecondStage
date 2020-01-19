package com.epam.second_stage.errors_exceptions.groups;

public class GeoFacultyGroup extends Group {
    private String nameOfTutor;

    public GeoFacultyGroup(int groupID, int groupNumber, int quantityOfStudents, String specialization, String nameOfFaculty, String nameOfTutor) {
        super(groupID, groupNumber, quantityOfStudents, specialization, nameOfFaculty);
        this.nameOfTutor = nameOfTutor;
    }

    public String getNameOfTutor() {
        return nameOfTutor;
    }

    public void setNameOfTutor(String nameOfTutor) {
        this.nameOfTutor = nameOfTutor;
    }
}
