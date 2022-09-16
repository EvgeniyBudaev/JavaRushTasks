package com.javarush.task.jdk13.task28.task2811;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* 
Знакомство с Executors
*/

public class Solution {
    private static volatile int id = 1;

    public static void main(String[] args) throws InterruptedException {
        //напишите тут ваш код
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i = 1; i < 21; i++) {
            executor.submit(new Runnable() {
                @Override
                public void run() {
                    doExpensiveOperation(id++);
                }
            });
        }
        executor.shutdown();
        executor.awaitTermination(5, TimeUnit.SECONDS);

    }

    private static void doExpensiveOperation(int localID) {
        System.out.println(Thread.currentThread().getName() + ", localID=" + localID);
    }

}

