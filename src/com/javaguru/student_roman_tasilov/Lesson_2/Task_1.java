package com.javaguru.student_roman_tasilov.Lesson_2;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Task_1 {
    public static void main(String[] args) {
        int a = 74;
        int b = 36;
        int c = a + b;
        System.out.println(c);

        int d = 5;
        int e = 10;
        int f = e / d;
        System.out.println("Result:" + f);

        int g = f * c;
        System.out.println("g =" + g);

        int x = g - a;
        System.out.println(x);
    }
}
