package com.epam.second_stage.errors_exceptions.exceptions_resourses;

public class AbsenceOfSubjectsException extends Exception {
    public AbsenceOfSubjectsException() {
    }

    public AbsenceOfSubjectsException(String message) {
        super(message);
    }

    public AbsenceOfSubjectsException(String message, Throwable cause) {
        super(message, cause);
    }

    public AbsenceOfSubjectsException(Throwable cause) {
        super(cause);
    }
}
