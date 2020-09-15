package com.javaguru.student_igors_jurkovs.lesson_5.level_5_and_6_middle;

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
        arrayUtil.test(!(arrayUtil.testWithLoopToFindMin(array, result)), "Find min number");

    }

    boolean isArrayCreated() {
        return array.length == length;
    }
}
