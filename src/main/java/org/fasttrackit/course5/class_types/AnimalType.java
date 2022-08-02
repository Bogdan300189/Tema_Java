package org.fasttrackit.course5.class_types;

public enum AnimalType {
    MAMAL("anywere there's land"),
    REPTILE("anywere there's heat"),
    INVERTEBRATES("in small places");

    private String usuallyFoundWhere;

    AnimalType(String found) {
        this.usuallyFoundWhere = found;
    }

    public String getUsuallyFoundWhere() {
        return usuallyFoundWhere;
    }
}
