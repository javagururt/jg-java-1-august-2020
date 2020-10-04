package com.javaguru.student_ivan_shulga.lesson_6.level_3_junior.Task_9;

// основа класса скопирована из задания lesson_5 -> level_5_middle дописаны текущие задачи из lesson_6

import java.util.Arrays;
import java.util.Random;

class ArrayUtil {


    public int[] sortingNumbersInArray(int[] array) {
        Arrays.sort(array);
        return array;
    }
// ^^^ lesson_6 -> level_4_junior -> Task_14 -> Добавьте в класс ArrayUtil метод для сортировки массива целых чисел.

    public int[] reverseAllIntegers(int[] array) {
        int[] newArray = new int[array.length];
        int i = 0;
        while (i < array.length) {
            newArray[i] = array[array.length - 1 - i];
            i++;
        } return newArray;
    }
// ^^^ lesson_6 -> level_3_junior -> Task_13 -> Добавьте в класс ArrayUtil метод для переворота массива целых чисел.

    public int replaceAllInteger(int[] array, int numberToReplace, int newNumber) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToReplace) {
                array[i] = newNumber;
            }
        } return newNumber;
    }
// ^^^ lesson_6 -> level_3_junior -> Task_12 -> Добавьте в класс ArrayUtil метод для замены вхождений указанного числа в массиве целых чисел на другое число.

    public int replaceInteger(int[] array, int numberToReplace, int newNumber) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToReplace) {
                array[i] = newNumber;
                break;
            }
        } return newNumber;
    }
// ^^^ lesson_6 -> level_3_junior -> Task_11 -> Добавьте в класс ArrayUtil метод для замены первого вхождения указанного числа в массиве целых чисел на другое число.

    public int integerCounter(int[] array, int number) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                counter++;
            }
        } return counter;
    }
// ^^^ lesson_6 -> level_3_junior -> Task_10 -> Добавьте в класс ArrayUtil метод для проверки сколько раз содержит массив целых чисел указынное число.


    public String findSpecifiedNumber(int[] array, int specifiedNumber) {
        for (int i = 0; i < array.length; i++) {
            if (specifiedNumber == array[i]) {
                return "Array contain your number!";
            }
        } return "Array not contain your number!";
    }
// ^^^ lesson_6 -> level_3_junior -> Task_9 -> Добавьте в класс ArrayUtil метод для проверки содержит ли массив целых чисел указанное число.


//-------------- здесь начинаются задачи из задания lesson_5 -> level_5_middle --------------\\
    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    } // ^^^ Task_31. Создайте класс ArrayUtil. Создайте в этом классе метод для создания массива целых чисел указанной длины.

    public void fillArrayWithRandomNumbers(int[] array) {
        Random randomInt = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = randomInt.nextInt(100);
        }
    } // ^^^ Task_33. Создайте в классе ArrayUtil метод для заполнения массива целых чисел случайными числами.

    public void printArrayToConsole(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + "  -->  " + array[i]);
        }
    } // ^^^ Task_35. Создайте в классе ArrayUtil метод для распечатки массива целых чисел на консоль.

    public int findMaxNumber(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        } return max;
    }// ^^^ Task_36. Создайте в классе ArrayUtil метод для нахождения максимального числа в массиве целых чисел.

    public int findMinNumber(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if ( min > array[i]) {
                min = array[i];
            }
        } return min;
    } // ^^^ Task_38. Создайте в классе ArrayUtil метод для нахождения минимального числа в массиве целых чисел.
//----------------- здесь заканчиваются задачи из задания lesson_5 -> level_5_middle ----------------\\
}
