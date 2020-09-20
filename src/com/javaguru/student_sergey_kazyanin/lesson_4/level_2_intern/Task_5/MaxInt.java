/*
Написать программу, которая запрашивает у пользователя
два целых числа и выводит на консоль наибольшее из них.
Нельзя пользоваться классом Math, можно использовать только if else.
 */
package com.javaguru.student_sergey_kazyanin.lesson_4.level_2_intern.Task_5;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
class MaxInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите 1-ое число: ");
        int firstNumber = sc.nextInt();

        System.out.print("Введите 2-ое число: ");
        int secondNumber = sc.nextInt();

        if(firstNumber >= secondNumber) {
            System.out.println("Наибольшее число: " + firstNumber);
        } else {
            System.out.println("Наибольшее число: " + secondNumber);
        }

    }
}
