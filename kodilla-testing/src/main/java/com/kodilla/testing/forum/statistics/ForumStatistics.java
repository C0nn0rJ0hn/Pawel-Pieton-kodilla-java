package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;

public class ForumStatistics {

    public List<String> usersList;
    public int postsCount;
    public int commentsCount;
    private Statistics statistics;

    public ForumStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public List<String> getUsersList() {
        return usersList;
    }

    public int getPostsCount() {
        return postsCount;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    /*public List<String> usersNames()
    {
        List<String> usersList;

        usersList = statistics.usersNames();

        return  usersList;
    }

    public int postsCount()
    {
        int posts = statistics.postsCount();
        return posts;
    }

    public int commentsCount()
    {
        int comments = statistics.commentsCount();
        return  comments;
    }*/

    /*public double averagePostsForUser()
    {
        return statistics.postsCount()/statistics.usersNames().size();
    }

    public double averageCommentsForUser()
    {
        return statistics.commentsCount()/statistics.usersNames().size();
    }

    public double averageCommentsForPost()
    {
        return  statistics.commentsCount()/statistics.postsCount();
    }*/

    public void calculateAdvStatistics(Statistics statistics)
    {
        usersList = statistics.usersNames();
    }
}

