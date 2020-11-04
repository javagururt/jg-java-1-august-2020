package com.javaguru.student_nikolajs_sersnovs.lesson_5.level_1_intern;

import com.javaguru.teacher.codereview.CodeReview;

/*
Найдите ошибку в программе и исправить её:

class ArrayLength3 {

    public static void main(String[] args) {
        int numbers = new int[2];
        System.out.println(numbers.length());
 */
@CodeReview(approved = true)
class ArrayLength3 {

    public static void main(String[] args) {
        int [] numbers = new int[2];
        System.out.println("Array Length = " + numbers.length);
    }

}
