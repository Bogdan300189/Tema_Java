package org.fasttrackit.course3.model;

import java.util.Date;

public class Professor {


    public String lastName;
    public String firstName;
    private String dateOfBirth;
    public String dateOfHiring;
    public String emailAddress;
    public String isPHP;

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getDateOfHiring() {
        return dateOfHiring;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getIsPHP() {
        return isPHP;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setDateOfHiring(String dateOfHiring) {
        this.dateOfHiring = dateOfHiring;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setIsPHP(String isPHP) {
        this.isPHP = isPHP;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", dateOfHiring='" + dateOfHiring + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", isPHP='" + isPHP + '\'' +
                '}';
    }
}



