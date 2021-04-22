package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator
{
    @Autowired
    private Display display;

    public double add(double a, double b)
    {
        double add = a + b;
        display.displayValue(add);
        return add;
    }

    public double sub(double a, double b)
    {
        double sub = a - b;
        display.displayValue(sub);
        return sub;
    }

    public double mul(double a, double b)
    {
        double mul = a * b;
        display.displayValue(mul);
        return mul;
    }

    public double div(double a, double b)
    {
        double div = 0;
        if (b != 0)
        {
            div = a / b;
            display.displayValue(div);
        }
        return div;
    }
}
