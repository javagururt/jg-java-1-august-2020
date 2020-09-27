package com.javaguru.student_ivan_shulga.lesson_5.level_1_intern;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ArrayLength2 {

    public static void main(String[] args) {
        int[] numbers = new int[2];
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]); // эту строку не стал исправлять, хороший пример, выводится два первых значения и вместо третьего ошибка java.lang.ArrayIndexOutOfBoundsException
    }

}

/*
Найдите ошибку в программе и исправить её:

class ArrayLength2 {

    public static void main(String[] args) {
        int numbers = new int[2];
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
    }

}
 */
