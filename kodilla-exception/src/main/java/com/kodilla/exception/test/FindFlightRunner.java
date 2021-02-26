package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FindFlightRunner
{
    public static void main(String[] args) {

        Flight flight1 = new Flight("Sydney Airport", "Amsterdam Airport");
        Map<String, Boolean> flights = new HashMap<>();
        flights.put("Krakow Airport", true);
        flights.put("London Airport", false);
        flights.put("Warsaw Airport", false);
        flights.put("Barcelona Airport", true);
        flights.put("Sydney Airport", false);
        flights.put("Amsterdam Airport", true);
        flights.put("Rome Airport", true);
        flights.put("Budapest Airport", false);

        FlightSearch flightSearch = new FlightSearch(flights);

        try
        {
            flightSearch.findFlight(flight1);
        }
        catch (RouteNotFoundException re)
        {
            System.out.println("Please check if such airports are available. See the following message:" + "\n" + re);
        }
        finally {
            System.out.println("Searching of flight connection has been completed!");
        }
    }
}
