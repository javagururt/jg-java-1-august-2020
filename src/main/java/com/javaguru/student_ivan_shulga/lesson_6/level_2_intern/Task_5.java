package com.javaguru.student_ivan_shulga.lesson_6.level_2_intern;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class WhileDefinition2 {

    public static void main(String[] args) {
        int i = 1;
        while (i <= 100) {
            System.out.println(i);
            i++;
        }
    }
}

/*
Найдите ошибку в программе и исправить её:

class WhileDefinition2 {

    public static void main(String[] args) {
        int i = 1;
        while (i <= 100)
            System.out.println(i);
            i++;
        }
    }

}
 */