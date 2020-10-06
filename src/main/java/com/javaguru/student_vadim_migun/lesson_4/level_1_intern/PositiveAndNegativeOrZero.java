package com.javaguru.student_vadim_migun.lesson_4.level_1_intern;
/*
Написать программу, которая запрашивает у пользователя
целое число и выводит на консоль
положительное оно, отрицательное или равно нулю.
 */
import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
class PositiveAndNegativeOrZero {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input integer number: ");
        int number = scan.nextInt();
        System.out.println("Number = " + number);

        if (number > 0) {
            System.out.println("the number is positive");
        } else if (number < 0) {
            System.out.println("the number is negative");
        } else {

            System.out.println("the number = 0");

        }
    }
}
