package com.javaguru.student_nikolajs_sersnovs.lesson_5.level_1_intern;
/*
Найдите ошибку в программе и исправить её:

class ArrayDefinition2 {

    public static void main(String[] args) {
        int numbers = new byte[10];
 */

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ArrayDefinition2 {

    public static void main(String[] args) {
        int [] numbers = new int[10];
    }

}
