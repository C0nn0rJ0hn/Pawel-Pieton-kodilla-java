package com.kodilla.good.patterns.challenges.flightSearch;

public class User
{
    private String name;
    private String surname;
    private Airport airport;

    public User(String name, String surname, Airport airport) {
        this.name = name;
        this.surname = surname;
        this.airport = airport;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Airport getAirport() {
        return airport;
    }
}
