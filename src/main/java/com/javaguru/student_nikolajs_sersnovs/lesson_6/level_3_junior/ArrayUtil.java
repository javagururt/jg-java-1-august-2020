package com.javaguru.student_nikolajs_sersnovs.lesson_6.level_3_junior;


import java.util.Arrays;

import static java.util.Arrays.binarySearch;

class ArrayUtil {
    /*
    Добавьте в класс ArrayUtil метод для проверки содержит ли массив целых чисел указанное число.
     */
    public int Contain(int[] array, int searchNumber) {
        Arrays.sort(array);
        int number = binarySearch(array, searchNumber);
        System.out.println(Arrays.toString(array));
        System.out.println("Array contains number " + searchNumber + " in index " + number);

        return searchNumber;
    }

    /*
    Добавьте в класс ArrayUtil метод для проверки сколько раз содержит массив целых чисел указанное число.
    */
    public int Repeating(int[] array, int repeatingNumber) {
        System.out.println(Arrays.toString(array));
        int number = binarySearch(array, repeatingNumber);
        System.out.println("Number repeating: " + repeatingNumber + " | " + number + " times");
        return number;
    }

    /*
    Добавьте в класс ArrayUtil метод для замены первого вхождения указанного числа в массиве целых чисел на другое число.
     */
    public int replaceFirst(int[] array, int numberToReplace, int newNumber) {
        System.out.println(Arrays.toString(array));
        int number = binarySearch(array, numberToReplace);
        array[number] = newNumber;
        System.out.println(Arrays.toString(array));
        System.out.println("Replace Number is: " + numberToReplace + " | " + "New number " + newNumber);

        return number;
    }


    /*
  Добавьте в класс ArrayUtil метод для замены вхождений указанного числа в массиве целых чисел на другое число.
   */
    public int replaceAll(int[] array, int numberToReplace, int newNumber) {
        System.out.println(Arrays.toString(array));
        int number = binarySearch(array, numberToReplace);
        array[number] = newNumber;
        System.out.println(Arrays.toString(array));
        System.out.println("Replace Number is: " + numberToReplace + " | " + "New number " + newNumber);

        return number;
    }

    /*
    Добавьте в класс ArrayUtil метод для переворота массива целых чисел.
     */
    public int flippingAll(int[] array) {
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length / 2; i++) {
            int number = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = number;
        }
        System.out.println(Arrays.toString(array));
        return 0;
    }

    /*
    Добавьте в класс ArrayUtil метод для сортировки массива целых чисел.
     */
    public int sortAll(int[] array) {
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        return 0;
    }
}
















