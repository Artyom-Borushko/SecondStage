package com.epam.second_stage.errors_exceptions.exceptions_resourses;

public class SubjectsException extends Exception {
    public SubjectsException() {
    }

    public SubjectsException(String message) {
        super(message);
    }

    public SubjectsException(String message, Throwable cause) {
        super(message, cause);
    }

    public SubjectsException(Throwable cause) {
        super(cause);
    }
}
