package com.javarush.task.pro.task05.task0508;

import java.util.Scanner;
import java.util.Objects;
import java.util.Arrays;

/* 
Удаляем одинаковые строки
*/

public class Solution {
    public static String[] strings;

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        strings = new String[6];
        
        for (int i = 0; i < strings.length; i++) {
            strings[i] = scanner.nextLine();
        }
        
      for (int i = 0; i < strings.length; i++) {
          String s = strings[i];
          if (strings[i]!=null) {
              for (int j = 0; j < strings.length; j++) {
                  if (s.equals(strings[j]) && i != j) {
                      strings[j] = null;
                      strings[i] = null;
                  }
              }
          }
          System.out.print(strings[i] + ", ");
      }
    }
}
