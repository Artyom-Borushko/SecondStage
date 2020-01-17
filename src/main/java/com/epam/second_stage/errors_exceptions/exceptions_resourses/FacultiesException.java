package com.epam.second_stage.errors_exceptions.exceptions_resourses;

public class FacultiesException extends Exception {
    public FacultiesException() {
    }

    public FacultiesException(String message) {
        super(message);
    }

    public FacultiesException(String message, Throwable cause) {
        super(message, cause);
    }

    public FacultiesException(Throwable cause) {
        super(cause);
    }
}
