package com.javaguru.student_igors_jurkovs.lesson_4.level_2_intern;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;

/*
Написать программу, которая запрашивает у пользователя
два целых числа и выводит на консоль:
- "Numbers are equals" - если числа равны
- "Numbers are different" - если числа не равны
 */
@CodeReview(approved = true)
class EqualNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number:");
        int firstNumber = sc.nextInt();
        System.out.println("Please enter second number:");
        int secondNumber = sc.nextInt();
        if (firstNumber == secondNumber) {
            System.out.println("Numbers are equals");
        } else {
            System.out.println("Numbers are different");
        }
    }
}
