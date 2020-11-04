/*
Task_6
Найдите ошибку в программе и исправить её
 */
package com.javaguru.student_sergey_kazyanin.lesson_6.level_2_intern;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class WhileDefinition3 {

    public static void main(String[] args) {
        int i = 1;
        while (i <= 100){
            System.out.println(i);
            i++;
        }
    }
}
