package com.javaguru.student_vadim_migun.lesson_6.level_2_intern;

import com.javaguru.teacher.codereview.CodeReview;

/*
Найдите логическую ошибку в программе и исправить её.
Программа должна выводить числа от 1 до 100 на консоль.

class WhileDefinition4 {

    public static void main(String[] args) {
        int i = 1;
        while (i <= 100) {
            System.out.println(i);
        }
        i++;
    }

}
 */
@CodeReview(approved = true)
class WhileDefinition4 {

    public static void main(String[] args) {
        int i = 1;
        while (i <= 100) {
            System.out.println(i);
            i++;
        }
    }

}