package com.company;

public class Syrup extends CondimentDecorator {
    Beverage beverage;

    public Syrup(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Syrup";
    }

    public double cost() {
        return 0.05 + beverage.cost();
    }
}
