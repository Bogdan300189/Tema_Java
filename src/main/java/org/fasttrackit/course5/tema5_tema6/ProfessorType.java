package org.fasttrackit.course5.tema5_tema6;

public enum ProfessorType implements ScholarType {
    ASSISTANT("1 year experince"),
    ASSOCIATE("2 years experince"),
    PROFESSOR("10 years experince");

    private String experince;

    //constructor
    ProfessorType (String experince){
        this.experince = experince;
    }

    public String getExperince() {
        return experince;
    }
}
