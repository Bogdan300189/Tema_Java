package org.fasttrackit.course4.tema4;

public class HomeWork3_3 {
    public static void main(String[] args) {
        int r,sum=0,temp;
        int n=21; //It is the number variable to be checked for palindrome

        temp=n;
        while(n>0){
            r=n%10;  //getting remainder
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum)
            System.out.println(" palindrome number ");
        else
            System.out.println(" not palindrome ");
    }

    
}












