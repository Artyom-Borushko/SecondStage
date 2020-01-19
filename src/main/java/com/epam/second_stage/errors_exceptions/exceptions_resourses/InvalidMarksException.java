package com.epam.second_stage.errors_exceptions.exceptions_resourses;

public class InvalidMarksException extends Exception {
    public InvalidMarksException() {
    }

    public InvalidMarksException(String message) {
        super(message);
    }

    public InvalidMarksException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidMarksException(Throwable cause) {
        super(cause);
    }
}
