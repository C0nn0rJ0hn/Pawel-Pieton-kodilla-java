package com.kodilla.testing.weather.stub;

import java.util.*;

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

    public double averageTemperature()
    {
        double sumTemperature = 0;
        for(Map.Entry<String, Double> avgTemp : temperatures.getTemperatures().entrySet())
        {
            sumTemperature += avgTemp.getValue();
        }
        double averageTemp = sumTemperature / temperatures.getTemperatures().size();
        return averageTemp;
    }

    public double medianTemperature()
    {
        List<Double> allTemps = new ArrayList<>();
        double median = 0;

        for(Map.Entry<String, Double> medianTemp : temperatures.getTemperatures().entrySet())
        {
            allTemps.add(medianTemp.getValue());
        }

        Collections.sort(allTemps);

        for(int i = 0; i < allTemps.size(); i++)
        {
            if(allTemps.size() % 2 != 0)
            {
                median = allTemps.get(((allTemps.size())-1)/2);
            }
            else
            {
                double temp1 = allTemps.get(allTemps.size()/2);
                double temp2 = allTemps.get(allTemps.size()/2-1);
                median = (temp1 + temp2)/2;
            }
        }
        return median;
    }
}
