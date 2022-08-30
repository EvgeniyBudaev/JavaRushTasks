package com.javarush.task.pro.task05.task0505;

import java.util.Scanner;

/* 
Reverse
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] array = new int[N];

        for (int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }

        if (N % 2 != 0) {
            for (int k = 0; k < array.length; k++) {
                System.out.println(array[k]);
            }
        } else {
            for (int j = array.length - 1; j >= 0; j--) {
                System.out.println(array[j]);
            }
        }
    }
}
