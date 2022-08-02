package org.fasttrackit.course5.init;

public class Cat {
    static int totalNumberOfCats;//A
    static{
        System.out.println(" A ");
    }
    String name;//B
    {
        System.out.println(" B ");
    }

    public Cat(){//C
        System.out.println(" C ");
    }
    public Cat(String givenName){//D
        this.name = name;
        System.out.println(" D ");
    }
}
