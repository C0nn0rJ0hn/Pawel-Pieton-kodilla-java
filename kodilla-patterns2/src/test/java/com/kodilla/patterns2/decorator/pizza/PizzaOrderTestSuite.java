package com.kodilla.patterns2.decorator.pizza;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class PizzaOrderTestSuite {

    @AfterEach
    public void afterEach() {
        System.out.println();
    }

    @Test
    public void testBasicPizzaWithSalamiAndFreshTomatoes() {
        //Given
        PizzaOrder pizza = new BasicPizzaOrder();
        pizza = new PizzaWithSalamiDecorator(pizza);
        pizza = new PizzaWithFreshTomatoesDecorator(pizza);

        //When
        BigDecimal theCost = pizza.getCost();
        String description = pizza.getDescription();
        System.out.println("Your pizza: " + description + "\n" + "Total cost: " + theCost);

        //Then
        assertEquals(new BigDecimal(20), theCost);
        assertEquals("Basic pizza(tomato sauce and cheese) + salami + fresh tomatoes", description);
    }

    @Test
    public void testBasicPizzaWithHamExtraCheeseFreshTomatoesAndArugula() {
        //Given
        PizzaOrder pizza = new BasicPizzaOrder();
        pizza = new PizzaWithHamDecorator(pizza);
        pizza = new PizzaWithExtraCheeseDecorator(pizza);
        pizza = new PizzaWithFreshTomatoesDecorator(pizza);
        pizza = new PizzaWithArugulaDecorator(pizza);

        //When
        BigDecimal theCost = pizza.getCost();
        String description = pizza.getDescription();
        System.out.println("Your pizza: " + description + "\n" + "Total cost: " + theCost);

        //Then
        assertEquals(new BigDecimal(29), theCost);
        assertEquals("Basic pizza(tomato sauce and cheese) + prosciutto crudo + parmigiano reggiano + fresh tomatoes + arugula", description);
    }

    @Test
    public void testBasicPizzaWithHamOlivesMushroomsAndOnion() {
        //Given
        PizzaOrder pizza = new BasicPizzaOrder();
        pizza = new PizzaWithHamDecorator(pizza);
        pizza = new PizzaWithOnionDecorator(pizza);
        pizza = new PizzaWithMushroomsDecorator(pizza);
        pizza = new PizzaWithOlivesDecorator(pizza);

        //When
        BigDecimal theCost = pizza.getCost();
        String description = pizza.getDescription();
        System.out.println("Your pizza: " + description + "\n" + "Total cost: " + theCost);

        //Then
        assertEquals(new BigDecimal(33), theCost);
        assertEquals("Basic pizza(tomato sauce and cheese) + prosciutto crudo + onion + mushrooms + olives", description);
    }

    @Test
    public void testBasicPizzaWithSalamiMushroomsOlivesOnionAndCorn() {
        //Given
        PizzaOrder pizza = new BasicPizzaOrder();
        pizza = new PizzaWithSalamiDecorator(pizza);
        pizza = new PizzaWithOnionDecorator(pizza);
        pizza = new PizzaWithMushroomsDecorator(pizza);
        pizza = new PizzaWithOlivesDecorator(pizza);
        pizza = new PizzaWithCornDecorator(pizza);

        //When
        BigDecimal theCost = pizza.getCost();
        String description = pizza.getDescription();
        System.out.println("Your pizza: " + description + "\n" + "Total cost: " + theCost);

        //Then
        assertEquals(new BigDecimal(36), theCost);
        assertEquals("Basic pizza(tomato sauce and cheese) + salami + onion + mushrooms + olives + corn", description);
    }
}
