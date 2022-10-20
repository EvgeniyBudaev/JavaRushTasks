package com.javarush.task.sql.task10.task1007;

import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

/* 
task1007
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        getIn(List.of("hr", "dev", "qa")).forEach(System.out::println);
    }

    public static List<Employee> getIn(List<String> in) {
        //напишите тут ваш код
        try (Session session = MySessionFactory.getSessionFactory().openSession()) {
            Query<Employee> query = session.createQuery(
                    "from Employee where smth in (:IN) order by age", Employee.class);
            query.setParameterList("IN", in);
            return query.list();
        }
    }
}