package com.javarush.task.pro.task04.task0410;

import java.util.Scanner;

/* 
Второе минимальное число из введенных
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int firstMinimum = Integer.MAX_VALUE;
        int secondMinimum = Integer.MAX_VALUE;

        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number < firstMinimum) {
                secondMinimum = firstMinimum;
                firstMinimum = number;
            } else if (number > firstMinimum && number <= secondMinimum){
                secondMinimum = number;
            }
        }

        System.out.println(secondMinimum);
    }
}