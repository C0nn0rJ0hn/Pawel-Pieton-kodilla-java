package com.kodilla.good.patterns.challenges.flightSearch;

public class Application
{
    public static void main(String[] args) {

        FlightList flightList = new FlightList();
        CreateUser createUser = new CreateUser();
        User user = createUser.create();

        SearchFlight searchFlight = new SearchFlight();
        searchFlight.searchFlightFrom(user, flightList);
        searchFlight.searchFlightTo(user, flightList);
        searchFlight.searchOneStopFlight(user, flightList);
    }
}
