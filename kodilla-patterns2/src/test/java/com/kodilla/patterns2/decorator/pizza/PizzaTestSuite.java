package com.kodilla.patterns2.decorator.pizza;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class PizzaTestSuite {

    @AfterEach
    public void afterEach() {
        System.out.println();
    }

    @Test
    public void testMargheritaWithSalamiAndFreshTomatoes() {
        //Given
        Pizza pizza = new Margherita();
        pizza = new SalamiDecorator(pizza);
        pizza = new FreshTomatoesDecorator(pizza);

        //When
        BigDecimal theCost = pizza.getCost();
        String description = pizza.getDescription();
        System.out.println("Your pizza: " + description + "\n" + "Total cost: " + theCost);

        //Then
        assertEquals(new BigDecimal(20), theCost);
        assertEquals("Margherita(tomato sauce and mozzarella cheese) + salami + fresh tomatoes", description);
    }

    @Test
    public void testMargheritaWithHamExtraCheeseFreshTomatoesAndArugula() {
        //Given
        Pizza pizza = new Margherita();
        pizza = new HamDecorator(pizza);
        pizza = new ExtraCheeseDecorator(pizza);
        pizza = new FreshTomatoesDecorator(pizza);
        pizza = new ArugulaDecorator(pizza);

        //When
        BigDecimal theCost = pizza.getCost();
        String description = pizza.getDescription();
        System.out.println("Your pizza: " + description + "\n" + "Total cost: " + theCost);

        //Then
        assertEquals(new BigDecimal(29), theCost);
        assertEquals("Margherita(tomato sauce and mozzarella cheese) + prosciutto crudo + parmigiano reggiano + fresh tomatoes + arugula", description);
    }

    @Test
    public void testMargheritaWithHamOlivesMushroomsAndOnion() {
        //Given
        Pizza pizza = new Margherita();
        pizza = new HamDecorator(pizza);
        pizza = new OnionDecorator(pizza);
        pizza = new MushroomsDecorator(pizza);
        pizza = new OlivesDecorator(pizza);

        //When
        BigDecimal theCost = pizza.getCost();
        String description = pizza.getDescription();
        System.out.println("Your pizza: " + description + "\n" + "Total cost: " + theCost);

        //Then
        assertEquals(new BigDecimal(33), theCost);
        assertEquals("Margherita(tomato sauce and mozzarella cheese) + prosciutto crudo + onion + mushrooms + olives", description);
    }

    @Test
    public void testMargheritaWithSalamiMushroomsOlivesOnionAndCorn() {
        //Given
        Pizza pizza = new Margherita();
        pizza = new SalamiDecorator(pizza);
        pizza = new OnionDecorator(pizza);
        pizza = new MushroomsDecorator(pizza);
        pizza = new OlivesDecorator(pizza);
        pizza = new CornDecorator(pizza);

        //When
        BigDecimal theCost = pizza.getCost();
        String description = pizza.getDescription();
        System.out.println("Your pizza: " + description + "\n" + "Total cost: " + theCost);

        //Then
        assertEquals(new BigDecimal(36), theCost);
        assertEquals("Margherita(tomato sauce and mozzarella cheese) + salami + onion + mushrooms + olives + corn", description);
    }
}
