package com.javaguru.student_ivan_shulga.lesson_5.level_5_middle;

//
// Здесь задания lesson_5 - level_5_middle и level_6_middle

import java.util.Arrays;

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFillArrayWithRandomNumbers();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    public void shouldCreateArray() {
        ArrayUtil arrayTest = new ArrayUtil();
        int[] array = arrayTest.createArray(9);
        int expectedResult = 9;
        if (array.length == expectedResult) {
            System.out.println("shouldCreateArray ---> SUCCESSFUL! ---> array contains " + array.length + " cells " + " ---> " + "expected result " + expectedResult + " cells.");
        } else {
            System.out.println("shouldCreateArray ---> FAILED! ---> array contains " + array.length + " cells " + " ---> " + "expected result " + expectedResult + " cells.");
        }
    } //^^^ Task_32. Создайте класс ArrayUtilTest. В этом классе напишите автоматический тест метода int[] createArray(int arrayLength) из предыдущего задания.

    public void shouldFillArrayWithRandomNumbers() {
        // Write test implementation here !!!
    }  // ^^^ Task_34. В классе ArrayUtilTest напишите автоматический тест метода void fillArrayWithRandomNumbers(int[] array) из предыдущего задания.

    public void shouldFindMaxNumber() {
        ArrayUtil arrayTest = new ArrayUtil();
        int[] array = {5, 4, 3, 2, 1};
        int actualResult = arrayTest.findMaxNumber(array);
        int expectedResult = 5;
        if (actualResult == expectedResult) {
            System.out.println("shouldFindMaxNumber ---> SUCCESSFUL! ---> " + "in an array of numbers " + Arrays.toString(array) + " ---> " + expectedResult + " is MaxNumber.");
        } else {
            System.out.println("shouldFindMaxNumber ---> FAILED! ---> " + " actualResult = " + actualResult + " ---> expectedResult = " + expectedResult);
        }
    } // ^^^ Task_37. В классе ArrayUtilTest напишите автоматический тестдля метода int findMaxNumber(int[] array) из предыдущего задания.

    public void shouldFindMinNumber() {
        ArrayUtil arrayTest = new ArrayUtil();
        int[] array = {5, 4, 3, 2, 1};
        int actualResult = arrayTest.findMinNumber(array);
        int expectedResult = 1;
        if (actualResult == expectedResult) {
            System.out.println("shouldFindMinNumber ---> SUCCESSFUL! ---> " + "in an array of numbers " + Arrays.toString(array) + " ---> " + expectedResult + " is MinNumber.");
                } else {
                    System.out.println("shouldFindMinNumber ---> FAILED! ---> " + " actualResult = " + actualResult + " ---> expectedResult = " + expectedResult);
        }
    } // ^^^ Task_39. В классе ArrayUtilTest напишите автоматический тест для метода int findMinNumber(int[] array) из предыдущего задания.

}
