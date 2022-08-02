package org.fasttrackit.course4.operator;

public class AritmeticOperators {
    // incremental
    public static void main(String[] args) {
    int op1 = 7;
    int op2 = 3;

    int result11 = op1 + op2; // ==10
    int result12 = op1 % op2; //


        System.out.println("Result 1. " + result11); // == 10
        System.out.println("Result 1.2 " + op1 + op2); //== 73 (concatenare)
        System.out.println("Result 1.3 " + result12); // == 1 (3/7 = intra de 2 ori si rest 1)

    int op21 = 5;
    int op22 = 7;
    int result2 = op21+op22; //== 12
        System.out.println("Result2 " + (result2++));// still 12(left to right: first prints the number, then increments )
        System.out.println("Result2.1 " + result2); //==13 (simply prints the number)
        System.out.println("Result2.2 " + (++result2)); //==14 (first increments, then prints the number)

    }
}
