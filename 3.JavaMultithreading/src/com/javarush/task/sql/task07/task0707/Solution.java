package com.javarush.task.sql.task07.task0707;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
task0707
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test",
                "root", "root");

        Statement statement = connection.createStatement();
        ResultSet results = statement.executeQuery("select name, weight from employee");

        while (results.next()) {
            Double weight = results.getDouble("weight");
            if (results.wasNull()) {
                weight = null;
            }

            System.out.println(results.getObject("name") + " " + weight);
        }
        statement.close();
        connection.close();
    }
}