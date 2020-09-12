package com.javaguru.student_igors_jurkovs.lesson_5.level_5_and_6_middle;

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

    void test(boolean condition, String action) {
        if (condition) {
            System.out.println(action + " test: OK");
        } else {
            System.out.println(action + " test: FAILED");
        }
    }

    boolean testWithLoopToFindMax(int[] array, int result) {
        boolean isGreater = false;
        for (int ar : array) {
            if (ar > result) {
                isGreater = true;
                break;
            }
        }
        return isGreater;
    }

    boolean testWithLoopToFindMin(int[] array, int result) {
        boolean isLesser = false;
        for (int ar : array) {
            if (ar < result) {
                isLesser = true;
                break;
            }
        }
        return isLesser;
    }

    boolean testWithLoopToCheckIsArrayFull(int[] array) {
        boolean empty = false;
        for (Integer ar : array) {
            if (ar != null) {
                empty = true;
                break;
            }
        }
        return empty;
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

    private final int length = 10;
    private final ArrayUtil arrayUtil = new ArrayUtil();
    private final int[] array = arrayUtil.createArray(length);

    public static void main(String[] args) {


        ArrayUtilTest createArrayTest = new ArrayUtilTest();
        createArrayTest.createArrayTest();
        createArrayTest.fillArrayWithRandomNumbersTest();
        createArrayTest.printArrayToConsoleTest();
        createArrayTest.findMaxNumberTest();
        createArrayTest.findMinNumberTest();

    }

    void createArrayTest() {
        arrayUtil.test(isArrayCreated(), "Array creation");
    }

    void fillArrayWithRandomNumbersTest() {
        arrayUtil.fillArrayWithRandomNumbers(array);
        arrayUtil.test(arrayUtil.testWithLoopToCheckIsArrayFull(array), "Array is filled with number");

    }

    void printArrayToConsoleTest() {
        arrayUtil.printArrayToConsole(array);
    }

    void findMaxNumberTest() {
        int result = arrayUtil.findMaxNumber(array);
        arrayUtil.test(!(arrayUtil.testWithLoopToFindMax(array, result)), "Find max number");
    }

    void findMinNumberTest() {
        int result = arrayUtil.findMinNumber(array);
        arrayUtil.test(!(arrayUtil.testWithLoopToFindMin(array, result)), "Fin min number");

    }

    boolean isArrayCreated() {
        return array.length == length;
    }
}