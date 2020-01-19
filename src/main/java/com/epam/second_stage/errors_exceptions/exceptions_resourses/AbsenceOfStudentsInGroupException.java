package com.epam.second_stage.errors_exceptions.exceptions_resourses;

public class AbsenceOfStudentsInGroupException extends Exception {
    public AbsenceOfStudentsInGroupException() {
    }

    public AbsenceOfStudentsInGroupException(String message) {
        super(message);
    }

    public AbsenceOfStudentsInGroupException(String message, Throwable cause) {
        super(message, cause);
    }

    public AbsenceOfStudentsInGroupException(Throwable cause) {
        super(cause);
    }
}
