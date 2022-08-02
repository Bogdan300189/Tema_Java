package org.fasttrackit.course4.statement;

public class IfElse {
    public static void main(String[] args) {
        System.out.println("\n 1. If with no {}");
        int op11 = 1;
        int op12 = 2;

        if (op11 + op12 >= 3) {
            System.out.println("Result 1: " + (op11 + op12));
            op11++;
            op12++;
            System.out.println("op11 = " + op11 + "op12 = " + op12);


            System.out.println("\n 2. If with {}");

            int op21 = 4;
            int op22 = 5;
            int result2 = op21 * op22;
            if (result2 >= 14) {// because we have{}, the whole block {} will be evaluated
                System.out.println("Result2: " + result2);
                op21++;
                op22++;
                System.out.println("op21 = "  + op21 + "op22 = "  + op22);
            }

            System.out.println("\n 3. If else with {} ");

            String s31 = "abc";
            String s32 = "abc";
            if (s31 == s32) { // == compares objects
                System.out.println("Sunt egale, sarbatoare");
            } else {
                System.out.println("Nu-s egale,of, viata mea ");
            }


            System.out.println("\n 4. If else with {} ");

            String s41 = "abc";
            String s42 = new String("abc");// new object, diferent from line 31, even though with the same value
            if (s41 == s42) {
                System.out.println("Acum chiar sunt egale, sarbatoare");
            } else {
                System.out.println("Vai nici acum! ");
            }

            System.out.println("\n 5. If-Else-If(with {})");

            String s51 = "xyz";
            String s52 = new String("xyz");
            if (s51 == s52) {
                System.out.println("==");
            } else if (s51.equals(s52)) {
                System.out.println(".equals()");
            }else{
                    System.out.println("false");
                }
            }
        }


}
