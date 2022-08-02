package org.fasttrackit.course4.statement;

public class ForStatement {
    public static void main(String[] args) {
// same thing as for below
       int k = 0;
       while (k < 10){
           System.out.println("k= " + k);
           k++;
       }
// sane thing as for below
        int t = 0;
       do {
           System.out.println("t = " +t);
           t++;
       }while (t<10);

        for(int i=0;i<10;i++){
            System.out.println("i= "+ i);
        }
    }
}
