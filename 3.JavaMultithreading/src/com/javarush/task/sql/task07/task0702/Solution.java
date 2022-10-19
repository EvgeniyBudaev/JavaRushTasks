package com.javarush.task.sql.task07.task0702;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
task0702
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test",
                "root", "root");

        Statement statement = connection.createStatement();
        statement.executeQuery("select 7 * 8");

        statement.close();
        connection.close();
    }
}