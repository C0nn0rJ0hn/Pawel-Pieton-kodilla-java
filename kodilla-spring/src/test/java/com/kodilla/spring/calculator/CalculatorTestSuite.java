package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CalculatorTestSuite
{
    @Autowired
    private Calculator calculator;

    @Test
    void testCalculations()
    {
        //Given
        double a = 10;
        double b = 2;

        /*ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);*/

        //When
        double add = calculator.add(a, b);
        double sub = calculator.sub(a, b);
        double mul = calculator.mul(a, b);
        double div = calculator.div(a, b);

        //Then
        Assertions.assertEquals(12, add);
        Assertions.assertEquals(8, sub);
        Assertions.assertEquals(20, mul);
        Assertions.assertEquals(5, div);
    }
}
