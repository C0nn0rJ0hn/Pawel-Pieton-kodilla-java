package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class Homework implements HomeworkObservable {
    private final List<HomeworkObserver> homeworkObservers;
    private final ArrayDeque<String> tasks;
    private final String name;

    public Homework(String name) {
        homeworkObservers = new ArrayList<>();
        tasks = new ArrayDeque<>();
        this.name = name;
    }

    public void addTask(String task) {
        tasks.offer(task);
        notifyObserver();
    }

    @Override
    public void registerObserver(HomeworkObserver homeworkObserver) {
        homeworkObservers.add(homeworkObserver);
    }

    @Override
    public void notifyObserver() {
        for (HomeworkObserver homeworkObserver : homeworkObservers) {
            homeworkObserver.update(this);
        }
    }

    @Override
    public void removeObserver(HomeworkObserver homeworkObserver) {
        homeworkObservers.remove(homeworkObserver);
    }

    public ArrayDeque<String> getTasks() {
        return tasks;
    }

    public String getName() {
        return name;
    }
}
