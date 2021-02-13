package com.kodilla.testing.forum.tdd;

import com.kodilla.testing.forum.ForumComment;
import com.kodilla.testing.forum.ForumPost;
import com.kodilla.testing.forum.ForumUser;
import org.junit.jupiter.api.*;

@DisplayName("TDD: Forum Test Suite")
public class ForumTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests()
    {
        System.out.println("This is the beginning of tests.");
        System.out.println();
    }

    @AfterAll
    public static void afterAllTests()
    {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest()
    {
        testCounter++;
        System.out.println("Preapering to execute test #" + testCounter);
        System.out.println();
    }

    @Nested
    @DisplayName("Tests for posts")
    class TestPosts
    {

        @DisplayName("Test: Add new post")
        @Test
        void testAddPost()
        {
            //Given
            ForumUser forumUser = new ForumUser("mrsmith", "John Smith");

            //When
            forumUser.addPost("mrsmith", "Hello everyone, this is my first contribution here!");

            //Then
            Assertions.assertEquals(1, forumUser.getPostsQuantity());
        }

        @DisplayName("Test: Get Post")
        @Test
        void testGetPost()
        {
            //Given
            ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
            ForumPost thePost = new ForumPost("Hello everyone, this is my first contribution here!", "mrsmith");
            forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());

            //When
            ForumPost retrievedPost;
            retrievedPost = forumUser.getPost(0);

            //Then
            Assertions.assertEquals(thePost, retrievedPost);
        }

        @DisplayName("Test: Remove post that not exist")
        @Test
        void testRemovePostNotExisting()
        {
            //Given
            ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
            ForumPost thePost = new ForumPost("Hello everyone, this is my first contibution here!", "mrsmith");
            ForumComment theComment = new ForumComment(thePost, "Thank you for all good words!", "mrsmith");

            //When
            boolean result = forumUser.removePost(thePost);

            //Then
            Assertions.assertFalse(result);
        }

        @DisplayName("Test: Remove post")
        @Test
        void testRemovePost()
        {
            //Given
            ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
            ForumPost thePost = new ForumPost("Hello everyone, this is my first contibution here!", "mrsmith");
            forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());

            //When
            boolean result = forumUser.removePost(thePost);

            //Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(0, forumUser.getPostsQuantity());
        }
    }


    @Nested
    @DisplayName("Tests for comments")
    class TestComments
    {

        @DisplayName("Test: Add new comment")
        @Test
        void testAddComment()
        {
            //Given
            ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
            ForumPost thePost = new ForumPost("Hello everyone, this is my first contribution here!", "mrsmith");

            //when
            forumUser.addComment(thePost, "mrsmith", "Thank you for all good words!");

            //Then
            Assertions.assertEquals(1, forumUser.getCommentsQuantity());
        }

        @DisplayName("Test: Get comment")
        @Test
        void testGetComment()
        {
            //Given
            ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
            ForumPost thePost = new ForumPost("Hello everyone, this is my first contibution here!", "mrsmith");
            ForumComment theComment = new ForumComment(thePost, "Thank you for all good words!", "mrsmith");
            forumUser.addComment(thePost, theComment.getAuthor(), theComment.getCommentBody());

            //When
            ForumComment retrivedComment;
            retrivedComment = forumUser.getComment(0);

            //Then
            Assertions.assertEquals(theComment, retrivedComment);
        }

        @DisplayName("Test: Remove comment that not exist")
        @Test
        void testRemoveCommentNotExisting()
        {
            //Given
            ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
            ForumPost thePost = new ForumPost("Hello everyone, this is my first contibution here!", "mrsmith");
            ForumComment theComment = new ForumComment(thePost, "Thank you for all good words!", "mrsmith");

            //When
            boolean result = forumUser.removeComment(theComment);

            //Then
            Assertions.assertFalse(result);
        }

        @DisplayName("Test: Remove comment")
        @Test
        void testRemoveComment()
        {
            //Given
            ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
            ForumPost thePost = new ForumPost("Hello everyone, this is my first contibution here!", "mrsmith");
            ForumComment theComment = new ForumComment(thePost, "Than kyou for all good words!", "mrsmith");
            forumUser.addComment(thePost, theComment.getAuthor(), theComment.getCommentBody());

            //When
            boolean result = forumUser.removeComment(theComment);

            //Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(0, forumUser.getCommentsQuantity());
        }
    }
}
