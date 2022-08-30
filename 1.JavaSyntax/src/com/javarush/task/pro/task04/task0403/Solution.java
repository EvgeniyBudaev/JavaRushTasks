package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while(scanner.hasNextInt()){
            sum += scanner.nextInt();
        }
        
        System.out.println(sum);
    }
}