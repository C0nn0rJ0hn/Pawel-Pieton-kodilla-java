package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class ArugulaDecorator extends AbstractPizza {

    public ArugulaDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(2));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + arugula";
    }
}
