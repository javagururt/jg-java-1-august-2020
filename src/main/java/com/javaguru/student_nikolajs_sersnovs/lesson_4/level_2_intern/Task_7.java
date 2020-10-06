package com.javaguru.student_nikolajs_sersnovs.lesson_4.level_2_intern;
/*
Написать программу, которая запрашивает у пользователя
два целых числа и выводит на консоль:
- "Numbers are equals" - если числа равны
- "Numbers are different" - если числа не равны
 */

import com.javaguru.teacher.codereview.CodeReview;
import java.util.Scanner;

@CodeReview(approved = true)
class Task_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write first number (Integer): ");
        int firstNumber = scanner.nextInt();
        System.out.println("Please write second number (Integer): ");
        int secondNumber = scanner.nextInt();

        if (firstNumber == secondNumber) {
            System.out.println("Numbers are equals!");
        }
        else {
            System.out.println("Numbers are different!");

        }
    }
}
