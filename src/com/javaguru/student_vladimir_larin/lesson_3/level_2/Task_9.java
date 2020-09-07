package com.javaguru.student_vladimir_larin.lesson_3.level_2;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
class Task_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String userName = scanner.next();
        String greeting = "Hello " + userName + "!";
        System.out.println(greeting);
    }
}
