package com.epam.second_stage.errors_exceptions.students;

public class LawStudents extends Student {
    private boolean abilityToBecomeAJudge;

    public LawStudents(int id, String surname, String name, int groupNumber, int quantityOfSubjects, boolean abilityToBecomeAJudge) {
        super(id, surname, name, groupNumber, quantityOfSubjects);
        this.abilityToBecomeAJudge = abilityToBecomeAJudge;
    }

    public boolean isAbilityToBecomeAJudge() {
        return abilityToBecomeAJudge;
    }

    public void setAbilityToBecomeAJudge(boolean abilityToBecomeAJudge) {
        this.abilityToBecomeAJudge = abilityToBecomeAJudge;
    }
}
