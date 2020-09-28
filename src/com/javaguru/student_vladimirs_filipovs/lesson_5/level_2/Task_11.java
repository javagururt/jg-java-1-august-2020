package com.javaguru.student_vladimirs_filipovs.lesson_5.level_2;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Arrays;
import java.util.Scanner;
@CodeReview(approved = true)
class Task_11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[3];

        System.out.println("Please enter first number");
        numbers[0] = scan.nextInt();
        System.out.println("Please enter second number");
        numbers[1] = scan.nextInt();
        System.out.println("Please enter third number");
        numbers[2] = scan.nextInt();

        System.out.println("Your numbers: " + Arrays.toString(numbers));
        // или можно так
        System.out.println("First number: " + numbers[0]);
        System.out.println("Second number: " + numbers[1]);
        System.out.println("Third number: " + numbers[2]);
    }
}

