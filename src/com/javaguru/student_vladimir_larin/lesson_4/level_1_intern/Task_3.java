package com.javaguru.student_vladimir_larin.lesson_4.level_1_intern;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = scanner.nextInt();
        if (num == 1) {
            System.out.println("Monday");
        }
        if (num == 2) {
            System.out.println("Tuesday");
        }
        if (num == 3) {
            System.out.println("Wednesday");
        }
        if (num == 4) {
            System.out.println("Thursday");
        }
        if (num == 5) {
            System.out.println("Friday");
        }
        if (num == 6) {
            System.out.println("Saturday");
        }
        if (num == 7) {
            System.out.println("Sunday");
        }
        if (num < 1 || num > 7) {
            System.out.println("There are only 7 days in a week.");
        }

    }
}