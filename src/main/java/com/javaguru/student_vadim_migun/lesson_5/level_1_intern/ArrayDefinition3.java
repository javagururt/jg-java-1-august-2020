package com.javaguru.student_vadim_migun.lesson_5.level_1_intern;

import com.javaguru.teacher.codereview.CodeReview;

/*
Найдите ошибку в программе и исправить её.
В переменная numbers должна ссылаться на массив целых чисел.

class ArrayDefinition3 {

    public static void main(String[] args) {
        boolean numbers = new int[10];
    }

}
 */
@CodeReview(approved = true)
class ArrayDefinition3 {

    public static void main(String[] args) {
        int[] numbers = new int[10];
    }

}