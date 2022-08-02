package org.fasttrackit.course5.static_instance;

public class DogRunner {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        dog1.setName("Lassie");
        dog1.setNumberOfLegs(4);
        dog1.setTotalNumberOfDogs(33);

        dog2.setName("Rex");
        dog2.setNumberOfLegs(3);
        dog2.setTotalNumberOfDogs(100);

        printDog(dog1);
        printDog(dog2);
    }
    static void printDog(Dog anyDog){
        System.out.println(" Dog's name " + anyDog.getName());
        System.out.println(" No legs: " +anyDog.getNumberOfLegs());
        System.out.println("Total no dogs: " + anyDog.getTotalNumberOfDogs());

    }
}
