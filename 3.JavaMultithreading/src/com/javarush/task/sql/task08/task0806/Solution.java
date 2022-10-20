package com.javarush.task.sql.task08.task0806;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

/* 
task0806
*/

public class Solution {

    public static Set<Employee> employees = new HashSet<>();

    public static void main(String[] args) throws Exception {
        try (Connection connection =
                     DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
             Statement statement = connection.createStatement()) {
            ResultSet results = statement.executeQuery("SELECT * FROM employee");
            while (results.next()) {
                employees.add(new Employee(
                        results.getInt(1),
                        results.getString("name"),
                        results.getInt("age"),
                        results.getString("smth")));
            }
        }

        employees.forEach(System.out::println);
    }
}
