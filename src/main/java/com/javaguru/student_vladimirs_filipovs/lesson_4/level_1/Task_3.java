package com.javaguru.student_vladimirs_filipovs.lesson_4.level_1;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
class Task_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter number 1 - 7 (int)");
        int numberDayOfTheWeek = scan.nextInt();

        if (numberDayOfTheWeek == 1) {
            System.out.println("Monday");
        } else if (numberDayOfTheWeek == 2) {
            System.out.println("Tuesday");
        } else if (numberDayOfTheWeek == 3) {
            System.out.println("Wednesday");
        } else if (numberDayOfTheWeek == 4) {
            System.out.println("Thursday");
        } else if (numberDayOfTheWeek == 5) {
            System.out.println("Friday");
        } else if (numberDayOfTheWeek == 6) {
            System.out.println("Saturday");
        } else if (numberDayOfTheWeek == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("You wrote different number, please restart program and write correct number (1 - 7)");
        }
    }
}
