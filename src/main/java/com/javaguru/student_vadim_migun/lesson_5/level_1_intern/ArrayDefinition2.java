package com.javaguru.student_vadim_migun.lesson_5.level_1_intern;

import com.javaguru.teacher.codereview.CodeReview;

/*
Найдите ошибку в программе и исправить её:

class ArrayDefinition2 {

    public static void main(String[] args) {
        int numbers = new byte[10];
    }

}
 */
@CodeReview(approved = true)
class ArrayDefinition2 {

    public static void main(String[] args) {
        byte[] numbers = new byte[10];
    }

}