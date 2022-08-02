package org.fasttrackit.course5.static_instance;

public class Dog {
    static int totalNumberOfDogs;// share between all objects
    String name;
    int numberOfLegs;

    public static int setTotalNumberOfDogs() {
        return totalNumberOfDogs;
    }

    public static void setTotalNumberOfDogs(int totalNumberOfDogs) {
        Dog.totalNumberOfDogs = totalNumberOfDogs;
    }

    public static int getTotalNumberOfDogs() {
        return totalNumberOfDogs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }
}
