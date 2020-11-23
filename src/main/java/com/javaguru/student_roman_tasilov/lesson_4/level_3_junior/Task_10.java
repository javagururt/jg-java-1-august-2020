package com.javaguru.student_roman_tasilov.lesson_4.level_3_junior;
/* Написать программу, которая запрашивает у пользователя
три целых числа и выводит на консоль наибольшее из них.

PS: перед решением этой задачи распишите на бумаге
или в комментарии все возможные варианты (комбинации).
Это поможет вам правильно написать программу!
Нельзя пользоваться классом Math.*/

import com.javaguru.teacher.codereview.CodeReview;
import com.javaguru.teacher.codereview.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = true)
@CodeReviewComment(teacher = "можно упростить условия")
public class Task_10 {
    public static void main(String[] args) {
        System.out.println("Please enter first number int: ");
        Scanner scFirst = new Scanner(System.in);
        int firstNumber = scFirst.nextInt();
        System.out.println("Please enter second number:  ");
        Scanner scSecond = new Scanner(System.in);
        int secondNumber = scSecond.nextInt();
        System.out.println("Please enter third number:  ");
        Scanner scThird = new Scanner(System.in);
        int thirdNumber = scThird.nextInt();

        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            System.out.println(firstNumber);
        }
        else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
            System.out.println(secondNumber);}
        else {
            System.out.println(thirdNumber);
        }
    }
}
