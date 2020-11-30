package main.java.com.javaguru.student_anastasija_meiksane.lesson_5.level_1_intern;

import com.javaguru.teacher.codereview.CodeReview;
import com.javaguru.teacher.codereview.CodeReviewComment;

/*
    Найдите ошибку в программе и исправить её:

class ArrayDefinition1 {

    public static void main(String[] args) {
        int numbers = new int[];
    }

}

     */
@CodeReview(approved = true)
@CodeReviewComment(teacher = "level 1 approved")
class ArrayDefinition1 {

        public static void main(String[] args) {
            int[] numbers = new int[0];
        }

    }


