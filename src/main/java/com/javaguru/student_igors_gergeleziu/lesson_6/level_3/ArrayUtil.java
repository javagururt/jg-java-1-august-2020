package com.javaguru.student_igors_gergeleziu.lesson_6.level_3;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayUtil {
    public boolean arrayContainsNumber(int[] arr, int findNumber) {
        boolean result = false;
        for (int number : arr) {
            if (number == findNumber) {
                result = true;
                break;
            }
        }
        return result;
    }

    public int arrayContainsNumberCount(int[] arr, int findNumber) {
        int countNumber = 0;
        for (int number : arr) {
            if (number == findNumber) {
                countNumber++;
            }
        }
        return countNumber;
    }

    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    public void fillArrayWithRandomNumbers(int[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(101);
        }
    }

    public void printArrayToConsole(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Array[" + i + "] = " + arr[i]);
        }
    }

    public int findMaxNumber(int[] arr) {
        int maxValue = arr[0];
        for (int element : arr) {
            if (element > maxValue) {
                maxValue = element;
            }
        }
        return maxValue;
    }

    public int findMinNumber(int[] arr) {
        int minValue = arr[0];
        for (int element : arr) {
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

    public void fillArray(int[] arr) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Array[" + i + "] = ");
            arr[i] = scanner.nextInt();
        }
    }

    public int[] newArrayWithRandomLength() {
        Random random = new Random();
        return new int[random.nextInt(24) + 1];
    }

    public void evenNumbersOfArray(int[] arr) {
        System.out.println("Even numbers of array: ");
        for (int element : arr) {
            if (element % 2 == 0) {
                System.out.println(element + " ");
            }
        }
        System.out.println(" ");
    }

    public void oddNumbersOfArray(int[] arr) {
        System.out.println("Odd numbers of array: ");
        for (int element : arr) {
            if (element % 2 != 0) {
                System.out.println(element + " ");
            }
        }
        System.out.println(" ");
    }

    public int[] newArrayOfIntegerNumbersFrom0To10() {
        int[] arrayTest = new int[11];
        for (int i = 0; i <= 10; i++) {
            arrayTest[i] = i;
        }
        return arrayTest;
    }

    public int[] newArrayOfIntegerNumbersFromUser(int number) {
        int[] arrayTest = new int[10];
        for (int i = 0; i < 10; i++) {
            arrayTest[i] = number;
        }
        return arrayTest;
    }

    public void replaceFirst(int[] arr, int numberToReplace, int newNumber) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToReplace) {
                arr[i] = newNumber;
                break;
            }
        }
    }

    void replaceAll(int[] arr, int numberToReplace, int newNumber) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToReplace) {
                arr[i] = newNumber;
            }
        }
    }

    public int[] reverseArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        return arr;
    }

    public int returnIndexOfNumberInArray(int[] arr, int findNumber) {
        int indexOfNumber = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == findNumber) {
                indexOfNumber = i;
                break;
            }
        }
        return indexOfNumber;
    }

    public int[] sortArray(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }

    public boolean arraysCorrectSortCheck(int[] arr) {
        boolean correctSort = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                correctSort = false;
                break;
            }
        }
        return correctSort;
    }

    public void checkResults(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = Success");
        } else {
            System.out.println(testName + " = Fail");
        }
    }

}
