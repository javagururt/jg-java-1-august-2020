package com.javaguru.student_ivan_shulga.lesson_4.level_2_intern;

import java.util.Scanner;

class Task_7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first number:");
        int firstNumber = scanner.nextInt();

        System.out.println("Please enter second number:");
        int secondNumber = scanner.nextInt();

        if (firstNumber > secondNumber || secondNumber > firstNumber) {
            System.out.println("Numbers are different");
        } else {
            System.out.println("Numbers are equals");
        }

    }

}
