
    // In any class we have the following elements in this order:
    // 0. package declaration

package org.fasttrackit.course3;

    // 1. Import

import org.fasttrackit.course3.model.Car;

    // 2. Class name declaration
public class MyFirstClass {

    //3. Filds(Campuri,Proprietati)
    //4. Constructori
    //5. Methods


    public static void main(String[] args) {
        System.out.println("Hello world");

        //When creating(instantiating an object) we have 2 parts:
        //1. Declaration (Car mihneasLogan) is before '='
        //2. Initialization(new Car() ) is after '='

        Car mihneasCar = new Car();//first object
        Car ramonasCar = new Car();//second object
        Car paulsMaybach = new Car("Maybach");
        System.out.println("Paul are o masina de tip " + paulsMaybach.getBrand() + " si are " +paulsMaybach.getNumberofDoors() + " usi");

       // mihneasCar.brand = "Dacia";
       // ramonasCar.brand = "Audi";

        mihneasCar.setBrand("Dacia");
        ramonasCar.setBrand("Audi");

        //TODO TERMINA DE SCRIS CODUL


        System.out.println("Masina lui Mihnea este " +mihneasCar.getBrand());
        System.out.println("Masina lui Ramona este " + ramonasCar.getBrand());
        // System.out.println(mihneasCar.numberofDoors); // direct field access bad practice
        // System.out.println(mihneasCar.numberOfWheels);

        System.out.println("Oprire program");

        mihneasCar.driveItself(5);

        String returnedValueFromMethod =  mihneasCar.driveItself(  " Barcelona");
        System.out.println(returnedValueFromMethod);
    }
}
