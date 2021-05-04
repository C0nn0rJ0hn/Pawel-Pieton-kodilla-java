package com.kodilla.jdbc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbManagerTestSuite
{
    @Test
    void testConnect() throws SQLException
    {
        //Given

        //When
        DbManager dbManager = DbManager.getInstance();
        //Then
        Assertions.assertNotNull(dbManager.getConnection());
    }

    @Test
    void testSelectUsers() throws SQLException
    {
        //Given
        DbManager dbManager = DbManager.getInstance();

        //When
        String sqlQuery = "SELECT * FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet resultSet = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while (resultSet.next())
        {
            System.out.println(resultSet.getInt("ID") + " " + resultSet.getString("FIRSTNAME") +
                    " " + resultSet.getString("LASTNAME"));
            counter++;
        }
        resultSet.close();
        statement.close();
        Assertions.assertEquals(5, counter);
    }
}
