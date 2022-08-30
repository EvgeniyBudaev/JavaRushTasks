package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        //напишите тут ваш код
        grades.put("Student-1", 1.5);
        grades.put("Student-2", 2.5);
        grades.put("Student-3", 3.5);
        grades.put("Student-4", 4.5);
        grades.put("Student-5", 5.5);
    }
}
