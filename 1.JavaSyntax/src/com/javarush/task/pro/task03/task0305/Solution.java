package com.javarush.task.pro.task03.task0305;

import java.util.Scanner;

/* 
Три числа
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner =new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a==b)
        {
            if (a==c)
                System.out.print(a + " " + b + " " + c);
            else
                System.out.print(a + " " + b);
        }
        else
        {
            if (a==c)
                System.out.print(a + " " + c);
            if (b==c)
                System.out.print(b + " " + c);
        }
    }
}
