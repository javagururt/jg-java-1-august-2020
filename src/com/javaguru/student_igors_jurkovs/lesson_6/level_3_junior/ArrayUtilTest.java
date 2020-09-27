package com.javaguru.student_igors_jurkovs.lesson_6.level_3_junior;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Arrays;
@CodeReview(approved = true)
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
        createArrayTest.isInArraySuchNumberTest();
        createArrayTest.numberRepeatTest();
        createArrayTest.replaceTest();
        createArrayTest.replaceAllTest();
        createArrayTest.reverseOrderTest();
        createArrayTest.printArrayToConsoleTest();
        createArrayTest.sortArrayTest();
        createArrayTest.printArrayToConsoleTest();


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
        arrayUtil.test(!(arrayUtil.testWithLoopToFindMin(array, result)), "Find min number");

    }

    void isInArraySuchNumberTest() {
        boolean result = arrayUtil.isInArraySuchNumber(array, 55);
        arrayUtil.test(!result, "IsInArraySuchNumber");
    }

    void numberRepeatTest() {
        int result = arrayUtil.numberRepeat(array, 3);
        arrayUtil.test(result == 1, "Number repeat");
    }

    void replaceTest() {
        arrayUtil.replace(array, 5, 3);
        int result = arrayUtil.numberRepeat(array, 3);
        arrayUtil.test(result == 2, "Replace");
    }

    void replaceAllTest() {
        arrayUtil.replaceAll(array, 3, 1);
        int result = arrayUtil.numberRepeat(array, 1);
        arrayUtil.test(result == 3, "ReplaceAll");
    }

    void reverseOrderTest() {
        int[] check = {9, 8, 7, 6, 1, 4, 1, 2, 1, 0};
        arrayUtil.test(Arrays.toString(arrayUtil.reverseOrder(array)).equals(Arrays.toString(check)), "Reverse order");
    }

    void sortArrayTest() {
        int[] check = {0, 1, 1, 1, 2, 4, 6, 7, 8, 9};
        int[] result = arrayUtil.sortArray(array);
        arrayUtil.test(Arrays.equals(result, check), "Array sort");
    }

    boolean isArrayCreated() {
        return array.length == length;
    }
}
