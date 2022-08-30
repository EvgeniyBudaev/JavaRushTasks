package com.javarush.task.jdk13.task06.task0625;

import java.util.Scanner;

/* 
Минимальная сумма
*/

public class Solution {
    public static int[][] array = new int[3][3];

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);

        int minSumLine = Integer.MAX_VALUE;
        int minSumColumn = Integer.MAX_VALUE;
        int sumLine = 0;
        int sumColumn = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sumLine += array[i][j];
            }
            if (sumLine < minSumLine) {
                minSumLine = sumLine;
            }
            sumLine = 0;
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sumColumn += array[j][i];
            }
            if (sumColumn < minSumColumn) {
                minSumColumn = sumColumn;
            }
            sumColumn = 0;
        }

        if (minSumColumn < minSumLine) {
            System.out.println(minSumColumn);
        }
        else {
            System.out.println(minSumLine);
        }
    }
}
