/*
Найдите ошибку в программе и исправить её:

class ArrayDefinition1 {

    public static void main(String[] args) {
        int numbers = new int[];
    }

}

 */
package com.javaguru.student_sergey_kazyanin.lesson_5.level_1_intern;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ArrayDefinition1 {
    public static void main(String[] args) {
        int[] number = new int[3];
    }
}
