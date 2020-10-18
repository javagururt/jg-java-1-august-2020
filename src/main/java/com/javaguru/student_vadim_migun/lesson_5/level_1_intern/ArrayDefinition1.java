package com.javaguru.student_vadim_migun.lesson_5.level_1_intern;

import com.javaguru.teacher.codereview.CodeReview;

/*
Найдите ошибку в программе и исправить её:

class ArrayDefinition1 {

    public static void main(String[] args) {
        int numbers = new int[];
    }

}

 */
@CodeReview(approved = true)
class ArrayDefinition1 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
    }

}
