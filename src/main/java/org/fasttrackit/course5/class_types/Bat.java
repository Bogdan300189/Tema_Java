package org.fasttrackit.course5.class_types;

public class Bat extends FlyingAnimal implements Living,Carnivore {
// a concrete class can extend 1 single other class
    // a concrete class can implements multiple interfaces
    @Override
    public void createNest() {

    }

    @Override
    public void eats() {

    }

    @Override
    public String talks() {
        return null;
    }
}
