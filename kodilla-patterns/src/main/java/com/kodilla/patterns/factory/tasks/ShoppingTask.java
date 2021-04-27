package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task
{
    private final String taskName;
    private final String whatToBuy;
    private final double quantity;
    private boolean taskStatus;
    private double quantityAtStore = 50;

    public ShoppingTask(final String taskName, final String whatToBuy, final double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public void executeTask() {
        System.out.println("Executing task: " + taskName);
        System.out.println("    The content of the task { Buy " + quantity + " " + whatToBuy + " }");
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        if (quantityAtStore >= quantity)
        {
            taskStatus = true;
        }
        else
        {
            System.out.println("Not enough quantity of this product to complete this task");
            taskStatus = false;
        }
        return taskStatus;
    }
}
