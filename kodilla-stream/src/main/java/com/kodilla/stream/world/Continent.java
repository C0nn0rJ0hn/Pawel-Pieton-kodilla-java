package com.kodilla.stream.world;

import java.util.HashSet;
import java.util.Set;

public final class Continent {

    private final Set<Country> countryList = new HashSet<>();

    public void addCountryToList(Country country)
    {
        countryList.add(country);
    }

    public Set<Country> getCountries()
    {
        return countryList;
    }
}
