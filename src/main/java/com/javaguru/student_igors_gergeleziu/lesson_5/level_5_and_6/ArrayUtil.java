package com.javaguru.student_igors_gergeleziu.lesson_5.level_5_and_6;

import java.util.Random;
import java.util.Scanner;

public class ArrayUtil {
    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101);
        }
    }

    public void printArrayToConsole(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Array[" + i + "] = " + array[i]);
        }
    }

    public int findMaxNumber(int[] array) {
        int maxValue = array[0];
        for (int element: array) {
            if (element > maxValue) {
                maxValue = element;
            }
        }
        return maxValue;
    }

    public int findMinNumber(int[] array) {
        int minValue = array[0];
        for (int element: array) {
            if (element < minValue) {
                minValue = element;
            }
        }
        return minValue;
    }

    public int getArrayLengthFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter length of array: ");
        return scanner.nextInt();
    }

    public void fillArray(int[] array) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print("Array[" + i + "] = ");
            array[i] = scanner.nextInt();
        }
    }

    public int[] newArrayWithRandomLength() {
        Random random = new Random();
        return new int[random.nextInt(24) + 1];
    }

    public void evenNumbersOfArray(int[] array) {
        System.out.println("Even numbers of array: ");
        for (int element: array) {
            if (element % 2 == 0) {
                System.out.println(element+" ");
            }
        }
        System.out.println(" ");
    }
    public void oddNumbersOfArray(int[] array) {
        System.out.println("Odd numbers of array: ");
        for (int element: array) {
            if (element % 2 != 0) {
                System.out.println(element+" ");
            }
        }
        System.out.println(" ");
    }
}
