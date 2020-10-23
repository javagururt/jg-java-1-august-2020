package com.javaguru.student_igors_gergeleziu.lesson_5.level_2;

import java.util.Random;

class Task_15 {
    public static void main(String[] args) {
        int sizeOfArray = 3;
        Task_15 array = new Task_15();
        int[] numbers = new int[sizeOfArray];
        Random random = new Random();
        for (int i = 0; i < sizeOfArray; i++) {
            numbers[i] = random.nextInt(101);
        }
        array.printArray(sizeOfArray, numbers);
        System.out.println("");
        for (int i = 0; i < sizeOfArray; i++) {
            numbers[i] += 2;
        }
        array.printArray(sizeOfArray, numbers);
    }

    public void printArray(int size, int[] arr) {
        for (int i = 0; i < size; i++) {
            System.out.println("Number[" + i + "] = " + arr[i]);
        }
    }
}
