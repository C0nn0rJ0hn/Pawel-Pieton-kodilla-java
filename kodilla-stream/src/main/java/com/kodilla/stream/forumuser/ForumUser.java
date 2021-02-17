package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {

    private final int uniqeUserId;
    private final String username;
    private final char sex;
    private final LocalDate birthDate;
    private final int numberOfPosts;

    public ForumUser(final int uniqeUserId, final String username, final char sex, final int yearBirthDate,
                     final int monthBirthDate, final int dayBirthDay, final int numberOfPosts) {
        this.uniqeUserId = uniqeUserId;
        this.username = username;
        this.sex = sex;
        this.birthDate = LocalDate.of(yearBirthDate, monthBirthDate, dayBirthDay);
        this.numberOfPosts = numberOfPosts;
    }

    public int getUniqeUserId() {
        return uniqeUserId;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "uniqeUserId=" + uniqeUserId +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", numberOfPosts=" + numberOfPosts +
                '}';
    }
}
