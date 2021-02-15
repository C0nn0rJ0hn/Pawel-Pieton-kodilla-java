package com.kodilla.testing.weather.stub;

import java.util.Map;

public interface Temperatures {

    //first element of the map is an idetifier of weather station
    //second element of the map is a temerature in celcius degrees
    Map<String, Double> getTemperatures();
}
