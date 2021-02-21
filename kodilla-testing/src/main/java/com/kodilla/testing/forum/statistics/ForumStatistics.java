package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;

public class ForumStatistics {

    public int userCount;
    public int postCount;
    public int commentCount;
    public double averagePosts;


    public void calculateAdvStatistics(Statistics statistics)
    {
        userCount = statistics.usersNames().size();
        postCount = statistics.postsCount();

    }

    public void lalala(Statistics statistics)
    {
        averagePosts = statistics.postsCount()/statistics.usersNames().size();
    }
}

