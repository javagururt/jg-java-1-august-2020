package com.javaguru.student_igors_raginskis.lesson_2.level_3;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
class Task_9 {
    public static void main(String[] args) {
        System.out.println("Please, enter your number: ");

        Scanner scannerName = new Scanner(System.in);
        int userNumber = scannerName.nextInt();

        System.out.println("Multiplication table for your number:");

        System.out.println(userNumber + " * 2 = " + userNumber);
        System.out.println(userNumber + " * 2 = " + (userNumber * 2));
        System.out.println(userNumber + " * 3 = " + (userNumber * 3));
        System.out.println(userNumber + " * 4 = " + (userNumber * 4));
        System.out.println(userNumber + " * 5 = " + (userNumber * 5));
        System.out.println(userNumber + " * 6 = " + (userNumber * 6));
        System.out.println(userNumber + " * 7 = " + (userNumber * 7));
        System.out.println(userNumber + " * 8 = " + (userNumber * 8));
        System.out.println(userNumber + " * 9 = " + (userNumber * 9));
        System.out.println(userNumber + " * 10 = " + (userNumber * 10));
    }
}
