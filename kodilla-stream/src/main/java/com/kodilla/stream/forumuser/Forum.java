package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> forumUserList = new ArrayList<>();

    public Forum()
    {
        forumUserList.add(new ForumUser(1, "RajK", 'M', 1988, 6, 30, 50));
        forumUserList.add(new ForumUser(2, "HowardW", 'M', 1995, 9, 15, 20));
        forumUserList.add(new ForumUser(3, "AnnaW", 'F', 2005, 2, 23, 30));
        forumUserList.add(new ForumUser(4, "ElonM", 'M', 1945, 4, 17, 0));
        forumUserList.add(new ForumUser(5, "LeonardH", 'M', 2010, 12, 23, 35));
        forumUserList.add(new ForumUser(6, "SheldonC", 'M', 2000, 7, 26, 44));
        forumUserList.add(new ForumUser(7, "KingaO", 'F', 1999, 5, 10, 23));
        forumUserList.add(new ForumUser(8, "AnitaZ", 'F', 1975, 1, 6, 0));
    }

    public List<ForumUser> getUserList()
    {
        return new ArrayList<>(forumUserList);
    }
}
