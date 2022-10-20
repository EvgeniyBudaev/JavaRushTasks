package com.javarush.task.sql.task10.task1010;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import java.util.List;

/*
task1010
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        getAll().forEach(System.out::println);
    }

    public static List<Employee> getAll() {
        try (Session session = MySessionFactory.getSessionFactory().openSession()) {
            NativeQuery<Employee> query =
                    session.createNativeQuery("select * from employee order by id", Employee.class);
            return query.list();
        }
    }
}