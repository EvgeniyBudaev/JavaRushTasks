package com.javarush.task.pro.task12.task1206;

import java.util.ArrayList;

/* 
Анализ строк
*/

public class Solution {
    public static void main(String[] args) {
        String string = "Думаю, это будет новой фичей." +
                "Только не говорите никому, что она возникла случайно.";

        System.out.println("Количество цифр в строке : " + countDigits(string));
        System.out.println("Количество букв в строке : " + countLetters(string));
        System.out.println("Количество пробелов в строке : " + countSpaces(string));
    }

    public static int countDigits(String string) {
        //напишите тут ваш код
        ArrayList<Character> list = new ArrayList<>();
        char[] charArray = string.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (Character.isDigit(charArray[i])) {
                list.add(charArray[i]);
            }
        }
        return list.size();
    }

    public static int countLetters(String string) {
        //напишите тут ваш код
        ArrayList<Character> list = new ArrayList<>();
        char[] charArray = string.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (Character.isLetter(charArray[i])) {
                list.add(charArray[i]);
            }
        }
        return list.size();
    }

    public static int countSpaces(String string) {
        //напишите тут ваш код
        ArrayList<Character> list = new ArrayList<>();
        char[] charArray = string.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (Character.isSpaceChar(charArray[i])) {
                list.add(charArray[i]);
            }
        }
        return list.size();
    }
}
