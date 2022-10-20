package com.javarush.task.sql.task08.task0801;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
task0801
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
        connection.setAutoCommit(false);
        Statement statement = connection.createStatement();
        statement.executeUpdate("update employee set salary = salary + 2000 where name = 'Diego'");
        statement.executeUpdate("update employee set salary = salary + 500 where name = 'Amigo'");
        connection.commit();
        statement.close();
        connection.close();
    }
}
