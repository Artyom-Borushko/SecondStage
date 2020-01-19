package com.epam.second_stage.errors_exceptions.exceptions_resourses;

public class AbsenceOfGroupsException extends Exception {
    public AbsenceOfGroupsException() {
    }

    public AbsenceOfGroupsException(String message) {
        super(message);
    }

    public AbsenceOfGroupsException(String message, Throwable cause) {
        super(message, cause);
    }

    public AbsenceOfGroupsException(Throwable cause) {
        super(cause);
    }
}
