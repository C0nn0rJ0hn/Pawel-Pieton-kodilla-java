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



}
