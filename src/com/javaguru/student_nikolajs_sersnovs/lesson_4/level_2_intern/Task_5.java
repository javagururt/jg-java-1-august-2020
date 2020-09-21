package com.javaguru.student_nikolajs_sersnovs.lesson_4.level_2_intern;
/*
Написать программу, которая запрашивает у пользователя
два целых числа и выводит на консоль наибольшее из них.
Нельзя пользоваться классом Math, можно использовать только if else.
 */
import com.javaguru.teacher.codereview.CodeReview;
import java.util.Scanner;

@CodeReview(approved = true)
class Task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write first number (Integer): ");
        int firstNumber = scanner.nextInt();
        System.out.println("Please write second number (Integer): ");
        int secondNumber = scanner.nextInt();

        if (firstNumber > secondNumber){
            System.out.println("Max number are: " + firstNumber);
        }
        else if (secondNumber > firstNumber){
            System.out.println("Max number are: " + secondNumber);
        }
        else {
            System.out.println("Number are equal! ");
        }


    }
}
