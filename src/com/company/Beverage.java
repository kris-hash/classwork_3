package com.company;

public abstract class Beverage {
    String description = "Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
