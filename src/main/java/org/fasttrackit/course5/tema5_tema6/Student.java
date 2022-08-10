package org.fasttrackit.course5.tema5_tema6;

import java.lang.reflect.Type;
import java.util.Objects;

public class Student implements Human{
    String firstName;
    String lastName;
    String dateOfBitrh;

    String dateOfEnrollment;
    String facultyName;
    String specializationName;
    StudentType type;

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBitrh='" + dateOfBitrh + '\'' +
                ", dateOfEnrollment='" + dateOfEnrollment + '\'' +
                ", facultyName='" + facultyName + '\'' +
                ", specializationName='" + specializationName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName) && Objects.equals(dateOfBitrh, student.dateOfBitrh) && Objects.equals(dateOfEnrollment, student.dateOfEnrollment) && Objects.equals(facultyName, student.facultyName) && Objects.equals(specializationName, student.specializationName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, dateOfBitrh, dateOfEnrollment, facultyName, specializationName);
    }

    public String getDateOfEnrollment() {
        return dateOfEnrollment;
    }

    public void setDateOfEnrollment(String dateOfEnrollment) {
        this.dateOfEnrollment = dateOfEnrollment;
    }

    @Override
    public ScholarType getType() {
        return type;
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
        System.out.println("moa");
    }
}
