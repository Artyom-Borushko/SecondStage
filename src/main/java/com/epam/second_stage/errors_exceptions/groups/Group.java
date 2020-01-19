package com.epam.second_stage.errors_exceptions.groups;

import com.epam.second_stage.errors_exceptions.students.Student;

import java.util.ArrayList;

public class Group {
    private int groupID;
    private int groupNumber;
    private int quantityOfStudents;
    private String specialization;
    private String nameOfFaculty;
    private ArrayList<Student> listOfStudents = new ArrayList<Student>();

    public Group(int groupID, int groupNumber, int quantityOfStudents, String specialization, String nameOfFaculty) {
        this.groupID = groupID;
        this.groupNumber = groupNumber;
        this.quantityOfStudents = quantityOfStudents;
        this.specialization = specialization;
        this.nameOfFaculty = nameOfFaculty;
    }

    public Group() {

    }


    public int getGroupID() {
        return groupID;
    }

    public void setGroupID(int groupID) {
        this.groupID = groupID;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public int getQuantityOfStudents() {
        return quantityOfStudents;
    }

    public void setQuantityOfStudents(int quantityOfStudents) {
        this.quantityOfStudents = quantityOfStudents;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getNameOfFaculty() {
        return nameOfFaculty;
    }

    public void setNameOfFaculty(String nameOfFaculty) {
        this.nameOfFaculty = nameOfFaculty;
    }

    public ArrayList<Student> getListOfStudents() {
        return listOfStudents;
    }

    public void setListOfStudents(ArrayList<Student> listOfStudents) {
        this.listOfStudents = listOfStudents;
    }

    public double averageMarkOfStudentsInAParticularGroup() {
        double averageMarkInParticularGroup = 0;
        int counter = 0;
        double sumInParticularGroup = 0;
        for (Student student: listOfStudents) {
            if (student.getMarksOfStudents().containsKey("civilLawMark")) {
                sumInParticularGroup += student.getMarksOfStudents().get("civilLawMark");
                counter++;
            }
        }
        if (counter == 0) {     // НЕТ ПРЕДМЕТОВ У СТУДЕНТА
            throw  new IllegalArgumentException();
        }
        averageMarkInParticularGroup = sumInParticularGroup / counter;
        return averageMarkInParticularGroup;
    }
}