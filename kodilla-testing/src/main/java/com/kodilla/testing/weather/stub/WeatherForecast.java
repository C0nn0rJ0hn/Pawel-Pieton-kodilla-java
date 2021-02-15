package com.kodilla.testing.weather.stub;

import java.util.HashMap;
import java.util.Map;

public class WeatherForecast {

    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast()
    {
        Map<String, Double> resultMap = new HashMap<>();

        for(Map.Entry<String, Double> temerature : temperatures.getTemperatures().entrySet())
        {
            //adding 1 celcius degree to current value
            //as a temporary weather forecast
            resultMap.put(temerature.getKey(), temerature.getValue() + 1.0);
        }
        return resultMap;
    }
}
