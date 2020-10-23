package com.javaguru.student_igors_gergeleziu.lesson_5.level_4;

import java.util.Random;

class Task_28 {
    public static void main(String[] args) {
        Task_28 array = new Task_28();
        Random random = new Random();
        int sizeOfArray = 10;
        int arrayOfNumbers[] = new int[sizeOfArray];
        array.randomValuesOfArray(sizeOfArray, arrayOfNumbers, random);
        array.printArray(sizeOfArray, arrayOfNumbers);
        array.minValueOfArray(sizeOfArray, arrayOfNumbers);
    }

    public void printArray(int size, int[] array) {
        for (int i = 0; i < size; i++) {
            System.out.println("ArrayOfNumbers[" + i + "] = " + array[i]);
        }
    }

    public void randomValuesOfArray(int size, int[] array, Random random) {
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(101);
        }
    }

    public void minValueOfArray(int size, int[] array) {
        int minValue = 101;
        for (int i = 0; i < size; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        System.out.println("Arrays min value = " + minValue);
    }
}
