package com.epam.second_stage.errors_exceptions.students;

import com.epam.second_stage.errors_exceptions.exceptions_resourses.AbsenceOfSubjectsException;
import com.epam.second_stage.errors_exceptions.exceptions_resourses.InvalidMarksException;

import java.util.HashMap;
import java.util.Map;

public class Student {
    private int id;
    private String surname;
    private String name;
    private int groupNumber;
    private int quantityOfSubjects;
    private Map<String, Integer> marksOfStudents = new HashMap<String, Integer>();

    public Student(int id, String surname, String name, int groupNumber, int quantityOfSubjects) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.groupNumber = groupNumber;
        this.quantityOfSubjects = quantityOfSubjects;
    }

    public Student() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public int getQuantityOfSubjects() {
        return quantityOfSubjects;
    }

    public void setQuantityOfSubjects(int quantityOfSubjects) {
        this.quantityOfSubjects = quantityOfSubjects;
    }

    public Map<String, Integer> getMarksOfStudents() {
        return marksOfStudents;
    }

    public void setMarksOfStudents(Map<String, Integer> marksOfStudents) {
        this.marksOfStudents = marksOfStudents;
    }

    public double averageMarkForAllStudentsSubjects() throws AbsenceOfSubjectsException, InvalidMarksException {
        double averageMark = 0;
        double sumOfMarks = 0;
        if (marksOfStudents.isEmpty()) {
            throw new AbsenceOfSubjectsException("Should be at least one subject");
        }
            for (Integer marks : marksOfStudents.values()) {
                if (marks < 0 || marks > 10) {
                    throw new InvalidMarksException("Mark should be higher than 0 and lower than 10");
                }
                sumOfMarks += marks;
                averageMark = sumOfMarks / marksOfStudents.size();
            }
        return averageMark;
    }
}

