package com.epam.second_stage.errors_exceptions.groups;

public class LawFacultyGroup extends Group {
    private String nameOfHeadMan;

    public LawFacultyGroup(int groupID, int groupNumber, int quantityOfStudents, String specialization, String nameOfFaculty, String nameOfHeadMan) {
        super(groupID, groupNumber, quantityOfStudents, specialization, nameOfFaculty);
        this.nameOfHeadMan = nameOfHeadMan;
    }

    public String getNameOfHeadMan() {
        return nameOfHeadMan;
    }

    public void setNameOfHeadMan(String nameOfHeadMan) {
        this.nameOfHeadMan = nameOfHeadMan;
    }
}
