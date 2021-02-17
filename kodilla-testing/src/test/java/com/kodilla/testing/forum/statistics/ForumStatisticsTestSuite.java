package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@DisplayName("Forum Statistics Test Suite")
public class ForumStatisticsTestSuite {

    private static int testCounter = 0;
    private List<String> allUserNames;
    private List<Post> allPosts;
    private List<Comment> allComments;

    private List<Post> generateNPosts(int postsQuantity)
    {
        List<Post> postList = new ArrayList<>();

        for(int n = 0; n <= postsQuantity; n++)
        {
            Post thePost = new Post("Author" + n, "Post content" + n);
            postList.add(thePost);
        }
        return  postList;
    }

    private List<Comment> generateNComments(int commentsQuantity)
    {
        List<Comment> commentList = new ArrayList<>();

        for(int i = 0; i <= commentsQuantity; i++)
        {
            Comment theComment = new Comment("Author" + i, "Comment content" + i);
            commentList.add(theComment);
        }
        return  commentList;
    }

    private List<String> generateNNames(int namesQuantity)
    {
        List<String> forumUsersNames = new ArrayList<>();

        for(int j = 0; j < namesQuantity; j++)
        {
            forumUsersNames.add(j,"User");
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
        allUserNames = generateNNames(50);
        allComments = generateNComments(200);
        allPosts = generateNPosts(100);
    }

    @Mock private Statistics statisticsMock;

    /*@DisplayName("Test - Number of users")
    @Test
    void testNUmberOfUsers()
    {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        forumStatistics.calculateAdvStatistics(statisticsMock);



        when(statisticsMock.usersNames()).thenReturn(forumStatistics.getUsersList());


        //When
        forumStatistics.getUsersList();



        //Then
        Assertions.assertEquals(allUserNames.size(), forumStatistics.getUsersList().size());

    }

    @Test
    void testNumberOfPosts()
    {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();

        when(statisticsMock.postsCount()).thenReturn(allPosts.size());

        //When
        int postCount = forumStatistics.postsCount();

        //Then
        Assertions.assertEquals(allPosts.size(), postCount);
    }

    @Test
    void testNumberOfComments()
    {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);

        when(statisticsMock.commentsCount()).thenReturn(allComments.size());

        //When
        int commentCount = forumStatistics.commentsCount();

        //Then
        Assertions.assertEquals(allComments.size(), commentCount);
    }

    @Test
    void testAveragePostForUser()
    {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);


        //When
        double averagePostUser = forumStatistics.averagePostsForUser();

        //Then
        Assertions.assertEquals(2,averagePostUser);
    }

    @Test
    void testAverageCommentForUser()
    {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);

        //When
        double averageCommentUser = forumStatistics.averageCommentsForUser();

        //Then
        Assertions.assertEquals(4, averageCommentUser);
    }

    @Test
    void testAerageCommentForPost()
    {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);

        //When
        double averageCommentPost = forumStatistics.averageCommentsForPost();

        //Then
        Assertions.assertEquals(2, averageCommentPost);
    }*/

}
