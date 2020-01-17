package com.epam.second_stage.errors_exceptions.exceptions_resourses;

public class StudentsException extends Exception {
    public StudentsException() {
    }

    public StudentsException(String message) {
        super(message);
    }

    public StudentsException(String message, Throwable cause) {
        super(message, cause);
    }

    public StudentsException(Throwable cause) {
        super(cause);
    }
}
