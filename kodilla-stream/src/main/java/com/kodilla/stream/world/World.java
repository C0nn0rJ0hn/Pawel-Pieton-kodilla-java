package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public final class World {

    private final Set<Continent> continentList = new HashSet<>();

    public void addContinentToList(Continent continent)
    {
        continentList.add(continent);
    }

    public BigDecimal getPeopleQuantity()
    {
        BigDecimal totalPeople = continentList.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        return totalPeople;
    }
}
