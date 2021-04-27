package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("User Test Suite")
public class UserTestSuite
{
    @AfterEach
    void enter()
    {
        System.out.println();
    }

    @Test
    @DisplayName("Test Default Sharing Strategies")
    void testDefaultSharingStrategies()
    {
        //Given
        User steven = new Millenials("Steven Knight");
        User john = new YGeneration("John Connor");
        User jordan = new ZGeneration("Jordan Rodman");

        //When
        String stevenApp = steven.sharePost();
        System.out.println("Steven default social media app is " + stevenApp);
        String johnApp = john.sharePost();
        System.out.println("John default social media app is " + johnApp);
        String jordanApp = jordan.sharePost();
        System.out.println("Jordan default social media app is " + jordanApp);

        //Then
        Assertions.assertEquals("Facebook", stevenApp);
        Assertions.assertEquals("Twitter", johnApp);
        Assertions.assertEquals("Snapchat", jordanApp);
    }

    @Test
    @DisplayName("Test Individual Sharing Strategy")
    void testIndividualSharingStrategy()
    {
        //Given
        User jordan = new ZGeneration("Jordan Rodman");

        //When
        String jordanApp = jordan.sharePost();
        System.out.println("Jordan default social media app is " + jordanApp);
        jordan.setSocialPublisher(new TwitterPublisher());
        jordanApp = jordan.sharePost();
        System.out.println("Jordan new default social app is " + jordanApp);

        //Then
        Assertions.assertEquals("Twitter", jordanApp);
    }
}
