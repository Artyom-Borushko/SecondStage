package com.epam.second_stage.errors_exceptions.exceptions_resourses;

public class MarksException extends Exception {
    public MarksException() {
    }

    public MarksException(String message) {
        super(message);
    }

    public MarksException(String message, Throwable cause) {
        super(message, cause);
    }

    public MarksException(Throwable cause) {
        super(cause);
    }
}
