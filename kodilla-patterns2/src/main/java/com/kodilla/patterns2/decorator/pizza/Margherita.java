package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class Margherita implements Pizza {
    @Override
    public BigDecimal getCost() {
        return new BigDecimal(15);
    }

    @Override
    public String getDescription() {
        return "Margherita(tomato sauce and mozzarella cheese)";
    }
}
