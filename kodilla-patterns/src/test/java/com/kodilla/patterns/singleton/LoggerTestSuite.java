package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class LoggerTestSuite
{
    private static Logger logger;

    @BeforeAll
    public static void createLastLog()
    {
        logger = Logger.INSTANCE;
        logger.log("Log.log");
    }

    @Test
    void testGetLastLog()
    {
        //Given

        //When
        String log = logger.getLastLog();
        System.out.println("Recovered last log: " + log);

        //Then
        Assertions.assertEquals("Log.log", log);

    }
}
