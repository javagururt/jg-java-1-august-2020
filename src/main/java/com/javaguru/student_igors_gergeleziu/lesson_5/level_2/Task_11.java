package com.javaguru.student_igors_gergeleziu.lesson_5.level_2;

import java.util.Scanner;

class Task_11 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Please enter " + (i + 1) + " number: ");
            numbers[i] = sc.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("number[" + i + "] = " + numbers[i]);
        }
    }
}
