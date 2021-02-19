package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Array operations test suite")
public class ArrayOperationsTestSuite {


    @DisplayName("Test get average")
    @Test
    void testGetAverage()
    {
        //Given
        int[] tab = new int[20];

        for(int i = 0; i < tab.length; i++)
        {
            tab[i] = i + 1;
        }

        //When
        double result = ArrayOperations.getAverage(tab);

        //Then
        Assertions.assertEquals(10.5, result);
    }
}
