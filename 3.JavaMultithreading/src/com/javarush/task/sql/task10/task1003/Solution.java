package com.javarush.task.sql.task10.task1003;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/* 
task1003
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        promoteAll();
    }

    public static void promoteAll() {
        //напишите тут ваш код
        try (Session session = MySessionFactory.getSessionFactory().openSession()) {
            Transaction tx = session.beginTransaction();
            Query query = session.createQuery("update Employee set smth = concat('senior ', smth)");
            query.executeUpdate();
            tx.commit();
        }
    }
}