package com.epam.second_stage.errors_exceptions.students;

public class GeoStudents extends Student {
    private int quantityOfPasses;

    public GeoStudents(int id, String surname, String name, int groupNumber, int quantityOfSubjects, int quantityOfPasses) {
        super(id, surname, name, groupNumber, quantityOfSubjects);
        this.quantityOfPasses = quantityOfPasses;
    }

    public int getQuantityOfPasses() {
        return quantityOfPasses;
    }

    public void setQuantityOfPasses(int quantityOfPasses) {
        this.quantityOfPasses = quantityOfPasses;
    }
}
