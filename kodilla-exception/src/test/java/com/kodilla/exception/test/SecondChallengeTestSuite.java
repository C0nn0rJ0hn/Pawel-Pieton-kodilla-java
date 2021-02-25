package com.kodilla.exception.test;

import org.junit.jupiter.api.*;

@DisplayName("Second Challenge Test Suite")
public class SecondChallengeTestSuite
{
    static int testCounter = 0;

    @BeforeAll
    public static  void beforeAllTests()
    {
        System.out.println("I'am starting tests");
        System.out.println();
    }

    @AfterAll
    public static void afterAllTest()
    {
        System.out.println("Tests completed");
    }

    @BeforeEach
    public void beforeEachTest()
    {
        testCounter++;
        System.out.println("Preapering to execute test #" + testCounter);
        System.out.println();
    }

    @DisplayName("Limit values for x and y without exception")
    @Test
    void testSecondChallengeLimitValuesWithoutException()
    {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        // When & Then
        Assertions.assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1, 1.51));
    }

    @DisplayName("Another limit values For x and y without exception")
    @Test
    void testSecondChallengeLimitValues2WithoutException()
    {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        // When & Then
        Assertions.assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.99, 1.49));
    }

    @DisplayName("Test 1: Limit values for x and y with exception")
    @Test
    void testSecondChallengeLimitValuesWithException()
    {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        // When & Then
        Assertions.assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2, 1.5));
    }

    @DisplayName("Test 2: Limit values for x and y with exception")
    @Test
    void testSecondChallengeLimitValues2WithException()
    {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        // When & Then
        Assertions.assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0.99, 7));
    }

    @DisplayName("Test 3: Limit values for x and y with exception")
    @Test
    void testSecondChallengeLimitValues3WithException()
    {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        // When & Then
        Assertions.assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2.1, 0));
    }
}
