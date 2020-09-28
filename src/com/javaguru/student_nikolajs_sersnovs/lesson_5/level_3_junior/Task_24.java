package com.javaguru.student_nikolajs_sersnovs.lesson_5.level_3_junior;

import com.javaguru.teacher.codereview.CodeReview;

/*
Исправьте код таким образом, что бы программа
выводила на консоль числа от 0 до 100:

class ForLoopDefinition8 {

    public static void main(String[] args) {
        for ( ; ; ) {
            System.out.println(i);
 */
@CodeReview(approved = true)
class ForLoopDefinition9 {

    public static void main(String[] args) {
        for (int i = 0; i < 101;i++ ) {
            System.out.println(i);
        }
    }

}
