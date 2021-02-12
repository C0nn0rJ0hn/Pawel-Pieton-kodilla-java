package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@DisplayName("Collection Test Suite")
public class CollectionTestSuite {

    @BeforeEach
    public void before()
    {
        System.out.println("Test case: begin");
    }

    @AfterEach
    public void after()
    {
        System.out.println("Test case: end");
        System.out.println();
    }

    @DisplayName("When creating empty list \"numbers\" then \"exterminator\" should by empty as well")
    @Test
    void testOddNumbersExterminatorEmptyList()
    {
        //Given
        List<Integer> numbers = new ArrayList<>();
        OddNumbersExterminator exterminator = new OddNumbersExterminator();

        //When
        List<Integer> result = exterminator.exterminate(numbers);

        //Then
        Assertions.assertEquals(result, numbers);
    }

    @DisplayName("When creating list \"numbers\" with odd and even numbers then \"exterminator\" " +
            "should gave us a new list with only even numbers")
    @Test
    void testOddNumbersExterminatorNormalList()
    {
        //Given
        List<Integer> numbers = Arrays.asList(1, 4, 7, 10, 21, 34);
        OddNumbersExterminator exterminator = new OddNumbersExterminator();


        //When
        List<Integer> result = exterminator.exterminate(numbers);

        //Then
        Assertions.assertEquals(result.size(), 3);
        Assertions.assertEquals(result.get(1), 10);
    }
}
