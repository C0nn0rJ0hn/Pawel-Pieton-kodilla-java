package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch
{
    Map<String, Boolean> flightMap;

    public FlightSearch(Map<String, Boolean> flightMap) {
        this.flightMap = flightMap;
    }

    public void findFlight(Flight flight) throws RouteNotFoundException
    {
        if (!flightMap.containsKey(flight.getDepartureAirport()) || !flightMap.containsKey(flight.getArrivalAirport()))
        {
            throw new RouteNotFoundException("Flight not found");
        }
        else if (!flightMap.get(flight.getArrivalAirport()) || !flightMap.get(flight.getDepartureAirport()))
        {
            throw new RouteNotFoundException("Some airports are currently unavailable");
        }
        else
        {
            System.out.println("Flight found!");
        }
    }
}
