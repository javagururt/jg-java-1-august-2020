package com.javaguru.student_igors_gergeleziu.lesson_5.level_2;

import java.util.Random;

class Task_12 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
       Random random = new Random();
        for (int i = 0; i < 3; i++) {
            numbers[i] = random.nextInt(101);
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("number[" + i + "] = " + numbers[i]);
        }
    }
}