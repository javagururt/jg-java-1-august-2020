package com.javaguru.student_nikolajs_sersnovs.lesson_5.level_3_junior;

import com.javaguru.teacher.codereview.CodeReview;

/*
Найдите ошибку в программе и исправить её:

class ForLoopDefinition1 {

    public static void main(String[] args) {
        for (int i; i < 10; i++) {
            System.out.println(i);
 */
@CodeReview(approved = true)
class ForLoopDefinition1 {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

}
