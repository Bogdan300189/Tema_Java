package org.fasttrackit.course5.tema5;

public class Professor implements Human {
    String firstName;
    String lastName;
    String  dateOfBirth;
    String dateOfHiring;
    String specializationName;



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
    public void setDateOfEnrollment(String DateOfEnrollment) {

    }
}
