package com.javaguru.student_nikolajs_sersnovs.lesson_5.level_1_intern;

import com.javaguru.teacher.codereview.CodeReview;

/*
Найдите ошибку в программе и исправить её:

class ArrayDefinition4 {

    public static void main(String[] args) {
        int numbers = new {1, 2, 3};
 */
@CodeReview(approved = true)
class ArrayDefinition4 {

    public static void main(String[] args) {
        int [] numbers = new int [3];
    }

}

