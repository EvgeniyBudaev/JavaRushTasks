package com.javarush.task.pro.task12.task1210;

import java.util.ArrayList;

/* 
Переворачивание данных
*/

public class Solution {
    public static ArrayList<Integer> numbers = new ArrayList<>();

    public static void main(String[] args) {
        init();
        print();

        reverse();
        print();
    }

    public static void init() {
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
    }

    public static void reverse() {
        ArrayList<Integer> tempList = new ArrayList<>(10);
        for (int i = numbers.size(); i > 0; i--) {
            tempList.add(numbers.get(i - 1));
        }
        numbers = tempList;
    }

    private static void print() {
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
