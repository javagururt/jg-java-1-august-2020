package com.javaguru.student_vladimir_larin.lesson_4.level_1_intern;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
class Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println("Even number.");
        } else {
            System.out.println("Odd number.");
        }
    }
}