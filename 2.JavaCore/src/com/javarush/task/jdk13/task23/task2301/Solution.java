package com.javarush.task.jdk13.task23.task2301;

/* 
Inner
*/

public class Solution {
    public InnerClass[] innerClasses = new InnerClass[2];

    public static void main(String[] args) {

    }

    public static Solution[] getTwoSolutions() {
        Solution[] sol = {new Solution(), new Solution()};
        sol[0].innerClasses[0] = sol[1].innerClasses[0] = new Solution().new InnerClass();
        sol[0].innerClasses[1] = sol[1].innerClasses[1] = new Solution().new InnerClass();

        return sol;
    }

    public class InnerClass {
    }
}
