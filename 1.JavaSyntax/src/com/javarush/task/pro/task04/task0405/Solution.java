package com.javarush.task.pro.task04.task0405;

/* 
Незаполненный прямоугольник
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
            int row = 10;
            int col = 20;
            int n = 0;

            while (n < row) {
                int m = 0;

                while (m < col) {
                    if (n == 0) {
                        System.out.print("Б");
                    }
                    int c = 1;
                    while(c != row-1) {
                        if (n == c) {
                            if (m == 0 || m == col-1) {
                                System.out.print("Б");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        c++;
                    }
                    if (n == row - 1) {
                        System.out.print("Б");
                    }
                    m++;
                }

                System.out.println();
                n++;
            }
    }
}