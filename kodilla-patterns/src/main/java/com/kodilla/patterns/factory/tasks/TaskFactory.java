package com.kodilla.patterns.factory.tasks;

public final class TaskFactory
{
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskClass) throws Exception
    {
        switch (taskClass)
        {
            case SHOPPING:
                return new ShoppingTask("Shopping", "phones", 2);
            case PAINTING:
                return new PaintingTask("Painting", "green", "wall");
            case DRIVING:
                return new DrivingTask("Driving", "Barcelona", "car");
            default:
                throw new Exception("There is no such case");
        }
    }
}
