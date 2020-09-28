package com.javaguru.student_vadim_migun.lesson_5.level_3_junior;

import com.javaguru.teacher.codereview.CodeReview;

/*
Найдите логическую ошибку в программе и исправить её:

class ForLoopDefinition4 {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i--) {
            System.out.println(i);
        }
    }

}

PS: программа должна выводить на консоль числа от 0 до 9.
 */
@CodeReview(approved = true)
class ForLoopDefinition4 {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

}
