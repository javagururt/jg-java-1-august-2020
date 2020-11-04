package com.javaguru.student_roman_tasilov.lesson_4.level_2;
/* Написать программу, которая запрашивает у пользователя
два целых числа и выводит на консоль:
- "Numbers are equals" - если числа равны
- "Numbers are different" - если числа не равны*/

import com.javaguru.teacher.codereview.CodeReview;
import java.util.Scanner;

@CodeReview(approved = true)
public class Task_7 {
    public static void main(String[] args) {
        System.out.println("Please enter first number int: ");
        Scanner scFirst = new Scanner(System.in);
        int firstNumber = scFirst.nextInt();
        System.out.println("Please enter second number:  ");
        Scanner scSecond = new Scanner(System.in);
        int secondNumber = scSecond.nextInt();
        if (firstNumber == secondNumber) {
            System.out.println("Numbers are equels");
        }
        else if (secondNumber != firstNumber) {
            System.out.println("Numbers are different");
        }}
}
