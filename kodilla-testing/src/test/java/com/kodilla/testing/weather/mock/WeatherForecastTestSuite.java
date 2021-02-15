package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@DisplayName("Weather Forecast Test Suite")
public class WeatherForecastTestSuite {

    private static int testCounter = 0;
    Map<String, Double> temperaturesMap;

    @BeforeAll
    public static void beforeAllTests()
    {
        System.out.println("Begining of tests");
        System.out.println();
    }

    @AfterAll
    public static void afterAllTests()

    {
        System.out.println("All tests are finished");
    }

    @BeforeEach
    public void beforeEachTests()
    {
        testCounter++;
        System.out.println("Preapering to execute test #" + testCounter);
        System.out.println();

        temperaturesMap = new HashMap<>();

        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
    }

    @Mock
    private Temperatures temperaturesMock;

    @DisplayName("Test calculate Forecast With Mock")
    @Test
    void testCalculateForecastWithMock()
    {
        //Given
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);

        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }

    @DisplayName("Test Average Temperature With Mock")
    @Test
    void testAverageTemperature()
    {
        //Given
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);

        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        double result = weatherForecast.averageTemperature();
        double expectedResult =  25.56;

        //Then
        Assertions.assertEquals(expectedResult, result);
    }

    @DisplayName("Test Median Temperature With Mock")
    @Test
    void testMedianTemperatures()
    {
        //Given
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);

        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        double result = weatherForecast.medianTemperature();
        double expectedResult = 25.5;

        //Then
        Assertions.assertEquals(expectedResult, result);
    }
}
