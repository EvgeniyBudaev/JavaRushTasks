package com.javarush.task.sql.task07.task0701;

import java.sql.Connection;
import java.sql.DriverManager;

/*
task0701
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test",
                "root", "root");

        connection.close();
    }
}
