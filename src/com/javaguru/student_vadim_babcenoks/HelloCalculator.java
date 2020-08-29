package com.javaguru.student_vadim_babcenoks;
/*Написать консольную программу, которая запрашивает у пользователя два целых числа и
выводит на консоль результаты: сложения, вычитания, умножения и деления.*/
import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
public class HelloCalculator {
    public static void main(String[] args) {
        Scanner value=new Scanner(System.in);
        int number1 = value.nextInt();
        int number2 = value.nextInt();
        System.out.println(number1+number2);
        System.out.println(number1-number2);
        System.out.println(number1/number2);
        System.out.println(number1*number2);
    }
}