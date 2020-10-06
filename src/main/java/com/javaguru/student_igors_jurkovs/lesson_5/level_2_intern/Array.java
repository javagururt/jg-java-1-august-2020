package com.javaguru.student_igors_jurkovs.lesson_5.level_2_intern;

import com.javaguru.teacher.codereview.CodeReview;
import com.javaguru.teacher.codereview.CodeReviewComment;

/*
Написать программу, в которой:
 - создать массив целых чисел длиной 3,
 - заполнить каждую ячейку массива любым числом,
 - вывести значение каждой ячейки на консоль.
 */
/*
Написать программу, в которой:
 - создать массив целых чисел длиной 3,
 - заполнить каждую ячейку массива случайным числом,
 - вывести значение каждой ячейки на консоль.

 */
@CodeReview(approved = true)
@CodeReviewComment(teacher = "удобнее использовать Random")
class Array {
    public static void main(String[] args) {

        int numbers[] = new int[3];
        for(int i = 0; i < 3; i++) {
            numbers[i] =(int) (Math.random() * 10);
            System.out.println(numbers[i]);
        }

    }
}
