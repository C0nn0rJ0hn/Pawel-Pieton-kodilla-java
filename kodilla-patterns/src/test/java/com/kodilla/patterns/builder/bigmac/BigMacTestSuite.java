package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BigMacTestSuite
{
    @Test
    void testBigMacNew()
    {
        //Given
        BigMac bigMac = new BigMac.BigMacBuilder()
                .bun("With sesame")
                .burgers(1)
                .sauce("Barbecue")
                .ingredient("Onion")
                .ingredient("Chilli")
                .ingredient("Cheese")
                .ingredient("Bacon")
                .ingredient("Salad")
                .ingredient("Cucumber")
                .build();
        System.out.println(bigMac);

        //When
        int howManyIngredients = bigMac.getIngredients().size();

        //Then
        Assertions.assertEquals(6, howManyIngredients);
        Assertions.assertEquals("Barbecue", bigMac.getSauce());
    }
}
