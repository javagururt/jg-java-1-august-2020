package com.javaguru.student_nikolajs_sersnovs.lesson_5.level_2_intern;

import com.javaguru.teacher.codereview.CodeReview;

/*
Написать программу, в которой:
 - создать массив целых чисел длиной 3,
 - заполнить каждую ячейку массива любым числом,
 - вывести значение каждой ячейки на консоль.

 */
@CodeReview(approved = true)
class Task_10 {

    public static void main(String[] args) {
        int [] numbers = new int[3];
        numbers[0] = 3;
        numbers[1] = 6;
        numbers[2] = 9;

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
    }
}
