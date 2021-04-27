package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task
{
    private final String taskName;
    private final String where;
    private final String using;
    private boolean taskStatus;
    private String availableVehicle = "car";

    public DrivingTask(final String taskName, final String where, final String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public void executeTask() {
        System.out.println("Executing task: " + taskName);
        System.out.println("    The content of the task { Drive to " + where + " using " + using + " }");
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        if (using.equals(availableVehicle))
        {
            taskStatus = true;
        }
        else
        {
            System.out.println("This type of vehicle is not available right now");
            taskStatus = false;
        }
        return taskStatus;
    }
}
