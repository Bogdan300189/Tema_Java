package org.fasttrackit.course4.operator;

public class RelationalOperatiors {
    public static void main(String[] args) {
        int op11 = 2;
        int op12 = 3;

        boolean  result1 = op11 > op12;
        System.out.println("Result of comparison: " + result1 );

        // In Java we have a String pool
        // When we declare a basic String(ex. "abc")
        // It is composed and taken from the pool
        String s1 = "abc";
        String s2 = "abc"; // This one is searched for in the String pool.(same memory zone, beacause Java default)
        boolean result2 = s1 == s2;
        System.out.println("Result2: " + result2); //true

        String s31 = "abc";
        String s32 = new String("abc");// here we explicity create a new object
        boolean result31 = s31==s32;//comparadison by equals(==) looks at the object references
        System.out.println("Result 3: " + result31);//false
        boolean result32 = s31.equals(s32);
        System.out.println("Result 4: " + result32);//true

        String s61 = "abc";
        String s62 = "abc";
        // boolean result6 = s61 > s62; //cannot aply to string

        //char c71 = "b";
        //char c72 = "a";
        //boolean result7 = c71 > c72; // This will decompose the chars into numbers and compare their number value
        //System.out.println("Result 7: " + result7);

        int op41 = 21;
        int op42 = 22;
        boolean result41 = op41 != op42;
        System.out.println("Result 5: " + result41);//true






    }

}
