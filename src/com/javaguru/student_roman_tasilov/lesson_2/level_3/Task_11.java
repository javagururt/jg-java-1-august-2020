package com.javaguru.student_roman_tasilov.lesson_2.level_3;

import com.javaguru.teacher.codereview.CodeReview;
import com.javaguru.teacher.codereview.CodeReviewComment;

import java.util.Scanner;
@CodeReview(approved = true)
@CodeReviewComment(teacher = "можно проверить работу на числах 2, 2, 1. Где среднее не 1.0")
public class Task_11 {
    public static void main (String[] args) {
    System.out.println("Please enter first numbern int:");
    Scanner scFirst = new Scanner(System.in);
    System.out.println("Please enter second number int:");
        Scanner scSecond = new Scanner(System.in);
    System.out.println("Please enter third number int:");
        Scanner scThird = new Scanner(System.in);

    int firstNumber = scFirst.nextInt();
    int secondNumber = scSecond.nextInt();
    int thirdNumber = scThird.nextInt();

    double arithmeticMean = (firstNumber + secondNumber + thirdNumber) / 3;
    System.out.println("Arithmetic mean:" + arithmeticMean);

}}
