package com.javaguru.student_vladimirs_filipovs.lesson_2.level_2;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
class Task_8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scan.next();

        System.out.println("Hello " + name + "!");
    }
}
