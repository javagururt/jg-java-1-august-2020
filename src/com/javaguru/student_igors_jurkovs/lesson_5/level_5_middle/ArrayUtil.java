package com.javaguru.student_igors_jurkovs.lesson_5.level_5_middle;

import java.util.Arrays;

/*
Создайте класс ArrayUtil.
Создайте в этом классе метод для создания
массива целых чисел указанной длины.
 */
/*
Создайте в классе ArrayUtil метод для
заполнения массива целых чисел случайными числами.
 */
class ArrayUtil {

    int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    void fillArrayWithRandomNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
    }

    /*
    Создайте в классе ArrayUtil метод для
    распечатки массива целых чисел на консоль.
    */
    void printArrayToConsole(int[] array) {
        for (int ar : array) {
            System.out.println(ar);
        }
    }

    /*
    Создайте в классе ArrayUtil метод для
    нахождения максимального числа в массиве целых чисел.
     */
    int findMaxNumber(int[] array) {
        Arrays.sort(array);
        return array[array.length - 1];
    }

    /*
    Создайте в классе ArrayUtil метод для
    нахождения минимального числа в массиве целых чисел.
     */
    int findMinNumber(int[] array) {
        Arrays.sort(array);
        return array[0];
    }
}

/*
Создайте класс ArrayUtilTest.
В этом классе напишите автоматический тест
метода int[] createArray(int arrayLength)
из предыдущего задания.
 */
/*
В классе ArrayUtilTest напишите автоматический тест
метода void fillArrayWithRandomNumbers(int[] array)
из предыдущего задания.
 */

class ArrayUtilTest {

    private int length = 5;
    private ArrayUtil arrayUtil = new ArrayUtil();
    private int[] array = arrayUtil.createArray(length);

    public static void main(String[] args) {


        ArrayUtilTest createArrayTest = new ArrayUtilTest();
        createArrayTest.createArrayTest();
        createArrayTest.fillArrayWithRandomNumbersTest();
        createArrayTest.printArrayToConsoleTest();
        createArrayTest.findMaxNumberTest();
        createArrayTest.findMinNumberTest();

    }

    void createArrayTest() {
        if (array.length == 5) {
            System.out.println("ArrayUtil test : OK");
        } else {
            System.out.println("ArrayUtil test : FAILED");
        }
    }

    void fillArrayWithRandomNumbersTest() {
        arrayUtil.fillArrayWithRandomNumbers(array);
        boolean empty = true;
        for (Integer ar : array) {
            if (ar != null) {
                empty = false;
                break;
            }
        }
        if (array.length > 0 && !empty) {
            System.out.println("Array not empty");
        } else {
            System.out.println("Array empty");
        }
    }

    void printArrayToConsoleTest() {
        arrayUtil.printArrayToConsole(array);
    }

    void findMaxNumberTest() {
        int result = arrayUtil.findMaxNumber(array);
        boolean isGreater = false;
        for (int ar : array) {
            if (ar > result) {
                isGreater = true;
                break;
            }
        }
        if (isGreater) {
            System.out.println("FindMaxNumber test: FAILED");
        } else {
            System.out.println("FindMaxNumber test: OK");
        }
    }

    void findMinNumberTest() {
        int result = arrayUtil.findMinNumber(array);
        boolean isLesser = false;
        for (int ar : array) {
            if (ar < result) {
                isLesser = true;
                break;
            }
        }
        if (isLesser) {
            System.out.println("FindMinNumber test: FAILED");
        } else {
            System.out.println("FindMinNumber test: OK");
        }
    }

}