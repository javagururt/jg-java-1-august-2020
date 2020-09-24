package com.javaguru.student_vladimirs_filipovs.lesson_5.level_4;

import java.util.Arrays;
import java.util.Scanner;

class Task_25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter arrays length");
        int arraysLength = scan.nextInt();

        int[] array = new int[arraysLength];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Please enter number: ");
            array[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(array));
    }
}
