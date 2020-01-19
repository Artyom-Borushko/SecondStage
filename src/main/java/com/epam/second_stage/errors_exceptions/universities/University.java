package com.epam.second_stage.errors_exceptions.universities;

import com.epam.second_stage.errors_exceptions.faculties.Faculty;
import com.epam.second_stage.errors_exceptions.faculties.GeoFaculty;
import com.epam.second_stage.errors_exceptions.faculties.LawFaculty;
import com.epam.second_stage.errors_exceptions.groups.GeoFacultyGroup;
import com.epam.second_stage.errors_exceptions.groups.Group;
import com.epam.second_stage.errors_exceptions.groups.LawFacultyGroup;
import com.epam.second_stage.errors_exceptions.students.Student;
import org.omg.CORBA.PUBLIC_MEMBER;

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

    public double averageMarkInSubjectForEntireUniversity() {
        double sumInParticularFaculty;
        double sumInParticularGroup;
        double sumInEntireUniversity = 0;
        double averageMarkForEntireUniversity;
        int counter = 0;
        if (listOfFaculties.isEmpty()) {
            throw new IllegalArgumentException();
        }

        for (Faculty faculty : listOfFaculties) {
            sumInParticularFaculty = 0;
            for (Group group : faculty.getListOfGroups()) {
                sumInParticularGroup = 0;
                for (Student student : group.getListOfStudents()) {
                    if (student.getMarksOfStudents().containsKey("civilLawMark")) {
                        sumInParticularGroup += student.getMarksOfStudents().get("civilLawMark");
                        counter++;
                    }
                }
                sumInParticularFaculty += sumInParticularGroup;
            }
            sumInEntireUniversity += sumInParticularFaculty;
        }
        averageMarkForEntireUniversity = sumInEntireUniversity / counter;
        return averageMarkForEntireUniversity;
    }
}
