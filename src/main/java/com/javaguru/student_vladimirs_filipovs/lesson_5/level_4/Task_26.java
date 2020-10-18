package com.javaguru.student_vladimirs_filipovs.lesson_5.level_4;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Random;
import java.util.Scanner;
@CodeReview(approved = true)
class Task_26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random randomGenerator = new Random();

        System.out.println("Please enter arrays length");
        int arraysLength = scan.nextInt();

        int[] array = new int[arraysLength];

        for (int i = 0; i < array.length; i++) {
            array[i] = randomGenerator.nextInt(99);
            System.out.println("index Nr." + (i) + " = " + array[i]);
        }
    }
}
