package org.fasttrackit.course4.statement;

public class WhileAndDoWhileStatement {
    public static void main(String[] args) {
        whileLoop("k", -1);
        whileLoop("b", 9);
        doWhileLoop("m");
    }

    private static void whileLoop(String varName, int number) {
        int k = number > 0 ? number : 0;
        while (k < 10) {
            System.out.println(varName + " = " + k);
            k++;
        }
    }


    private static void doWhileLoop(String varName){
        int x = 0;
        do {
            System.out.println(varName + " = " + x);
            x++;
        }while (x<=10);
    }
}
