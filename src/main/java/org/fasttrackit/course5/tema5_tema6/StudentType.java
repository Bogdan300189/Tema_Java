package org.fasttrackit.course5.tema5_tema6;

public enum StudentType implements ScholarType {
    BACELOR("3 Years"),
    MASTER("2 years"),
    PHP("6 Years");
private String nrOfStudy;
StudentType(String nrOfStudy){this.nrOfStudy = nrOfStudy;
}
public String getNrOfStudy(){
    return nrOfStudy;}
}
