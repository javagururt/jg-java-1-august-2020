package com.javaguru.student_ivan_shulga.lesson_5.level_1_intern;

import com.javaguru.teacher.codereview.CodeReview;

// Найдите ошибку в программе и исправить её:

@CodeReview(approved = true)
class ArrayLength1 {

    public static void main(String[] args) {
        int[] numbers = new int[2];
        System.out.println(numbers[1]);
    }

}
/*
до исправления
int numbers = new int[2];
System.out.println(numbers[-1]);
 */
