package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task
{
    private final String taskName;
    private final String color;
    private final String whatToPaint;
    private boolean taskStatus;
    private String availableColor = "white";

    public PaintingTask(final String taskName, final String color, final String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public void executeTask() {
        System.out.println("Executing task: " + taskName);
        System.out.println("    The content of the task { Paint the " + whatToPaint + " with this color: " + color + " }");
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        if (availableColor.equals(color))
        {
            taskStatus = true;
        }
        else
        {
            System.out.println("We don't have this color at our store. Available color: " + availableColor);
            taskStatus = false;
        }
        return taskStatus;
    }
}
