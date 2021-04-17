package com.kodilla.good.patterns.challenges.flightSearch;

public class CreateUser
{
    public User create()
    {
        String name = "John";
        String surname = "Connor";
        String departureAirport = "krakow";
        String arrivalAirport = "katowice";

        return new User(name, surname, new Airport(departureAirport, arrivalAirport));
    }
}
