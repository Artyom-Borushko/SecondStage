package com.epam.second_stage.errors_exceptions.exceptions_resourses;

public class AbsenceOfFacultiesException extends Exception {
    public AbsenceOfFacultiesException() {
    }

    public AbsenceOfFacultiesException(String message) {
        super(message);
    }

    public AbsenceOfFacultiesException(String message, Throwable cause) {
        super(message, cause);
    }

    public AbsenceOfFacultiesException(Throwable cause) {
        super(cause);
    }
}
