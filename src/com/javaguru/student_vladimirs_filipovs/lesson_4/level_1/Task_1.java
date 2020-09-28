package com.javaguru.student_vladimirs_filipovs.lesson_4.level_1;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
class Task_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please write any number (int): ");
        int number = scan.nextInt();

        if (number > 0) {
            System.out.println("This number is positive");
        }
        if (number < 0) {
            System.out.println("This number is negative");
        }
    }
}
