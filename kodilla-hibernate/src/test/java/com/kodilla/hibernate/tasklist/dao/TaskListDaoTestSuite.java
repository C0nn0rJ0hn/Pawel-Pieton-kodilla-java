package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TaskListDaoTestSuite
{
    @Autowired
    private TaskListDao taskListDao;

    private static final String DESCRIPTION = "Description of list";
    private static final String LISTNAME = "Name of the List";

    @Test
    void testFindByListName()
    {
        //Given
        TaskList taskList = new TaskList(LISTNAME, DESCRIPTION);
        taskListDao.save(taskList);
        String listName = taskList.getListName();

        //When
        List<TaskList> readListName = taskListDao.findByListName(listName);

        //Then
        Assertions.assertEquals(1, readListName.size());

        //Cleanup
        int id = readListName.get(0).getId();
        taskListDao.deleteById(id);
    }
}
