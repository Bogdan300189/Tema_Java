package org.fasttrackit.course3.model;

public class Car {
    private String brand; //test value
    private int numberofDoors; // default to 0
    private Integer numberOfWheels; //default is null
    //model
    //color
    //numberOfWhells

    // default constructor, explicitly declared
    //has no return type(unlike a method)
    public Car() {
    }

    //another constructor
    public Car(String givenBrand) {
        brand = givenBrand;
    }


    public String driveItself(String location) {
        System.out.println("Vrummm Vrummm, mergem la " + location);
        return "Am ajuns la" + location;


    }

    // overloaded method
    public String driveItself(int numberOfKilometers) {
        return "Am condus " + numberOfKilometers + "km ";
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getNumberofDoors() {
        return numberofDoors;
    }

    public void setNumberofDoors(int numberofDoors) {
        this.numberofDoors = numberofDoors;
    }

    public Integer getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(Integer numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }
}

