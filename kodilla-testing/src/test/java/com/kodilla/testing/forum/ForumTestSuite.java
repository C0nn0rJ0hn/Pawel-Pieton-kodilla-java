package com.kodilla.testing.forum;

import com.kodilla.testing.user.SimpleUser;
import org.junit.jupiter.api.*;

@DisplayName("Forum Test Suite")
public class ForumTestSuite {

    @BeforeEach
    public void before()
    {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after()
    {
        System.out.println("Test Case: end");
        System.out.println();
    }

    @BeforeAll
    public static  void beforeAll()
    {
        System.out.println("Test Suite: begin");
        System.out.println();
    }

    @AfterAll
    public static void afterAll()
    {
        System.out.println();
        System.out.println("Test Suite: end");
    }

    @DisplayName("When create SimpleUser with realName, " + "then getRealName should return real user name")

    @Test
    void testCaseRealname()
    {
        //Given
        SimpleUser simpleUser = new SimpleUser("theForumUser", "John Smith");

        //When
        String result = simpleUser.getRealName();
        System.out.println("Testing " + result);

        //Then
        Assertions.assertEquals("John Smith", result);
    }

    @DisplayName("When created SimpleUser with name, " + "then getUsername should return correct name")

    @Test
    void testCaseUserName()
    {
        //Given
        SimpleUser simpleUser = new SimpleUser("theForumUser", "John Smith");

        //When
        String result = simpleUser.getUsername();
        String expectedResult = "theForumUser";

        //Then
        Assertions.assertEquals(expectedResult, result);
    }
}
