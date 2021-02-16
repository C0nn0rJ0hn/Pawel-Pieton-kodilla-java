package com.kodilla.testing.forum.statistics;

import java.util.Objects;

public class Comment {

    private String author;
    private String commentBody;

    public Comment(String author, String commentBody) {
        this.author = author;
        this.commentBody = commentBody;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCommentBody() {
        return commentBody;
    }

    public void setCommentBody(String commentBody) {
        this.commentBody = commentBody;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comment comment = (Comment) o;
        return author.equals(comment.author) && commentBody.equals(comment.commentBody);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, commentBody);
    }
}
