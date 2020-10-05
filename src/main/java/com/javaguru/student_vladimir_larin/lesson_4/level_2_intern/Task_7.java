package com.javaguru.student_vladimir_larin.lesson_4.level_2_intern;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
class Task_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1:");
        int a = scanner.nextInt();
        System.out.println("Enter number 2:");
        int b = scanner.nextInt();
        if (a == b) {
            System.out.println("Numbers are equals.");
        } else {
            System.out.println("Numbers are different.");
        }
    }
}

