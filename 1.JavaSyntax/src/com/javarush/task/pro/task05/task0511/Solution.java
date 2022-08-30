package com.javarush.task.pro.task05.task0511;

import java.util.Scanner;
import java.util.Arrays;

/* 
Создаем двумерный массив
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        multiArray = new int[N][];

        for (int i = 0; i < multiArray.length; i++) {
            int x = scanner.nextInt();
            multiArray[i] = new int[x];
        }
        System.out.println(Arrays.toString(multiArray));
    }
}
