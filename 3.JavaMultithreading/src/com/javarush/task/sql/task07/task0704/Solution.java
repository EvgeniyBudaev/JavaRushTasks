package com.javarush.task.sql.task07.task0704;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
task0704
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test",
                "root", "root");

        Statement statement = connection.createStatement();
        ResultSet results = statement.executeQuery("select * from employee");

        while (results.next()) {
            System.out.println(results.getString("name"));
        }
        statement.close();
        connection.close();
    }
}