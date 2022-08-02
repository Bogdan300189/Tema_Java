package org.fasttrackit.course5.class_types.abstr;

public class ClassRunner {
    public static void main(String[] args) {
        AbstrClass obj1 = new ConcreteClass();

        obj1.doSomething();
        obj1.doSomethingElse();
    }
}
