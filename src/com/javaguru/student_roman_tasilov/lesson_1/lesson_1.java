package com.javaguru.student_roman_tasilov.lesson_1;

import com.javaguru.teacher.codereview.CodeReview;
import com.javaguru.teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(teacher = "Лучше создавать отдельные java файлы для различных классов")
public class lesson_1 {
    public static class Task_10 {

        public static void main(String[] args) {
    System.out.println("Hallo World");
    System.out.println("Roman");
        }
    }

    public static class Task_11 {

        public static void main(String[] args) {
            int a = 74;
            int b = 36;
            int c = a + b;
            System.out.println(c);

            int d = 74;
            int e = 36;
            int f = 10;
            int g = d + e + f;
            System.out.println("Result:" + g);
        }
    }
}
