package org.fasttrackit.course4.statement;

public class BreakAndContinue {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if(i % 2 ==0){//daca e numar par, nu mai printam linia 11
            System.out.println("numar par, nu mai printam i ");
            continue;
        }
        System.out.println("i= "+ i );
    }
}}
