package com.javaguru.student_igors_gergeleziu.lesson_5.level_2;

import java.util.Random;

class Task_14 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        double averageOfArrayNumbers = 0;
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            numbers[i] = random.nextInt(101);
        }
        for (int i = 0; i < 3; i++) {
            averageOfArrayNumbers += numbers[i];
            System.out.println("Number["+i+"] = " + numbers[i]);
        }
        System.out.println("Average of Array numbers = " + averageOfArrayNumbers/3);
    }
}
