package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Task Factory Test Suite")
public class TaskFactoryTestSuite
{
    @AfterEach
    void afterEach()
    {
        System.out.println();
    }

    @Test
    @DisplayName("Test Shopping Task")
    void testShoppingTaskFactory() throws Exception {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task shopping = factory.makeTask(TaskFactory.SHOPPING);
        shopping.executeTask();

        //Then
        Assertions.assertEquals("Shopping", shopping.getTaskName());
        Assertions.assertEquals(true, shopping.isTaskExecuted());
    }

    @Test
    @DisplayName("Test Painting Task")
    void testPaintingTaskFactory() throws Exception {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task painting = factory.makeTask(TaskFactory.PAINTING);
        painting.executeTask();

        //Then
        Assertions.assertEquals("Painting", painting.getTaskName());
        Assertions.assertNotEquals(true, painting.isTaskExecuted());
    }

    @Test
    @DisplayName("Test Driving Task")
    void testDrivingTaskFactory() throws Exception {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task driving = factory.makeTask(TaskFactory.DRIVING);
        driving.executeTask();

        //Then
        Assertions.assertEquals("Driving", driving.getTaskName());
        Assertions.assertEquals(true, driving.isTaskExecuted());
    }

    @Test
    @DisplayName("Test Exception")
    void testException()
    {
        //Given
        TaskFactory factory = new TaskFactory();

        //When & Then
        try {
            Task working = factory.makeTask("Working");
            working.executeTask();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
