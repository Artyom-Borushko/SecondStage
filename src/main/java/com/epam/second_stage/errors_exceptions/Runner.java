package com.epam.second_stage.errors_exceptions;

import com.epam.second_stage.errors_exceptions.faculties.Faculty;
import com.epam.second_stage.errors_exceptions.universities.University;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main (String [] args) {



        Faculty lawFaculty = new Faculty(1,"Balashenko", 1,2);
        Faculty geoFaculty = new Faculty(2,"Petrov", 1,2);
    }
}
