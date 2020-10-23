package com.javaguru.student_igors_gergeleziu.lesson_5.level_4;

import java.util.Scanner;
import java.util.Random;

class Task_26 {
    public static void main(String[] args) {
        Task_26 array = new Task_26();
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Please enter size of array: ");
        int sizeOfArray = sc.nextInt();
        int arrayOfNumbers[] = new int[sizeOfArray];
        array.randomValuesOfArray(sizeOfArray, arrayOfNumbers, random);
        array.printArray(sizeOfArray, arrayOfNumbers);
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
}
