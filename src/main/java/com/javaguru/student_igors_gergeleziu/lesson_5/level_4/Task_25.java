package com.javaguru.student_igors_gergeleziu.lesson_5.level_4;

import java.util.Scanner;

class Task_25 {
    public static void main(String[] args) {
        Task_25 array = new Task_25();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter size of array: ");
        int sizeOfArray = sc.nextInt();
        int arrayOfNumbers[] = new int[sizeOfArray];
        array.enterValuesOfArray(sizeOfArray, arrayOfNumbers, sc);
        System.out.println("");
        array.printArray(sizeOfArray, arrayOfNumbers);
    }

    public void printArray(int size, int[] array) {
        for (int i = 0; i < size; i++) {
            System.out.println("ArrayOfNumbers[" + i + "] = " + array[i]);
        }
    }

    public void enterValuesOfArray(int size, int[] array, Scanner sc) {
        for (int i = 0; i < size; i++) {
            System.out.print("ArrayOfNumbers[" + i + "] = ");
            array[i] = sc.nextInt();
        }
    }
}
