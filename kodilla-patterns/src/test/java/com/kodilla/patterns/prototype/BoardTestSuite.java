package com.kodilla.patterns.prototype;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

public class BoardTestSuite
{
    @Test
    void testToString()
    {
        //Given
        //creating the TasksList for to do
        TaskList listToDo = new TaskList("To Do List");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> listToDo.getTasks().add(new Task("To Do Task Number " + n)));

        //creating the TaskList for tasks in progress
        TaskList listInProgress = new TaskList("In Progress Tasks");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> listInProgress.getTasks().add(new Task("In Progress Task Number " + n)));

        //creating the TaskList for done tasks
        TaskList listDone = new TaskList("Done Tasks");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> listDone.getTasks().add(new Task("Done Task Number " + n)));

        //creating the board and assigning the lists
        Board board = new Board("Project number 1");
        board.getLists().add(listToDo);
        board.getLists().add(listInProgress);
        board.getLists().add(listDone);

        //making a shallow clone of object board
        Board clonedBoard = null;
        try
        {
            clonedBoard = board.shallowCopy();
            clonedBoard.setName("Project number 2");
        }
        catch (CloneNotSupportedException e)
        {
            System.out.println(e);
        }

        //making a deep copy of object board
        Board deepCloneBoard = null;
        try
        {
            deepCloneBoard = board.deepCopy();
            deepCloneBoard.setName("Project number 3");
        }
        catch (CloneNotSupportedException e)
        {
            System.out.println(e);
        }

        //When
        board.getLists().remove(listToDo);

        //Then
        System.out.println(board);
        System.out.println(clonedBoard);
        System.out.println(deepCloneBoard);
        Assertions.assertEquals(2, board.getLists().size());
        Assertions.assertEquals(2, clonedBoard.getLists().size());
        Assertions.assertEquals(3, deepCloneBoard.getLists().size());
        Assertions.assertEquals(clonedBoard.getLists(), board.getLists());
        Assertions.assertNotEquals(deepCloneBoard.getLists(), board.getLists());
    }
}
