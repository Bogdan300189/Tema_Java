package org.fasttrackit.course5.class_types;

public abstract class  FlyingAnimal {

    //can have
    public void flies(){
        System.out.println("Flaps Wings");

    }
    //can have
    //for abstract methods, we do not have a body
    //because we do not have a body ,  we cannot cal the method
    public abstract void createNest();
}
