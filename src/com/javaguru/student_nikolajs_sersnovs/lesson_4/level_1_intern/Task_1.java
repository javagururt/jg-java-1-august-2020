package com.javaguru.student_nikolajs_sersnovs.lesson_4.level_1_intern;
/*
Написать программу, которая запрашивает у
пользователя
целое число и выводит на консоль
положительное оно или отрицательное.
 */

import com.javaguru.teacher.codereview.CodeReview;
import java.util.Scanner;

@CodeReview(approved = true)
class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write number (Integer): ");
        int number = scanner.nextInt();
        if (number >= 0){
            System.out.println("Number is positive");
        }
        else {
            System.out.println("Number is negative");
        }



        }

}

