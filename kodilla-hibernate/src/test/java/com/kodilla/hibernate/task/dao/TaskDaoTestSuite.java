package com.kodilla.hibernate.task.dao;

import com.kodilla.hibernate.task.Task;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

@SpringBootTest
public class TaskDaoTestSuite
{
    @Autowired
    private TaskDao taskDao;

    private static final String DESCRIPTION = "Test: Learn Hibernate";

    @Test
    void testTaskDaoSave()
    {
        //Given
        Task task = new Task(DESCRIPTION, 7);

        //When
        taskDao.save(task);

        //Then
        int id = task.getId();
        Optional<Task> readTask = taskDao.findById(id);
        Assertions.assertTrue(readTask.isPresent());

        //Cleanup
        taskDao.deleteById(id);
    }

    @Test
    void testTaskDaoFindByDuration()
    {
        //Given
        Task task = new Task(DESCRIPTION, 7);
        taskDao.save(task);
        int duration = task.getDuration();

        //When
        List<Task> readTasks = taskDao.findByDuration(duration);

        //Then
        Assertions.assertEquals(1, readTasks.size());

        //Cleanup
        int id = readTasks.get(0).getId();
        taskDao.deleteById(id);
    }
}
