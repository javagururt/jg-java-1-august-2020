package com.javaguru.student_Denis_Shlichkov.Lesson_2.level_2;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
public class Task_8 {
    public static void main(String[] args) {
        System.out.print("Input user name: ");
        Scanner in = new Scanner(System.in);
        String userName = in.next();
        System.out.println("Hello " + userName);
    }
}
