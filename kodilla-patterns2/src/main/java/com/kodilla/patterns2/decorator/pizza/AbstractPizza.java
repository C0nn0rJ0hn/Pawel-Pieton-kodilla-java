package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class AbstractPizza implements Pizza {
    private final Pizza pizza;

    public AbstractPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public BigDecimal getCost() {
        return pizza.getCost();
    }

    @Override
    public String getDescription() {
        return pizza.getDescription();
    }
}
