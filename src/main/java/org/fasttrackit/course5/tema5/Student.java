package org.fasttrackit.course5.tema5;

public class Student implements Human{
    String firstName;
    String lastName;
    String dateOfBitrh;

    String dateOfEnrollment;
    String facultyName;
    String specializationName;

    public String getDateOfEnrollment() {
        return dateOfEnrollment;
    }

    public void setDateOfEnrollment(String dateOfEnrollment) {
        this.dateOfEnrollment = dateOfEnrollment;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public String getSpecializationName() {
        return specializationName;
    }

    public void setSpecializationName(String specializationName) {
        this.specializationName = specializationName;
    }

    @Override
    public String talks() {
        return "Tralaa student";
    }

    @Override
    public void eats() {
        System.out.println("moa");;
    }
}
