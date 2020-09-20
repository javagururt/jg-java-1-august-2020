package com.javaguru.student_vladimir_larin.lesson_5.level_2_intern;

import java.util.Scanner;

class Task_11 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Please enter number:");
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index = " + i);
            System.out.println("Value = " + numbers[i]);
        }
    }
}