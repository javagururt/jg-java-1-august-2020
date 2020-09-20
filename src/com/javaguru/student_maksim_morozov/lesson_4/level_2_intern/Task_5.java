package com.javaguru.student_maksim_morozov.lesson_4.level_2_intern;

import java.util.Scanner;

class Task_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNumber = scan.nextInt();
        System.out.println("Enter the second number: ");
        int secondNumber = scan.nextInt();
        if (firstNumber>secondNumber) {
            System.out.println("Largest number = " + firstNumber);
        } else {
            System.out.println("Largest number = " + secondNumber);
        }
    }
}

