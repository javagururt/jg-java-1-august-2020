package com.javaguru.student_nikolajs_sersnovs.lesson_5.level_2_intern;

import com.javaguru.teacher.codereview.CodeReview;
import com.javaguru.teacher.codereview.CodeReviewComment;

import java.util.Random;

/*
Написать программу, в которой:
 - создать массив целых чисел длиной 3,
 - заполнить каждую ячейку массива случайным числом,
 - вывести значение каждой ячейки на консоль,
 - увеличить значение каждой ячейки на 2,
 - вывести значение каждой ячейки на консоль.
 */
@CodeReview(approved = true)
@CodeReviewComment(teacher = "переменные которые неиспользуются должны быть удалены")
class Task_15 {
    public static void main(String[] args) {
        int [] array = new int[3];
        int adding = 0;
        int adding2 = 0;
        int adding3 = 0;
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.println("Generated numbers: " + array[i]);
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] + 2;
            System.out.println("Generated numbers with adding + 2: " + array[i]);
        }

    }
}
