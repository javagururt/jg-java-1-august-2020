/*
Написать программу, которая запрашивает у
пользователя
целое число и выводит на консоль
положительное оно или отрицательное.
 */
package com.javaguru.student_sergey_kazyanin.lesson_4.level_1_intern.Task_1;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
class InputConsole {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число:");
        int input = scan.nextInt();

        if(input >= 0) {
            System.out.println("Положительное число!");
        } else {
            System.out.println("Число отрицательное!");
        }
    }
}
