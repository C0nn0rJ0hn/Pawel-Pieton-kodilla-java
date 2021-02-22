package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;

public class ForumStatistics {

    public List<String> userCount = new ArrayList<>();
    public int postCount;
    public int commentCount;
    public double averagePosts;
    public double averageComments;
    public double averageCommentsForPost;


    public void calculateAdvStatistics(Statistics statistics)
    {
        userCount = statistics.usersNames();
        postCount = statistics.postsCount();
        commentCount = statistics.commentsCount();
    }

    public void getAveragePost(Statistics statistics)
    {
        if(statistics.usersNames().size() != 0)
        {
            averagePosts = ((double)statistics.postsCount()) / statistics.usersNames().size();
        }
        else
        {
            System.out.println("Forum does not have any users yet");
        }
    }

    public void getAverageComment(Statistics statistics)
    {
        if(statistics.usersNames().size() != 0)
        {
            averageComments = ((double)statistics.commentsCount()) / statistics.usersNames().size();
        }
        else
        {
            System.out.println("Forum does not have any users yet");
        }
    }

    public void getAverageCommentsForPost(Statistics statistics)
    {
        if(statistics.postsCount() != 0)
        {
            averageCommentsForPost = ((double)statistics.commentsCount()) / statistics.postsCount();
        }
        else
        {
            System.out.println("Forum does not have any posts yet");
        }
    }

    public void showStatistics()
    {
        System.out.println("Number of users: " + userCount.size());
        System.out.println("Number of all posts at forum: " + postCount);
        System.out.println("Number of all comments at forum: " + commentCount);
    }
}

