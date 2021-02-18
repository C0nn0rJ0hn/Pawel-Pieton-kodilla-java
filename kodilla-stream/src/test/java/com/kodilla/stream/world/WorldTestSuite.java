package com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity()
    {
        //Given
        Country poland = new Country(new BigDecimal("40000000"));
        Country germany = new Country(new BigDecimal("80000000"));
        Country czechRepublic = new Country(new BigDecimal("10000000"));

        Country usa = new Country(new BigDecimal("330000000"));
        Country canada = new Country(new BigDecimal("40000000"));
        Country mexico = new Country(new BigDecimal("125000000"));

        Country japan = new Country(new BigDecimal("125000000"));
        Country china = new Country(new BigDecimal("1400000000"));
        Country southKorea = new Country(new BigDecimal("50000000"));

        Continent europe = new Continent();
        europe.addCountryToList(poland);
        europe.addCountryToList(germany);
        europe.addCountryToList(czechRepublic);

        Continent northAmerica = new Continent();
        northAmerica.addCountryToList(usa);
        northAmerica.addCountryToList(canada);
        northAmerica.addCountryToList(mexico);

        Continent asia = new Continent();
        asia.addCountryToList(japan);
        asia.addCountryToList(china);
        asia.addCountryToList(southKorea);

        World world = new World();
        world.addContinentToList(europe);
        world.addContinentToList(northAmerica);
        world.addContinentToList(asia);

        //When
        BigDecimal result = world.getPeopleQuantity();

        //Then
        BigDecimal expextedResult = new BigDecimal("2200000000");
        Assertions.assertEquals(expextedResult, result);
    }
}
