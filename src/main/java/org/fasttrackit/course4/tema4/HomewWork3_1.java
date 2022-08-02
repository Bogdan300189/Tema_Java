package org.fasttrackit.course4.tema4;

public class HomewWork3_1 {
    public static void main(String[] args) {
        System.out.println("\n 1. n factorial");
        int i, fact = 1;
        int number = 6;
        for (i = 1; i <= number; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + number + " is: " + fact);


    }
}
