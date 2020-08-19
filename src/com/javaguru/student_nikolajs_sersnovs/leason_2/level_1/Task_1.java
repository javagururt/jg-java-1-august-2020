package com.javaguru.student_nikolajs_sersnovs.leason_2.level_1;

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input first number:");
        int num1 = in.nextInt();
        System.out.println("Input second number:");
        int num2 = in.nextInt();
        System.out.println("Choose operation: \n + Addition \n - Subtraction \n * Multiplication \n / Division ");
        String option = in.nextLine();

    }
}
