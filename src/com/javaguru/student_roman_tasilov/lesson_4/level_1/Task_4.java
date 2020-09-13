package com.javaguru.student_roman_tasilov.lesson_4.level_1;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        System.out.println("Please enter number int: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println("It is event number");
        }
        else if (number % 2 != 0) {
            System.out.println("It is Odd number");
        }
}}
