package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@DisplayName("Forum Statistics Test Suite")
public class ForumStatisticsTestSuite {

    private static int testCounter = 0;
    private List<String> emptyUserList;
    private List<String> listOf100Users;

    private List<String> generateNNames(int namesQuantity)
    {
        List<String> forumUsersNames = new ArrayList<>();
        for(int j = 1; j <= namesQuantity; j++)
        {
            forumUsersNames.add("User" + j);
        }
        return forumUsersNames;
    }

    @BeforeAll
    public static void beforeAllTests()
    {
        System.out.println("Beginnig of tests");
    }

    @AfterAll
    public static void afterAllTests()
    {
        System.out.println("All test are finished");
    }

    @BeforeEach
    public void beforeEachTest()
    {
        testCounter++;
        System.out.println("Preapering to execute test #" + testCounter);
        System.out.println();
        emptyUserList = new ArrayList<>();
        listOf100Users = generateNNames(100);
    }

    @Mock private Statistics statisticsMock;

    @DisplayName("Tests for 100 users")
    @Nested
    class TestsFor100Users {

        @DisplayName("Test: Calculate advance statistics with 0 posts")
        @Test
        void testCalculateAdvStatisticsWith0PostsAnd100Users() {
            //Given
            ForumStatistics forumStatistics = new ForumStatistics();

            when(statisticsMock.usersNames()).thenReturn(listOf100Users);
            when(statisticsMock.postsCount()).thenReturn(0);
            //When
            forumStatistics.calculateAdvStatistics(statisticsMock);
            forumStatistics.getAveragePost(statisticsMock);
            double result = forumStatistics.averagePosts;

            //Then
            Assertions.assertEquals(0, result);
        }

        @DisplayName("Test: Calculate advance statistics with 1000 posts")
        @Test
        void testCalculateAdvStatisticsWith1000PostsAnd100Users() {
            //Given
            ForumStatistics forumStatistics = new ForumStatistics();

            when(statisticsMock.usersNames()).thenReturn(listOf100Users);
            when(statisticsMock.postsCount()).thenReturn(1000);
            //When
            forumStatistics.calculateAdvStatistics(statisticsMock);
            forumStatistics.getAveragePost(statisticsMock);
            double result = forumStatistics.averagePosts;


            //Then
            Assertions.assertEquals(10, result);
        }

        @DisplayName("Test: Calculate advance statistics with 0 comments")
        @Test
        void testCalculateAdvStatisticsWith0CommentsAnd100Users() {
            //Given
            ForumStatistics forumStatistics = new ForumStatistics();

            when(statisticsMock.usersNames()).thenReturn(listOf100Users);
            when(statisticsMock.commentsCount()).thenReturn(0);
            //When
            forumStatistics.calculateAdvStatistics(statisticsMock);
            forumStatistics.getAverageComment(statisticsMock);
            double result = forumStatistics.averageComments;

            //Then
            Assertions.assertEquals(0, result);
        }
    }

    @DisplayName("Tests for 0 users")
    @Nested
    class TestsFor0Users {

        @DisplayName("Test: Calculate advance statistics with 0 posts")
        @Test
        void testCalculateAdvStatisticsWith0PostsAnd0Users() {
            //Given
            ForumStatistics forumStatistics = new ForumStatistics();

            when(statisticsMock.usersNames()).thenReturn(emptyUserList);
            when(statisticsMock.postsCount()).thenReturn(0);
            //When
            forumStatistics.calculateAdvStatistics(statisticsMock);
            forumStatistics.getAveragePost(statisticsMock);
            double result = forumStatistics.averagePosts;

            //Then
            Assertions.assertEquals(0, result);
        }

        @DisplayName("Test: Calculate advance statistics with 1000 posts")
        @Test
        void testCalculateAdvStatisticsWith1000PostsAnd0Users() {
            //Given
            ForumStatistics forumStatistics = new ForumStatistics();

            when(statisticsMock.usersNames()).thenReturn(emptyUserList);
            when(statisticsMock.postsCount()).thenReturn(1000);
            //When
            forumStatistics.calculateAdvStatistics(statisticsMock);
            forumStatistics.getAveragePost(statisticsMock);
            double result = forumStatistics.averagePosts;

            //Then
            Assertions.assertEquals(0, result);
        }

        @DisplayName("Test: Calculate advance statistics with 0 comments")
        @Test
        void testCalculateAdvStatisticsWith0CommentsAnd0Users() {
            //Given
            ForumStatistics forumStatistics = new ForumStatistics();

            when(statisticsMock.usersNames()).thenReturn(emptyUserList);
            when(statisticsMock.commentsCount()).thenReturn(0);
            //When
            forumStatistics.calculateAdvStatistics(statisticsMock);
            forumStatistics.getAverageComment(statisticsMock);
            double result = forumStatistics.averageComments;

            //Then
            Assertions.assertEquals(0, result);
        }
    }

    @DisplayName("Test using only posts and comments")
    @Nested
    class TestsForPostAndComments {
        @DisplayName("Test: Calculate advance statistics with less comments then posts")
        @Test
        void testCalculateAdvStatisticsWithLessCommentsThenPosts() {
            //Given
            ForumStatistics forumStatistics = new ForumStatistics();

            when(statisticsMock.commentsCount()).thenReturn(200);
            when(statisticsMock.postsCount()).thenReturn(400);
            //When
            forumStatistics.calculateAdvStatistics(statisticsMock);
            forumStatistics.getAverageCommentsForPost(statisticsMock);
            double result = forumStatistics.averageCommentsForPost;
            forumStatistics.showStatistics();

            //Then
            Assertions.assertEquals(0.5, result);
        }

        @DisplayName("Test: Calculate advance statistics with less posts then comments")
        @Test
        void testCalculateAdvStatisticsWithLessPostsThenComments() {
            //Given
            ForumStatistics forumStatistics = new ForumStatistics();

            when(statisticsMock.commentsCount()).thenReturn(600);
            when(statisticsMock.postsCount()).thenReturn(200);
            //When
            forumStatistics.calculateAdvStatistics(statisticsMock);
            forumStatistics.getAverageCommentsForPost(statisticsMock);
            double result = forumStatistics.averageCommentsForPost;
            forumStatistics.showStatistics();

            //Then
            Assertions.assertEquals(3, result);
        }
    }
}
