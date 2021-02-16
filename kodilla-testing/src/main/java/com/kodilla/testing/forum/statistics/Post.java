package com.kodilla.testing.forum.statistics;

import java.util.Objects;

public class Post {

    private String author;
    private String postBody;

    public Post(String author, String postBody) {
        this.author = author;
        this.postBody = postBody;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPostBody() {
        return postBody;
    }

    public void setPostBody(String postBody) {
        this.postBody = postBody;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return author.equals(post.author) && postBody.equals(post.postBody);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, postBody);
    }
}
