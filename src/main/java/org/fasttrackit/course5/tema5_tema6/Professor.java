package org.fasttrackit.course5.tema5_tema6;

import java.util.Objects;

public class Professor implements Human {
    String firstName;
    String lastName;
    String  dateOfBirth;
    String dateOfHiring;
    String specializationName;
    ProfessorType type;



    public String getDateOfHiring() {
        return dateOfHiring;
    }

    public void setDateOfHiring(String dateOfHiring) {
        this.dateOfHiring = dateOfHiring;
    }

    public String getSpecializationName() {
        return specializationName;
    }

    public void setSpecializationName(String specializationName) {
        this.specializationName = specializationName;
    }

    @Override
    public String talks() {
        return " Tralalaaaaaaaa";
    }

    @Override
    public void eats() {

    }

    @Override
    public String getDateOfEnrollment() {
        return null;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", dateOfHiring='" + dateOfHiring + '\'' +
                ", specializationName='" + specializationName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Professor professor = (Professor) o;
        return Objects.equals(firstName, professor.firstName) && Objects.equals(lastName, professor.lastName) && Objects.equals(dateOfBirth, professor.dateOfBirth) && Objects.equals(dateOfHiring, professor.dateOfHiring) && Objects.equals(specializationName, professor.specializationName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, dateOfBirth, dateOfHiring, specializationName);
    }

    @Override
    public void setDateOfEnrollment(String DateOfEnrollment) {

    }

    @Override
    public ScholarType getType() {
        return type;
    }
}
