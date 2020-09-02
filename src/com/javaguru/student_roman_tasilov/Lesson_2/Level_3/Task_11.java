package com.javaguru.student_roman_tasilov.Lesson_2.Level_3;

import java.util.Scanner;

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
