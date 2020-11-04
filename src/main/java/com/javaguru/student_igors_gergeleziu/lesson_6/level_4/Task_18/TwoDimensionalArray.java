package com.javaguru.student_igors_gergeleziu.lesson_6.level_4.Task_18;

import java.util.Random;

public class TwoDimensionalArray {

    public int[][] createTwoDimensionalArray(int arrayLength) {
        return new int[arrayLength][arrayLength];
    }

    public void fillTwoDimensionalArrayWithNumbers3(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = 3;
            }
        }
    }

    public void fillTwoDimensionalArrayWithRandomNumbers(int[][] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = random.nextInt(101);
            }
        }
    }

    public void printTwoDimensionalArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("");
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
        System.out.println("");
    }

    public int sumOfTwoDimensionalArrayNumbers(int[][] arr) {
        int sumOfNumbers = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                sumOfNumbers += arr[i][j];
            }
        }
        return sumOfNumbers;
    }

    public void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = Success");
        } else {
            System.out.println(testName + " = Fail");

        }
    }
}
