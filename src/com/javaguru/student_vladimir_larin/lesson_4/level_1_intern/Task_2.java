package com.javaguru.student_vladimir_larin.lesson_4.level_1_intern;

import java.util.Scanner;

class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = scanner.nextInt();
        if (num > 0) {
            System.out.println("Number is positive.");
        } else if (num < 0) {
            System.out.println("Number is negative.");
        } else {
            System.out.println("Number is zero.");
        }
    }
}
