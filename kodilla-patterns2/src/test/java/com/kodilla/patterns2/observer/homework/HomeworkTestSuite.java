package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeworkTestSuite {

    @Test
    void testUpdate() {
        //Given
        Mentor peter = new Mentor("Peter Parker");
        Mentor bucky = new Mentor("Bucky Barnes");
        Mentor tony = new Mentor("Tony Stark");
        Homework spring = new SpringWebTasks();
        Homework loops = new LoopsTasks();
        Homework collections = new CollectionsTasks();
        spring.registerObserver(tony);
        spring.registerObserver(peter);
        loops.registerObserver(bucky);
        loops.registerObserver(tony);
        loops.registerObserver(peter);
        collections.registerObserver(bucky);
        collections.registerObserver(tony);

        //When
        spring.addTask("Controller task");
        spring.addTask("Testing controller using Postman");
        spring.addTask("Rest template task");
        loops.addTask("For loop task");
        loops.addTask("While loop task");
        collections.addTask("Array List task");
        collections.addTask("Hash Set task");
        collections.addTask("Linked List task");

        //Then
        assertEquals(5, peter.getUpdateCount());
        assertEquals(5, bucky.getUpdateCount());
        assertEquals(8, tony.getUpdateCount());
    }
}
