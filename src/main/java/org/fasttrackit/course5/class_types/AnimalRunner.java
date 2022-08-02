package org.fasttrackit.course5.class_types;

public class AnimalRunner {
    public static void main(String[] args) {
        Horse bojack = new Horse();
        System.out.println(bojack.talks());

        Living someBeing = new Living() {
            @Override
            public void eats() {
                System.out.println("alien food");

            }

            @Override
            public String talks() {
                return "brrrr";
            }
        };

        Living strangeAnimal = new Horse();
        strangeAnimal.eats();
        strangeAnimal.talks();
    }

}
