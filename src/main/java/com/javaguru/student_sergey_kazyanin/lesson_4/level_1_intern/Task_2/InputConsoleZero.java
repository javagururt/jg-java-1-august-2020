/*
Написать программу, которая запрашивает у пользователя
целое число и выводит на консоль
положительное оно, отрицательное или равно нулю.
 */
package com.javaguru.student_sergey_kazyanin.lesson_4.level_1_intern.Task_2;

import com.javaguru.teacher.codereview.CodeReview;
import com.javaguru.teacher.codereview.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = true)
class InputConsoleZero {

    @CodeReviewComment(teacher = ">= можно исправить на >")
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число:");
        int input = scan.nextInt();

        if (input == 0) {
            System.out.println("Число равно 0!");
        } else if (input >= 0) {
            System.out.println("Положительное число!");
        } else {
            System.out.println("Число отрицательное!");
        }
    }
}
