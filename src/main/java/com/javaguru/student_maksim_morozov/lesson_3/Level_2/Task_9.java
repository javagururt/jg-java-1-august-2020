package com.javaguru.student_maksim_morozov.lesson_3.Level_2;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
class Task_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String userName = scanner.next();
        String greeting = "Hello " + userName + "!";
        System.out.println(greeting);
    }
}
