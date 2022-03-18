package com.company;

public class Mocha extends CondimentDecorator {
    Beverage beverage; // переменная для ссылки, чтобы в объекте mocha хранилась ссылка на beverage

    public Mocha(Beverage beverage) {
        this.beverage = beverage; //  передаем ссылку на beverage при вызове конструктора
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    public double cost() {
        return 0.20 + beverage.cost();
    }
}
