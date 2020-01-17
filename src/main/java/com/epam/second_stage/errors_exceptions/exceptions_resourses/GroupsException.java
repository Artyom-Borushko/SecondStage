package com.epam.second_stage.errors_exceptions.exceptions_resourses;

public class GroupsException extends Exception {
    public GroupsException() {
    }

    public GroupsException(String message) {
        super(message);
    }

    public GroupsException(String message, Throwable cause) {
        super(message, cause);
    }

    public GroupsException(Throwable cause) {
        super(cause);
    }
}
