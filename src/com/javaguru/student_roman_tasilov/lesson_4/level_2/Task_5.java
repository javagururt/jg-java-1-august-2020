package com.javaguru.student_roman_tasilov.lesson_4.level_2;

import com.javaguru.teacher.codereview.CodeReview;
import java.util.Scanner;

/*Написать программу, которая запрашивает у пользователя
        два целых числа и выводит на консоль наибольшее из них.
        Нельзя пользоваться классом Math, можно использовать только if else.
*/
@CodeReview(approved = true)
class Task_5 {
    public static void main(String[] args) {
        System.out.println("Please enter first number int: ");
        Scanner scFirst = new Scanner(System.in);
        int firstNumber = scFirst.nextInt();
        System.out.println("Please enter second number:  ");
        Scanner scSecond = new Scanner(System.in);
        int secondNumber = scSecond.nextInt();
        if (firstNumber > secondNumber) {
            System.out.println(firstNumber +" is the lager of the two numbers");
        }
        else if (secondNumber > firstNumber) {
            System.out.println(secondNumber +" is the lager of the two numbers");
        }}

}
