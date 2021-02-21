package com.kodilla.stream.portfolio;

import java.time.LocalDate;

public final class Task {

    private final String title;
    private final String description;
    private final User assignUser;
    private final User creator;
    private final LocalDate created;
    private final LocalDate deadline;

    public Task(final String title, final String description, final User assignUser, final User creator,
                final LocalDate created, final LocalDate deadline) {
        this.title = title;
        this.description = description;
        this.assignUser = assignUser;
        this.creator = creator;
        this.created = created;
        this.deadline = deadline;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public User getAssignUser() {
        return assignUser;
    }

    public User getCreator() {
        return creator;
    }

    public LocalDate getCreated() {
        return created;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", assignUser=" + assignUser +
                ", creator=" + creator +
                ", created=" + created +
                ", deadline=" + deadline +
                '}' + "\n";
    }
}
