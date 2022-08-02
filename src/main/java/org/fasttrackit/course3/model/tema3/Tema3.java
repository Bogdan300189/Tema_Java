package org.fasttrackit.course3.model.tema3;

import org.fasttrackit.course3.model.Professor;

public class Tema3 {
    public static void main(String[] args) {

        Professor mathProfessor = new Professor();
        mathProfessor.setLastName("Daciana");
        mathProfessor.setDateOfBirth ("12.08.2022");
        mathProfessor.isPHP = "DA";

        Professor englishProfessor = new Professor();
        englishProfessor.firstName = "Miron";
        englishProfessor.dateOfHiring = "%12.08.2022%";

        Professor bioProfessor = new Professor();
        bioProfessor.lastName = "Alina";
        bioProfessor.emailAddress = " bioprofesor@yahoo.com";
        //TODO use only setters ( setLastName() ), instead of field invocation ( .lastName = ... )


        System.out.println("Profesor mate: " + mathProfessor.toString());
        System.out.println("Prenumele profesorului de matematica este : " + mathProfessor.getLastName());
        System.out.println("Profesorului de matematica este nascut in data de : " + mathProfessor.getDateOfBirth());
        System.out.println("Este profesorul de matematica cadrul universitar? " + mathProfessor.isPHP);

        System.out.println("Numele de familie a profesorului de engleza este : " + englishProfessor.firstName);
        System.out.println("Profesorului de engleza s-a angajat in data de : " + englishProfessor.dateOfHiring);

        System.out.println("Prenumele profesorului de biologie este : " + bioProfessor.lastName);
        System.out.println("Profesorului de biologie are urmatoarea adresa de email: " + bioProfessor.emailAddress);




    }
}
