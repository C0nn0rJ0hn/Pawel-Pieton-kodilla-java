package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {

    private final BigDecimal countryPeopleQuantity;

    public Country(final BigDecimal countryPeopleQuantity) {
        this.countryPeopleQuantity = countryPeopleQuantity;
    }

    public BigDecimal getPeopleQuantity() {

        return countryPeopleQuantity;
    }
}
