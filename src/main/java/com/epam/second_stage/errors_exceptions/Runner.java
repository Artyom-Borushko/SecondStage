package com.epam.second_stage.errors_exceptions;

import com.epam.second_stage.errors_exceptions.exceptions_resourses.*;
import com.epam.second_stage.errors_exceptions.faculties.Faculty;
import com.epam.second_stage.errors_exceptions.faculties.GeoFaculty;
import com.epam.second_stage.errors_exceptions.faculties.LawFaculty;
import com.epam.second_stage.errors_exceptions.groups.GeoFacultyGroup;
import com.epam.second_stage.errors_exceptions.groups.Group;
import com.epam.second_stage.errors_exceptions.groups.LawFacultyGroup;
import com.epam.second_stage.errors_exceptions.students.GeoStudents;
import com.epam.second_stage.errors_exceptions.students.LawStudents;
import com.epam.second_stage.errors_exceptions.students.Student;
import com.epam.second_stage.errors_exceptions.universities.University;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main (String [] args) {

        University BSU = new University(2,4);

        LawFaculty lawFaculty = new LawFaculty(1,"Balashenko", 1,2,3);
        GeoFaculty geoFaculty = new GeoFaculty(2,"Petrov", 1,2, "valera");

        BSU.getListOfFaculties().add(lawFaculty);
        BSU.getListOfFaculties().add(geoFaculty);


       LawFacultyGroup lawFacultyGroup = new LawFacultyGroup(1,2,3,"konst","lawFaculty", "Danila");
       GeoFacultyGroup geoFacultyGroup = new GeoFacultyGroup(4,5,2,"geodezist","geoFaculty","Petrovich");
       lawFaculty.getListOfGroups().add(lawFacultyGroup);
       geoFaculty.getListOfGroups().add(geoFacultyGroup);


        LawStudents firstLawStudent = new LawStudents(123,"Borushko", "Artyom",12,4,true);
        LawStudents secondLawStudent = new LawStudents(124, "Minovich", "Ilya",21, 4, true);
        GeoStudents firstGeoStudent = new GeoStudents(2,"Rozanov", "Danila", 14, 4,120);
        GeoStudents secondGeoStudent = new GeoStudents(3, "Valirov", "Valera", 15, 4, 34);

        lawFacultyGroup.getListOfStudents().add(firstLawStudent);
        lawFacultyGroup.getListOfStudents().add(secondLawStudent);
        geoFacultyGroup.getListOfStudents().add(firstGeoStudent);
        geoFacultyGroup.getListOfStudents().add(secondGeoStudent);


        firstLawStudent.getMarksOfStudents().put("civilLawMark", 9);
        firstLawStudent.getMarksOfStudents().put("criminalLawMark", 8);
        secondLawStudent.getMarksOfStudents().put("civilLawMark", 8);
        secondLawStudent.getMarksOfStudents().put("historyMark", 7);
        firstGeoStudent.getMarksOfStudents().put("geographyMark", 6);
        firstGeoStudent.getMarksOfStudents().put("geologyMark", 8);
        secondGeoStudent.getMarksOfStudents().put("historyMark", 9);
        secondGeoStudent.getMarksOfStudents().put("topologyMark", 10);


        try {
            System.out.println("Average mark for all student's subjects is " + firstGeoStudent.averageMarkForAllStudentsSubjects());
        } catch (AbsenceOfSubjectsException e) {
            e.printStackTrace();
        } catch (InvalidMarksException e) {
            e.printStackTrace();
        }

        try {
            System.out.println("Average mark for particular subject in particular group is " + lawFacultyGroup.averageMarkOfStudentsInAParticularGroup());
        } catch (AbsenceOfSubjectsException e) {
            e.printStackTrace();
        } catch (AbsenceOfStudentsInGroupException e) {
            e.printStackTrace();
        }

        try {
            System.out.println("Average mark for particular subject in particular faculty is " + lawFaculty.averageMarkOfStudentsInAParticularFaculty());
        } catch (AbsenceOfGroupsException e) {
            e.printStackTrace();
        } catch (AbsenceOfFacultiesException e) {
            e.printStackTrace();
        }

        try {
            System.out.println("Average mark for entire university is " + BSU.averageMarkInSubjectForEntireUniversity());
        } catch (AbsenceOfFacultiesException e) {
            e.printStackTrace();
        }
    }
}
