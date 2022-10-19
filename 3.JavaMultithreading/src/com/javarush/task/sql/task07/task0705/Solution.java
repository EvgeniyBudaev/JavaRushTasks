package com.javarush.task.sql.task07.task0705;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
task0705
*/

public class Solution {

    public static String[] names;

    public static void main(String[] args) throws Exception {
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test",
                "root", "root");

        Statement statement = connection.createStatement();
        ResultSet results = statement.executeQuery("select min(distinct age) from employee");
        results.next();
        System.out.println(results.getInt(1));

        statement.close();
        connection.close();
    }
}
